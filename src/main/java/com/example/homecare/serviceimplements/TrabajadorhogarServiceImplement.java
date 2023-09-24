package com.example.homecare.serviceimplements;

import com.example.homecare.dtos.TrabajadoredadpromedioDto;
import com.example.homecare.entities.Trabajadorhogar;
import com.example.homecare.repositories.ITrabajadorhogarRepository;
import com.example.homecare.serviceinterfaces.ITrabajadorhogarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrabajadorhogarServiceImplement implements ITrabajadorhogarService {
    @Autowired
    private ITrabajadorhogarRepository tR;
    @Override
    public void insertar(Trabajadorhogar trabajadorhogar) {
        tR.save(trabajadorhogar);
    }
    @Override
    public List<Trabajadorhogar> listar() {
        return tR.findAll();
    }

    @Override
    public void delete(int id) {
        tR.deleteById(id);
    }

    @Override
    public Trabajadorhogar ListId(int id) {
        return tR.findById(id).orElse(new Trabajadorhogar());
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
