package com.example.homecare.serviceimplements;

import com.example.homecare.dtos.TrabajadoredadpromedioDto;
import com.example.homecare.entities.Trabajadorhogar;
import com.example.homecare.repositories.ITrabajadorhogarRepository;
import com.example.homecare.serviceinterfaces.ITrabajadorhogarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TrabajadorhogarServiceImplement implements ITrabajadorhogarService {
    @Autowired
    private ITrabajadorhogarRepository tR;

    @Override
    public void insert(Trabajadorhogar trabajadorhogar) {
        tR.save(trabajadorhogar);
    }

    @Override
    public List<Trabajadorhogar> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int id){
        tR.deleteById(id);
    }

    @Override
    public Optional<Trabajadorhogar> listarId(int idTrabajador){
        return Optional.of(tR.findById(idTrabajador).orElse(new Trabajadorhogar()));
    }
    @Override
    public List<Trabajadorhogar> search(String nombre){return tR.search(nombre);
    }

    @Override
    public List<Trabajadorhogar> buscarnombre(String nombre) {
        return tR.findByNombre(nombre);
    }

    @Override
    public List<TrabajadoredadpromedioDto> reporte04() {
        List<String[]> promedioedad = tR.promedioedad();
        List<TrabajadoredadpromedioDto> TrabajadoredadpromedioDtos = new ArrayList<>();
        for (String[] data : promedioedad) {
            TrabajadoredadpromedioDto dto = new TrabajadoredadpromedioDto();
            dto.setCounttrabajadores(Integer.parseInt(data[1]));
            dto.setPromedioedad(Double.parseDouble(data[0]));
            TrabajadoredadpromedioDtos.add(dto);
        }
        return TrabajadoredadpromedioDtos;
    }
}
