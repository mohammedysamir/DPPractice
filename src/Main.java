import adapter.CubicObjectAdapter;
import model.CubicObject;
import model.CylinderObject;
import model.RoundHole;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is Adapter design pattern main");
        //create compatible object and its client
        RoundHole roundHole = new RoundHole(5);
        CylinderObject cylinder = new CylinderObject(4);
        //test
        if (roundHole.canFit(cylinder))
            System.out.format("%nCylinder with radius %d can fit into the hole of radius %d%n", cylinder.getRadius(), roundHole.getRadius());
        else
            System.out.println("Cylinder can't fit into the hole");

        //test a cube
        CubicObject cube = new CubicObject(6);
        CubicObjectAdapter adapter = new CubicObjectAdapter(cube);
        if (roundHole.canFit(adapter))
            System.out.format("%nCube with length %d can fit into the hole of radius %d%n", cube.getLength(), roundHole.getRadius());
        else
            System.out.println("Cube can't fit into the hole");
        //test a bigger cube
        CubicObject biggerCube = new CubicObject(10);
        adapter = new CubicObjectAdapter(biggerCube);
        if (roundHole.canFit(adapter))
            System.out.format("%nCube with length %d can fit into the hole of radius %d%n", biggerCube.getLength(), roundHole.getRadius());
        else
            System.out.println("Cube can't fit into the hole");
    }
}