package com.example.homecare.serviceimplements;

import com.example.homecare.entities.Tipodocumento;
import com.example.homecare.repositories.ITipodocumentoRepository;
import com.example.homecare.serviceinterfaces.ITipodocumentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipodocumentoServiceImplement implements ITipodocumentoService {
    @Autowired
    private ITipodocumentoRepository tidoR;

    @Override
    public void insert(Tipodocumento tipodocumento) {
        tidoR.save(tipodocumento);
    }
    @Override
    public List<Tipodocumento> list(){
        return tidoR.findAll();
    }

    @Override
    public void delete(int id) {
        tidoR.deleteById(id);
    }

    @Override
    public Tipodocumento ListId(int idAuthor) {
        return tidoR.findById(idAuthor).orElse(new Tipodocumento());
    }
}
