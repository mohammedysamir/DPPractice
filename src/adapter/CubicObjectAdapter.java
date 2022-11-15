package adapter;

import model.CubicObject;
import model.CylinderObject;

//adapter will transform the cube's length to a radius
public class CubicObjectAdapter extends CylinderObject {
    CubicObject cubicObject;

    public CubicObjectAdapter(CubicObject cubicObject) {
        this.cubicObject = cubicObject;
    }

    @Override
    public int getRadius() {
        return (int) (Math.sqrt(Math.pow((cubicObject.getLength() / 2), 2) * 2));
    }
}
