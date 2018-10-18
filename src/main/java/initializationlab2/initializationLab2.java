package initializationlab2;

import initializationlab1.Color;
import initializationlab1.ColorfulThing;

public class initializationLab2 {
    public static void main(String[] args) {
        ThingContainer uhh = new ThingContainer(2);
        ThingContainer bluh = new ThingContainer(1);
        ThingContainer huhh = new ThingContainer(3);

        ColorfulThing grape = new ColorfulThing(Color.PURPLE);
        ColorfulThing apple = new ColorfulThing(Color.RED);

        bluh.add(grape, 1);

        bluh.add(apple, 1);

        System.out.println(bluh.colorfulThings.size());
    }
}
