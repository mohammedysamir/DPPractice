package composite;

import java.util.ArrayList;
import java.util.List;

//Box represents compose object which consists of products or another smaller boxes
public class Box implements Composable {

    List<Composable> composedObjects;

    public Box() {
        composedObjects = new ArrayList<>();
    }

    //DI
    public Box(List<Composable> composedObjects) {
        this.composedObjects = composedObjects;
    }

    public void addComposable(Composable composable) {
        composedObjects.add(composable);
    }

    public void removeComposable(Composable composable) {
        if (composedObjects.contains(composable))
            composedObjects.remove(composable);
        else
            throw new RuntimeException("Composable object not found in the composed objects list");
    }

    public List<Composable> getChildren() {
        return composedObjects;
    }

    @Override
    public void getPrice() {
        for (Composable composable : composedObjects)
            composable.getPrice();
    }
}
