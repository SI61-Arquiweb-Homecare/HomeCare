package com.example.homecare.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.homecare.entities.Estadoservicio;
import com.example.homecare.serviceinterfaces.IEstadoServicioService;

@RestController
@RequestMapping("/estadoservicio")
public class EstadoServicioController {
    @Autowired
    private IEstadoServicioService EsS;

    @PostMapping
    public void insert(@RequestBody Estadoservicio Z ){ EsS.insert(Z);}
    
}
