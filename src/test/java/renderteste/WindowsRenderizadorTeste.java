package renderteste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import render.WindowsRenderer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WindowsRenderizadorTeste {

    // Guarda o fluxo de saída do console em memória
    private final ByteArrayOutputStream conteudoSaida = new ByteArrayOutputStream();
    private final PrintStream saidaOriginal = System.out;

    @BeforeEach // Executa antes de cada teste
    public void configurarStreams() {
        // Redireciona a saída padrão do sistema para nosso fluxo em memória
        System.setOut(new PrintStream(conteudoSaida));
    }

    @AfterEach // Executa depois de cada teste
    public void restaurarStreams() {
        // Restaura a saída padrão original do sistema
        System.setOut(saidaOriginal);
    }

    @Test
    public void testeRenderizarCirculo() {
        // Preparar
        WindowsRenderer renderizador = new WindowsRenderer();
        float raio = 7.0f;
        String saidaEsperada = "Desenhando um círculo com raio " + raio + " usando a API do Windows.\n";

        // Agir
        renderizador.renderCircle(raio);

        // Verificar
        assertEquals(saidaEsperada, conteudoSaida.toString());
    }

    @Test
    public void testeRenderizarQuadrado() {
        // Preparar
        WindowsRenderer renderizador = new WindowsRenderer();
        float lado = 4.0f;
        String saidaEsperada = "Desenhando um quadrado de lado " + lado + " usando a API do Windows.\n";

        // Agir
        renderizador.renderSquare(lado);

        // Verificar
        assertEquals(saidaEsperada, conteudoSaida.toString());
    }
}