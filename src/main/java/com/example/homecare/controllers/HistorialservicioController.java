package com.example.homecare.controllers;

import com.example.homecare.entities.Historialservicio;
import com.example.homecare.serviceinterfaces.IHistorialservicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/historialservicio")
public class HistorialservicioController {
    @Autowired
    private IHistorialservicioService hService;

    @PostMapping
    public void registrar(@RequestBody Historialservicio h){ hService.Insert(h);}

    @GetMapping
    public List<Historialservicio> list() {return hService.list();}

    @DeleteMapping("/{id}")
    public void eliminate(@PathVariable("id")Integer id){hService.delete(id);}

    @PutMapping
    public void modificar(@RequestBody Historialservicio historialservicio) {hService.Insert(historialservicio);}

    @PostMapping("/buscar")
    public List<Historialservicio> buscar(@RequestBody Historialservicio historialservicio){
        List<Historialservicio> lista;
        historialservicio.setObservaciones(historialservicio.getObservaciones());
        lista=hService.search(historialservicio.getObservaciones());
        return lista;
    }

    @GetMapping("/{id}")
    public Optional<Historialservicio> ListarId(@PathVariable("id") Integer id)
    {
        return hService.ListarId(id);
    }
}
