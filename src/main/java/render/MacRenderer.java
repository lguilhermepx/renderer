package render;

// Mac
public class MacRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Desenhando círculo com raio " + radius + " usando a API no MAC.");
    }

    @Override
    public void renderSquare(float side) {
        System.out.println("Desenhando quadrado de lado " + side + " usando a API no MAC.");
    }
}