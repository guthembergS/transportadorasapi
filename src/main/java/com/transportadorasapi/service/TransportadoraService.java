package com.transportadorasapi.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.transportadorasapi.model.Transportadora;

public interface TransportadoraService {

long saveTransportadora(Transportadora transportadora);
	
	Transportadora getTransportadora(long idTransportadora);
	
	List<Transportadora> listTransportadora();
	
	void updateTransportadora(Long idTransportadora, Transportadora transportadora);
	
	void deleteTransportadora(Long idTransportadora);
}
