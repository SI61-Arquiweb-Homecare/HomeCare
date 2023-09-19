package com.example.homecare.repositories;

import com.example.homecare.entities.Tipodocumento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITipodocumentoRepository extends JpaRepository<Tipodocumento, Integer>{
}
