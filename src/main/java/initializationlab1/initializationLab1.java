package initializationlab1;

public class initializationLab1 {
    public static void main(String[] args) {

    ColorfulThing blue = new ColorfulThing(Color.BLUE);
    ColorfulThing red = new ColorfulThing(Color.RED);
    ColorfulThing yellow = new ColorfulThing(Color.YELLOW);
    ColorfulThing green = new ColorfulThing(Color.GREEN);
    ColorfulThing purple = new ColorfulThing(Color.PURPLE);

    BoringThing gray = new BoringThing();
    BoringThing silver = new BoringThing();
    BoringThing black = new BoringThing();
    BoringThing brown = new BoringThing();
    BoringThing white = new BoringThing();

        System.out.println(blue.getColor());
        System.out.println(red.getColor());
        System.out.println(yellow.getColor());
        System.out.println(green.getColor());
        System.out.println(purple.getColor());

//        ColorfulThing bluh = new ColorfulThing();

    }
}
