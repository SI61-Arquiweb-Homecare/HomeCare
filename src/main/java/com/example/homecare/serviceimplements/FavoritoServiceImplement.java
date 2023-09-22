package com.example.homecare.serviceimplements;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.homecare.entities.Favorito;
import com.example.homecare.repositories.IFavoritoRepository;
import com.example.homecare.serviceinterfaces.IFavoritoService;

@Service
public class FavoritoServiceImplement implements IFavoritoService{
    @Autowired
    private IFavoritoRepository fR;

    @Override
    public void insert(Favorito favorito) {fR.save(favorito);}

    @Override
    public List<Favorito> list() {return fR.findAll();}

    @Override
    public void delete(int idFavorito) {fR.deleteById(idFavorito);}
}
