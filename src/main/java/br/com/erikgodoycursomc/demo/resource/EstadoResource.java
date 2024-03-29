package br.com.erikgodoycursomc.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erikgodoycursomc.demo.domain.Estado;
import br.com.erikgodoycursomc.demo.services.EstadoService;


@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {
    
    @Autowired
    private EstadoService service;
    
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
	
	Estado obj = service.find(id);
	return ResponseEntity.ok().body(obj);
    }

}
