package com.example.swplanetapi.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface PlanetRepository extends JpaRepository<Planet, Long>, QueryByExampleExecutor<Planet> {

    Optional<Planet> findByName(String name);

    @Override
    <S extends Planet> List<S> findAll(Example<S> example);

}
