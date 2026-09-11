package padraoSingleton;

public class Aplicacao {

    public static void main(String[] args) {
        Configuracao configuracao1 = Configuracao.getInstancia();

        configuracao1.setNomeSistema("Sistema Academico");
        configuracao1.setAmbiente("Producao");

        Configuracao configuracao2 = Configuracao.getInstancia();

        System.out.println(configuracao2.getNomeSistema());
        System.out.println(configuracao2.getAmbiente());
        System.out.println(configuracao1 == configuracao2);
    }
}
