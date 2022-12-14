package com.idat.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.Model.Turista;
import com.idat.Repository.TuristaRepository;


@Service
public class TuristaServiceImpl implements TuristaService{
	
	@Autowired
	private TuristaRepository repository;

	@Override
	public List<Turista> listarTurista() {
		return repository.findAll();
	}

	@Override
	public void guardarTurista(Turista turista) {
		// TODO Auto-generated method stub
		
	}
}


	
