package com.jesus.microservicios.app.examenes.microservicios_examenes.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.jesus.microservicios.app.examenes.microservicios_examenes.models.entity.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Long>{

}
