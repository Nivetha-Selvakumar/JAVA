import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;

public class Map1 {
    public static void main(String[] args){
        List<String> vehicles = Arrays.asList("Car","Bike","Cycle","Aeroplane","Train");
        List<String> vehiclesUpperCase = new ArrayList<String>();
        //without using stream
        for (String name: vehicles){
            vehiclesUpperCase.add(name.toUpperCase());
        }
        System.out.println("Vehicle in upper case"+ vehiclesUpperCase);
        List<String> vehiclesUpperCase2= new ArrayList<String>();
        // using Stream
        vehiclesUpperCase2= vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println("Using stream"+vehiclesUpperCase2);


    }
}