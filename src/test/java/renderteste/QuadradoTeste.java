package renderteste;

import org.junit.jupiter.api.Test;
import shape.Square;

public class QuadradoTeste {

    @Test
    public void testeDesenhar() {
        MockRenderizador mockRenderizador = new MockRenderizador();
        float lado = 10.0f;
        Square quadrado = new Square(mockRenderizador, lado);

        quadrado.draw();

        mockRenderizador.verificarChamadaRenderizarQuadrado(lado);
    }
}