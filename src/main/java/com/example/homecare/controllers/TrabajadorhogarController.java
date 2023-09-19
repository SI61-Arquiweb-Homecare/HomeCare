package com.example.homecare.controllers;

import com.example.homecare.entities.Trabajadorhogar;
import com.example.homecare.serviceinterfaces.ITrabajadorhogarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/trabajadorhogar")
public class TrabajadorhogarController {
    @Autowired
    private ITrabajadorhogarService tService;

    @PostMapping
    public void registrar(@RequestBody Trabajadorhogar t){
        tService.insert(t);
    }

    @GetMapping
    public List<Trabajadorhogar> listar() {return tService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tService.delete(id);
    }
    @PutMapping
    public void modificar(@RequestBody Trabajadorhogar t){
        tService.insert(t);
    }
    @PostMapping("/buscar")
    public List<Trabajadorhogar> buscar(@RequestBody String nombre) throws ParseException {
        List<Trabajadorhogar> listaTrabajadores;
        listaTrabajadores = tService.search(nombre);
        return listaTrabajadores;

    }
    @GetMapping("/{id}")
    public Optional<Trabajadorhogar> listarId(@PathVariable("id") Integer id){
        return  tService.listarId(id);
    }

    @PostMapping("/buscarnombre")
    public List<Trabajadorhogar> buscarnombre(@RequestBody String nombre) {return  tService.buscarnombre(nombre);}
}
