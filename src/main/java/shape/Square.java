package shape;

import render.Renderer;

public class Square extends Shape {
    private float side;

    public Square(Renderer renderer, float side) {
        super(renderer);
        this.side = side;
    }

    @Override
    public void draw() {
        // passa o trabalho de desenhar o quadrado para o renderer específico.
        renderer.renderSquare(side);
    }
}