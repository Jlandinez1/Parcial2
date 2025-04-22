package com.example.Parcial2Landinez.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Parcial2Landinez.entidad.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String> {
    Coordinador findByNombreUsuario(String nombreUsuario);
}