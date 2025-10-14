package renderteste;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import render.LinuxRenderer;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LinuxRenderizadorTeste {

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
        // preparar
        LinuxRenderer renderizador = new LinuxRenderer();
        float raio = 8.5f;
        String saidaEsperada = "Desenhando círculo com raio " + raio + " usando a API no Linux.\n";

        // criar
        renderizador.renderCircle(raio);

        // verificar
        assertEquals(saidaEsperada, conteudoSaida.toString());
    }

    @Test
    public void testeRenderizarQuadrado() {
        // preparar
        LinuxRenderer renderizador = new LinuxRenderer();
        float lado = 12.0f;
        String saidaEsperada = "Desenhando quadrado de lado " + lado + " usando a API no Linux.\n";

        // agir
        renderizador.renderSquare(lado);

        // verificar
        assertEquals(saidaEsperada, conteudoSaida.toString());
    }
}