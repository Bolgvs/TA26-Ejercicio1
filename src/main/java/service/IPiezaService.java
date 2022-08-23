package service;

import java.util.List;

import dto.Pieza;

public interface IPiezaService {
	
	public List<Pieza> listarPieza(); 
	
	public Pieza guardarPieza(Pieza piezas);
	
	public Pieza pieza(int id); 
	
	public Pieza actualizarPieza(Pieza pieza); 
	
	public void eliminarPieza(int id);
	
}
