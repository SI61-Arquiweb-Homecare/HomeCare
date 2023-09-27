package com.example.homecare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homecare.entities.Favorito;

@Repository
public interface IFavoritoRepository extends JpaRepository<Favorito,Integer>{
}
