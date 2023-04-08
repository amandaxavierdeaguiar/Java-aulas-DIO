package Facede.Subsistema;
//singleton
public class CepApi {
    private static CepApi cep = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getCep() {
        return cep;
    }

    public String recuperarCidade(String cep) {
        return "Florianopolis";
    }

    public String recuperarEstado(String cep) {
        return "Santa Catarina - SC";
    }
}
