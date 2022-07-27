package com.idat.AlumnoPruebaIIE.service;

import java.util.List;

import com.idat.AlumnoPruebaIIE.model.Aula;

public interface AulaService {
	
	List<Aula> listar();
	Aula obtenerId(Integer id);
	void guardar(Aula aula);
	void eliminar(Integer id);
	void actualizar(Aula aula);
	
}
