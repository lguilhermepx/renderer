package shape;

import render.Renderer;

public class Circle extends Shape {
    private float radius;

    public Circle(Renderer renderer, float radius) {
        // Passa o renderer para a classe pai (Shape) pra construir a ponte.
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }
}