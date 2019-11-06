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
	public long saveTransportadora(Transportadora transportadora) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Transportadora getTransportadora(long idTransportadora) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Autowired
	public List<Transportadora> listTransportadora() {
		return transportadoraDAO.listTransportadora();
	}

	@Override
	public void updateTransportadora(Long idTransportadora, Transportadora transportadora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTransportadora(Long idTransportadora) {
		// TODO Auto-generated method stub
		
	}

}
