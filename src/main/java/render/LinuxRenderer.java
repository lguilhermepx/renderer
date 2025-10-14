package render;

public class LinuxRenderer implements Renderer {

    @Override
    public void renderCircle(float radius) {
        System.out.println("Desenhando círculo com raio " + radius + " usando a API no Linux.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Desenhando quadrado de lado " + side + " usando a API no Linux.");
    }
}