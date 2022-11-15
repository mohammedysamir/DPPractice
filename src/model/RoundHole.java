package model;

public class RoundHole {
    int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean canFit(CylinderObject cylinder) {
        return cylinder.getRadius() <= this.radius;
    }
}
