package shape;

import render.Renderer;


// contém uma referência para a interface Implementadora.
public abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}