package com.transportadorasapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.transportadorasapi.model.Transportadora;
import com.transportadorasapi.service.TransportadoraService;

@RestController
public class TransportadoraController {

	@Qualifier("TransportadoraServiceImpl")
	@Autowired(required = true)
	public TransportadoraService transportadoraService;
	
	
	@GetMapping("/api/transportadora")
	public ResponseEntity<List<Transportadora>> listTransportadora(){
		List<Transportadora> list = transportadoraService.listTransportadora();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping("/api/transportadora")
	public ResponseEntity<?> saveTransportadora(@RequestBody Transportadora transportadora){
		long idTransportadora = transportadoraService.saveTransportadora(transportadora);
		return ResponseEntity.ok().body("Transportadora salva com sucesso - idTransportadora: "+idTransportadora);
	}
	
	@GetMapping("/api/transportadora/{idTransportadora}")
	public ResponseEntity<Transportadora> getTransportadoraId(@PathVariable("idTransportadora") long idTransportadora){
		Transportadora transportadora = transportadoraService.getTransportadora(idTransportadora);
		return ResponseEntity.ok().body(transportadora);
	}
	
	@PostMapping("/api/transportadora/{idTransportadora}")
	public ResponseEntity<?> updateTransportadora(@PathVariable("idTransportadora") long idTransportadora,@RequestBody Transportadora transportadora){
		transportadoraService.updateTransportadora(idTransportadora, transportadora);
		return ResponseEntity.ok().body("Transportadora atualizada com sucesso!");
	}
	
	@DeleteMapping("/api/transportadora/{idTransportadora}")
	public ResponseEntity<?> deleteTransportadora(@PathVariable("idTransportadora") long idTransportadora){
		transportadoraService.deleteTransportadora(idTransportadora);
		return ResponseEntity.ok().body("Transportadora excluida com sucesso!");
	}
}
