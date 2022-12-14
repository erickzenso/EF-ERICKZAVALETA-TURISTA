package com.idat.Service;

import java.util.List;

import com.idat.Model.Turista;

public interface TuristaService {
	List<Turista> listarTurista();
	void guardarTurista(Turista turista);

}
