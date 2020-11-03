package oop;

/**
 * Hello world!
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** SodaCan App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        SodaCan sc1 = new SodaCan(8,5);
        //TODO
        // See question P8.5
        System.out.println("Height of sodacan = " + sc1.getHeight());
        System.out.println("Radius of sodacan = " + sc1.getRadius());

        sc1.setHeight(10);
        sc1.setRadius(3);

        System.out.println("Changed values of instance variables as follows:");
        System.out.println("Height of sodacan = " + sc1.getHeight());
        System.out.println("Radius of sodacan = " + sc1.getRadius());



    }
}
