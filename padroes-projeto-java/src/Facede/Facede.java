package Facede;

import Facede.Subsistema.CepApi;
import Facede.Subsistema.CrmService;

public class Facede {
    public void migrarCliente(String nome, String cep) {

        String cidade = CepApi.getCep().recuperarCidade(cep);
        String estado = CepApi.getCep().recuperarEstado(cep);

        
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
