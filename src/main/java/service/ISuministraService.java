package service;

import java.util.List;

import dto.Suministra;

public interface ISuministraService {
	
	public List<Suministra> listarSuministros();
	
	public Suministra guardarSuministra(Suministra suministra);
	
	public Suministra suministra(int id);
	
	public Suministra actualizarSuministra(Suministra suministra);
	
	public void eliminarSuministra(int id);
}
