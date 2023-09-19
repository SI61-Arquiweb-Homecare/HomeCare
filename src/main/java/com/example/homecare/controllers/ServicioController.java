package com.example.homecare.controllers;


import com.example.homecare.entities.Servicio;
import com.example.homecare.serviceinterfaces.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/servicio")
public class ServicioController {
    @Autowired
    private IServicioService sService;

    @PostMapping
    public void registar(@RequestBody Servicio s){
        sService.Insert(s);
    }

    @GetMapping
    public List<Servicio> listar() {return sService.list();}

    @DeleteMapping("/{id}")
    public void eliminate(@PathVariable("id") Integer id){sService.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Servicio servicio) {sService.Insert(servicio);}

    @GetMapping("/{id}")
    public Optional<Servicio> listarId(@PathVariable("id") Integer id) {
        return sService.ListarId(id);
    }
}
