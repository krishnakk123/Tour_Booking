package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Studentmodel;

@Repository
public interface Studentrepository extends JpaRepository<Studentmodel,Integer> {

}
