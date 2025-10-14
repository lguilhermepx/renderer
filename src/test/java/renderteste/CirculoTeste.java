package renderteste;

import shape.*;
import org.junit.jupiter.api.Test;

public class CirculoTeste {

    @Test
    public void testeDesenhar() {
        MockRenderizador mockRenderizador = new MockRenderizador();
        float raio = 5.0f;
        Circle circulo = new Circle(mockRenderizador, raio);

        circulo.draw();

        mockRenderizador.verificarChamadaRenderizarCirculo(raio);
    }
}