package chapter1;

public class CargoFlight extends Flight {

    //member hiding
    String flightType = "cargo";
    final int staffs = 5;


    //method overriding
@Override
    public int freeSeatsseatsAvailable(){
        return 10;

    }

    void methodInCargoFlight(){
        System.out.println("in cargo flight");
    }

    /*//method cannot be overridden as final in super class
    final int numberOfStaffs(){
        return 5;
    }*/


}
