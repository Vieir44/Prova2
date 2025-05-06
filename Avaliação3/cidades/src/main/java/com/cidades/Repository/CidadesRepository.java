package com.cidades.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cidades.Entities.Cidades;

public interface CidadesRepository extends JpaRepository<Cidades, Long> {

}
