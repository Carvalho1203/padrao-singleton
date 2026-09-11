package padraoSingleton;

public class Configuracao {

    private static Configuracao instancia;

    private String nomeSistema;
    private String ambiente;

    private Configuracao() {
    }

    public static Configuracao getInstancia() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public String getNomeSistema() {
        return nomeSistema;
    }

    public void setNomeSistema(String nomeSistema) {
        this.nomeSistema = nomeSistema;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
}
