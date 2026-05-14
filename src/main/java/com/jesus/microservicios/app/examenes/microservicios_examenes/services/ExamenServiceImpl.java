package com.jesus.microservicios.app.examenes.microservicios_examenes.services;

import org.springframework.stereotype.Service;

import com.jesus.microservicios.app.examenes.microservicios_examenes.models.entity.Examen;
import com.jesus.microservicios.app.examenes.microservicios_examenes.models.repository.ExamenRepository;
import com.jesus.microservicios.commons.commons_microservicios.services.CommonServiceImpl;

@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository>implements ExamenService{

}
