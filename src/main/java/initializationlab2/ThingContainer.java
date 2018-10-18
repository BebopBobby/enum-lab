package initializationlab2;
import initializationlab1.Color;
import initializationlab1.ColorfulThing;

import java.util.ArrayList;

public class ThingContainer {
    public ArrayList<ColorfulThing> colorfulThings;

    private int max;

    public ThingContainer(int size) {
        this.colorfulThings = new ArrayList<ColorfulThing>(size);
        this.max = size;
    }

    public ThingContainer(ArrayList<ColorfulThing> colorfulThings2){
        this.colorfulThings = colorfulThings2;
    }

    public String add(ColorfulThing colorfulThing, int max){
        colorfulThings.add(colorfulThing);

        if (colorfulThings.size() > max){
            return "ThingContainer is full";
        }
        return null;
    }

    public String printThings(){
        return colorfulThings.toString();
    }

    public void pop(){
        colorfulThings.remove(colorfulThings.size() - 1);
    }

    public void remove(Color color){
        colorfulThings.remove(color);
    }

    public ColorfulThing remove(ColorfulThing colorfulThing){
        colorfulThings.remove(colorfulThing);
        return colorfulThing;
    }
}
