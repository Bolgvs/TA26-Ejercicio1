package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Pieza;

public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{

}