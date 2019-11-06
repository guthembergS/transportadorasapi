package com.transportadorasapi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
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
		sessionFactory.getCurrentSession().save(transportadora);
		return transportadora.getIdTransportadora();
		
	}

	@Override
	public Transportadora getTransportadora(long idTransportadora) {
		return sessionFactory.getCurrentSession().get(Transportadora.class, idTransportadora);
	}

	@Override
	public List<Transportadora> listTransportadora() {
		
		List<Transportadora> list =  sessionFactory.getCurrentSession().createQuery("from Transportadora").list();
		return list;
	}

	@Override
	public void updateTransportadora(Long idTransportadora, Transportadora transportadora) {
		Session session = sessionFactory.getCurrentSession();
		Transportadora oldTransportadora = session.byId(Transportadora.class).load(idTransportadora);
		oldTransportadora.setNome(transportadora.getNome());
		oldTransportadora.setEmpresa(transportadora.getEmpresa());
		oldTransportadora.setTelefone(transportadora.getTelefone());
		oldTransportadora.setEmail(transportadora.getEmail());
		oldTransportadora.setRua(transportadora.getRua());
		oldTransportadora.setBairro(transportadora.getBairro());
		oldTransportadora.setCidade(transportadora.getCidade());
		oldTransportadora.setNumero(transportadora.getNumero());
		oldTransportadora.setUf(transportadora.getUf());
		session.flush();

	}

	@Override
	public void deleteTransportadora(Long idTransportadora) {
		Session session = sessionFactory.getCurrentSession();
		Transportadora transportadoraDelete = session.byId(Transportadora.class).load(idTransportadora);
		session.delete(transportadoraDelete);
	}

}
