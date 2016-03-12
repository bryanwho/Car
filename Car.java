package myFirstPackage;

/**
 * Created by bryan on 10/15/15.
 */
public class Car {

    private String name;
    private int modelNumber;
    private int acceleration;
    private int currentSpeed;
    private int topSpeed;

    public Car(String name, int modelNumber, int topSpeed,
               int acceleration) {
        this.name = name;
        this.modelNumber = modelNumber;
        this.acceleration = acceleration;
        currentSpeed = 0;
        this.topSpeed = topSpeed;
    }

    public Car() {

    }


    public void setName(String carName) {
        name = carName;
    }

    public String getName() {
        return name;
    }

    public void setModelNumber(int newModelNumber) {
        modelNumber = newModelNumber;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void accelerate() {
        //I want to add the acceleration to the current speed
//        but i do not want to pass the topSpeed

        if(currentSpeed + acceleration <= topSpeed) {
            currentSpeed += acceleration;
        } else {
            currentSpeed = topSpeed;
        }

        System.out.println(name + " is going at " + currentSpeed + " mph");
    }





}

















