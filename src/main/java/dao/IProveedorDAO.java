package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Proveedor;

public interface IProveedorDAO extends JpaRepository<Proveedor, Integer>{

}