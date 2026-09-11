package padraoSingleton;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class ConfiguracaoTest {

    private Configuracao configuracao;

    @BeforeEach
    void setUp() {
        configuracao = Configuracao.getInstancia();
    }

    @Test
    void deveRetornarAMesmaInstancia() {
        Configuracao outraConfiguracao = Configuracao.getInstancia();

        assertSame(configuracao, outraConfiguracao);
    }

    @Test
    void deveCompartilharOsDados() {
        configuracao.setNomeSistema("Sistema Academico");
        configuracao.setAmbiente("Teste");

        Configuracao outraConfiguracao = Configuracao.getInstancia();

        assertEquals("Sistema Academico", outraConfiguracao.getNomeSistema());
        assertEquals("Teste", outraConfiguracao.getAmbiente());
    }
}
