/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.anatomyclassassignment;

/**
 *
 * @author SChang2026
 */
public class AnatomyClassAssignment {
    private String carBrand;
    private int enginePower; // in Horse Power
    private double maxSpeed; // in MPH
    private double price; // in $
    
    
    public static void main(String[] args) {
        // Creating car objects
        AnatomyClassAssignment toyotaPrius = new AnatomyClassAssignment("Toyota Prius", 121, 115, 25000);
        AnatomyClassAssignment bmwI8 = new AnatomyClassAssignment("BMW i8", 369, 155, 147500);
        AnatomyClassAssignment teslaModel3 = new AnatomyClassAssignment("Tesla Model 3", 283, 162, 39990);
        AnatomyClassAssignment vwbug = new AnatomyClassAssignment("Volkwagon Beetle", 174, 125, 30000);
        AnatomyClassAssignment bmwm4comp  = new AnatomyClassAssignment("Volkwagon Beetle", 503, 180, 82000);

        // Printing car details
        System.out.println(toyotaPrius);
        System.out.println(bmwI8);
        System.out.println(teslaModel3);
        System.out.println(vwbug);
        System.out.println(bmwm4comp);
    
}


    // Constructor
    public AnatomyClassAssignment(String carBrand, int enginePower, double maxSpeed, double price) {
        this.carBrand = carBrand;
        this.enginePower = enginePower;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    // Getters and Setters
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car Brand: " + carBrand +
               ", Engine Power: " + enginePower + " HP" +
               ", Max Speed: " + maxSpeed + " MPH" +
               ", Price: $" + price;
    }
}

