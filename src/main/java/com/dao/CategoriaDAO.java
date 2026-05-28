package com.dao;

import com.distribuida.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriaDAO extends JpaRepository<Categoria,Integer>{

    Categoria findCategoria(String categoria);
}
