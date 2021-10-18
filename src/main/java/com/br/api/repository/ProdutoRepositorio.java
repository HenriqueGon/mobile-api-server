package com.br.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.api.entity.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{

}
