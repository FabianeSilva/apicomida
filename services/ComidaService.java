package br.com.edusync.apicomida.services;

import br.com.edusync.apicomida.models.Comida;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ComidaService {

    private List<Comida> comidas = new ArrayList<>();


    public void adicionar(Comida comidaQueSeraSalva) {
        comidas.add(comidaQueSeraSalva);
    }

    public List<Comida> listarTudo() {
        return comidas;
    }

    public Comida buscarPorCodigo(Integer codigo) {
        return comidas.stream().filter(p -> codigo.equals(p.getCodigo())).findFirst().orElseThrow();
    }

    public void update(Integer codigo, Comida comida) {
        remover(codigo);
        adicionar(comida);
    }

    public void remover(Integer codigo) {
        Comida comidaPesquisa = buscarPorCodigo(codigo);
        if (comidaPesquisa != null) {
            comidas.remove(comidaPesquisa);
        }
    }
}
