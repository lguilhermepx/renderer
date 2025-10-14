package render;

// desenhar em um ambiente Windows.
public class WindowsRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Desenhando um círculo com raio " + radius + " usando a API do Windows.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Desenhando um quadrado de lado " + side + " usando a API do Windows.");
    }
}