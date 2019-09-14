package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Config;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Integer>  {

}
