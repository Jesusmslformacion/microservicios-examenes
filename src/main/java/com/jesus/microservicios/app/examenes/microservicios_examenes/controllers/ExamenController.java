package com.jesus.microservicios.app.examenes.microservicios_examenes.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jesus.microservicios.app.examenes.microservicios_examenes.models.entity.Examen;
import com.jesus.microservicios.app.examenes.microservicios_examenes.services.ExamenService;
import com.jesus.microservicios.commons.commons_microservicios.controllers.CommonController;

@RestController
public class ExamenController extends CommonController<Examen, ExamenService>{

    @PutMapping("{id}")
    public ResponseEntity<?> editar(@RequestBody Examen examen, @PathVariable Long id) {

        return null;
    }

}
