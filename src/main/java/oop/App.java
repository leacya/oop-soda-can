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

        System.out.println(sc1.toString() +"\n");

        double volume = sc1.getVolume();
        System.out.println("Volume of soda can = " + volume);
        System.out.printf("Volume of soda can = %.2f \n" , volume);

        double area = sc1.getSurfaceArea();
        System.out.println("Surface Area of soda can = " + area);
        System.out.printf("Surface Area of soda can = %.2f \n" , area);

//Additional TODOs from
        //TODO 1.Declare and populate an arraylist of 5 soda-cans in App.java
        //TODO 2.Display the details of all soda-cans -> code this as a method
        //TODO 3.Display total volume of all soda-cans -> making use of appropriate method
        //TODO 4.Determine how many of the soda-cans have surface area greater than certain size




    }
}
