package com.example.homecare.controllers;

import com.example.homecare.entities.Tiposervicio;
import com.example.homecare.serviceinterfaces.ITiposervicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/tiposervicio")
public class TiposervicioController {
    @Autowired
    private ITiposervicioService tiService;

    @PostMapping
    public void registrar(@RequestBody Tiposervicio ti) {tiService.insert(ti);}

    @GetMapping
    public List<Tiposervicio> listar() {return tiService.list();}

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {tiService.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Tiposervicio ti) {tiService.insert(ti);}

    @PostMapping("/buscar")
    public List<Tiposervicio> buscar(@RequestBody String nombre) throws ParseException {
        List<Tiposervicio> listaTiposervicio;
        listaTiposervicio = tiService.search(nombre);
        return listaTiposervicio;
    }

    @GetMapping("/{id}")
    public Optional<Tiposervicio> listarId(@PathVariable("id") Integer id){return tiService.listarId(id);}

}
