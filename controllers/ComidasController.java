package br.com.edusync.apicomida.controllers;

import br.com.edusync.apicomida.models.Comida;
import br.com.edusync.apicomida.services.ComidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/comidas")
@RestController
public class ComidasController {

    @Autowired
    private ComidaService service;

    @PostMapping(value = "/nova")
    public ResponseEntity novaComida(@RequestBody Comida comida) {
        service.adicionar(comida);
        return new ResponseEntity (comida, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity listartodas() {
        return new ResponseEntity(service.listarTudo(), HttpStatus.OK);
    }

    @GetMapping(value = "/{codigo}")
    public ResponseEntity listaPorCodigo(@PathVariable Integer codigo) {
        return new ResponseEntity(service.buscarPorCodigo(codigo), HttpStatus.OK);
    }

    @PutMapping(value = "/{codigo}")
    public ResponseEntity alterar(@PathVariable Integer codigo, @RequestBody Comida comida) {
        service.update(codigo, comida);
        return new ResponseEntity(comida, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{codigo}")
    public ResponseEntity remover(@PathVariable Integer codigo) {
        service.remover(codigo);
        return new ResponseEntity(HttpStatus.OK);
    }


}
