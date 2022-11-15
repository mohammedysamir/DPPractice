package model;
//cubic object is not compatible (fit) with the round hole ... need an adapter.
public class CubicObject {
    int length;

    public CubicObject(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getSurfaceArea() {
        return length * length;
    }
}
