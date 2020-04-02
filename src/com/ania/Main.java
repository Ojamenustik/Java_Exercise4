package com.ania;
import java.util.*;

public class Main {

    public static String[] vehicles = {
            "ambulance", "helicopter", "lifeboat"
    };

    public static String[][] drivers = {
            {"Fred", "Sue", "Pete"},
            {"Sue", "Rich"},
            {"Pete", "Rob"}
    };

    public static void main(String[] args) {

        Map<String, Set<String>> personnel = new HashMap<>();

        for(int i = 0; i < vehicles.length; i++){
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<String>();

            for(String driver: driversList){
                driverSet.add(driver);
            }

            personnel.put(vehicle, driverSet);
        }

        {///Brackets to scope driversList
            //////Example usage
            Set<String> driversList = personnel.get("helicopter");

            for (String driver : driversList) {
                System.out.println(driver);
            }
        }

        /// Iterate through whole thing
        for(String vehicle: personnel.keySet()){

            System.out.print(vehicle);
            System.out.print(": ");
            Set<String> driversList = personnel.get(vehicle);

            for(String driver: driversList){
                System.out.print(driver);
                System.out.print(" ");
            }

            System.out.println();
        }

    }
}
