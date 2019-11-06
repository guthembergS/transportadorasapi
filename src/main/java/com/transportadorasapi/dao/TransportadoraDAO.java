package com.transportadorasapi.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.transportadorasapi.model.Transportadora;

public interface TransportadoraDAO {

	long saveTransportadora(Transportadora transportadora);
	
	Transportadora getTransportadora(long idTransportadora);
	
	List<Transportadora> listTransportadora();
	
	void updateTransportadora(Long idTransportadora, Transportadora transportadora);
	
	void deleteTransportadora(Long idTransportadora);
	
}
