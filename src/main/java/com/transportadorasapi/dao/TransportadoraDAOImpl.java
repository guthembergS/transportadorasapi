package com.transportadorasapi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.transportadorasapi.model.Transportadora;

@Repository
@Transactional
public class TransportadoraDAOImpl implements TransportadoraDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
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
	public List<Transportadora> listTransportadora() {
		
		List<Transportadora> list =  sessionFactory.getCurrentSession().createQuery("from Transportadora").list();
		return list;
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
