package edu.gemini.shape2;

abstract public class Shape {

    protected String name;
    private int x;
    private int y;

    public Shape() {
        name = "Shape";
        this.x = 0;
        this.y = 0;
    }

    public Shape(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void move(int x, int y) {
        hide();
        addX(x);
        addY(y);
        show();
    }

    abstract public void show();

    public void addX(int x) {
        this.x = this.x + x;
    }

    public void addY(int y) {
        this.y += y;
    }

    abstract public void hide();

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "X:" + x + " :Y" + y;
    }
}
