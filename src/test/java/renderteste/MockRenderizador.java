package renderteste;

import render.Renderer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MockRenderizador implements Renderer {
    private boolean renderizarCirculoChamado = false;
    private boolean renderizarQuadradoChamado = false;
    private float ultimoRaio;
    private float ultimoLado;

    @Override
    public void renderCircle(float radius) {
        this.renderizarCirculoChamado = true;
        this.ultimoRaio = radius;
    }

    @Override
    public void renderSquare(float side) {
        this.renderizarQuadradoChamado = true;
        this.ultimoLado = side;
    }

    // Métodos de verificação para os testes
    public void verificarChamadaRenderizarCirculo(float raioEsperado) {
        assertTrue(renderizarCirculoChamado, "O método renderCircle deveria ter sido chamado.");
        assertEquals(raioEsperado, ultimoRaio, "O raio passado para renderCircle está incorreto.");
    }

    public void verificarChamadaRenderizarQuadrado(float ladoEsperado) {
        assertTrue(renderizarQuadradoChamado, "O método renderSquare deveria ter sido chamado.");
        assertEquals(ladoEsperado, ultimoLado, "O lado passado para renderSquare está incorreto.");
    }
}