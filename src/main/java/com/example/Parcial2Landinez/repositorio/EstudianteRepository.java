package com.example.Parcial2Landinez.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Parcial2Landinez.entidad.Estudiante;

import java.util.List; // Asegúrate de tener esto

public interface EstudianteRepository extends MongoRepository<Estudiante, String> {
    Estudiante findByNumeroDocumento(String numeroDocumento);
    List<Estudiante> findAllByOrderByPuntajeDesc();
}