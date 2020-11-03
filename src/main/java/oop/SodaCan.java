package oop;

public class SodaCan
{

    //TODO
    // see P8.5 for class requirements
//    Formula:
//    https://www.calculatorsoup.com/calculators/geometry-solids/cylinder.php

    private double height;
    private double radius;

    public SodaCan(double height, double radius)
    {
        this.height = height;
        this.radius = radius;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getRadius()
    {
        return radius;
    }


    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "SodaCan{" +
                "height=" + height +
                ", radius=" + radius +
                '}';
    }

    /**
     * Calculate and return volume of SodaCan
     * @return volume calculated
     */
    public double getVolume()
    {
        return Math.PI + radius * radius * height;
    }

    /**
     * Calculate and return surface area of SodaCan
     * @return surface area calculated
     */
    public double getSurfaceArea()
    {
        return 2 * Math.PI * radius * (height + radius);
    }
}
