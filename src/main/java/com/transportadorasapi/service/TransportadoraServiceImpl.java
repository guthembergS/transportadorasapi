package com.transportadorasapi.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.transportadorasapi.dao.TransportadoraDAO;
import com.transportadorasapi.model.Transportadora;

@Service
@Component("TransportadoraServiceImpl")
public class TransportadoraServiceImpl implements TransportadoraService {

	@Autowired
	private TransportadoraDAO transportadoraDAO;
	
	@Override
	@Transactional
	public long saveTransportadora(Transportadora transportadora) {
		return transportadoraDAO.saveTransportadora(transportadora);
	}

	@Override
	@Transactional
	public Transportadora getTransportadora(long idTransportadora) {
		return transportadoraDAO.getTransportadora(idTransportadora);
	}

	@Override
	@Autowired
	public List<Transportadora> listTransportadora() {
		return transportadoraDAO.listTransportadora();
	}

	@Override
	@Transactional
	public void updateTransportadora(Long idTransportadora, Transportadora transportadora) {
		transportadoraDAO.updateTransportadora(idTransportadora, transportadora);
		
	}

	@Override
	@Transactional
	public void deleteTransportadora(Long idTransportadora) {
		transportadoraDAO.deleteTransportadora(idTransportadora);
	}

}
