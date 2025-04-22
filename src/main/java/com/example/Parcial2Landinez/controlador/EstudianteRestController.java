package com.example.Parcial2Landinez.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Parcial2Landinez.entidad.Estudiante;
import com.example.Parcial2Landinez.repositorio.EstudianteRepository;


import java.util.List;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteRestController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    // Obtener todos los estudiantes
    @GetMapping
    public List<Estudiante> obtenerTodosLosEstudiantes() {
        return estudianteRepository.findAll();
    }

    // Obtener un estudiante por número de documento
    @GetMapping("/{numeroDocumento}")
    public Estudiante obtenerEstudiantePorDocumento(@PathVariable String numeroDocumento) {
        return estudianteRepository.findByNumeroDocumento(numeroDocumento);
    }

    // Ranking de estudiantes
    @GetMapping("/ranking")
    public List<Estudiante> obtenerRankingEstudiantes() {
        return estudianteRepository.findAllByOrderByPuntajeDesc();
    }

    // Posición individual en el ranking
    @GetMapping("/ranking/{numeroDocumento}")
    public int obtenerPosicionRanking(@PathVariable String numeroDocumento) {
        List<Estudiante> ranking = estudianteRepository.findAllByOrderByPuntajeDesc();
        for (int i = 0; i < ranking.size(); i++) {
            if (ranking.get(i).getNumeroDocumento().equals(numeroDocumento)) {
                return i + 1; // Posición en el ranking
            }
        }
        throw new RuntimeException("Estudiante no encontrado en el ranking");
    }
}