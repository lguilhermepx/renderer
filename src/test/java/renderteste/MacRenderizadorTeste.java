package renderteste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import render.MacRenderer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MacRenderizadorTeste {

    private final ByteArrayOutputStream conteudoSaida = new ByteArrayOutputStream();
    private final PrintStream saidaOriginal = System.out;

    @BeforeEach
    public void configurarStreams() {
        System.setOut(new PrintStream(conteudoSaida));
    }

    @AfterEach
    public void restaurarStreams() {
        System.setOut(saidaOriginal);
    }

    @Test
    public void testeRenderizarCirculo() {
        MacRenderer renderizador = new MacRenderer();
        float raio = 15.0f;
        String saidaEsperada = "Desenhando círculo com raio " + raio + " usando a API no MAC.\n";

        renderizador.renderCircle(raio);

        assertEquals(saidaEsperada, conteudoSaida.toString());
    }

    @Test
    public void testeRenderizarQuadrado() {
        MacRenderer renderizador = new MacRenderer();
        float lado = 25.5f;
        String saidaEsperada = "Desenhando quadrado de lado " + lado + " usando a API no MAC.\n";

        renderizador.renderSquare(lado);

        assertEquals(saidaEsperada, conteudoSaida.toString());
    }
}