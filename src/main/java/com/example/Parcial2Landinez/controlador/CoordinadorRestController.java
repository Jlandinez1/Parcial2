package com.example.Parcial2Landinez.controlador;

import com.example.Parcial2Landinez.entidad.Coordinador;
import com.example.Parcial2Landinez.repositorio.CoordinadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/coordinadores")
public class CoordinadorRestController {

    @Autowired
    private CoordinadorRepository coordinadorRepository;

    // Registrar un nuevo coordinador
    @PostMapping("/registrar")
    public Coordinador registrarCoordinador(@RequestBody Coordinador coordinador) {
        if (coordinadorRepository.findByNombreUsuario(coordinador.getNombreUsuario()) != null) {
            throw new RuntimeException("El nombre de usuario ya está registrado");
        }
        return coordinadorRepository.save(coordinador);
    }

    // Inicio de sesión del coordinador
    @PostMapping("/login")
    public Coordinador iniciarSesion(@RequestParam String nombreUsuario, @RequestParam String contrasena) {
        Coordinador coordinador = coordinadorRepository.findByNombreUsuario(nombreUsuario);
        if (coordinador != null && coordinador.getContrasena().equals(contrasena)) {
            return coordinador;
        }
        throw new RuntimeException("Credenciales inválidas");
    }
}