package electrical_appliances.controller.appliance_manager;


import electrical_appliances.model.appliance_types.Appliance;
import electrical_appliances.model.appliance_types.ApplianceType;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ApplianceManager {
    public static List<Appliance> appliance = new ArrayList<Appliance>();
    public static Scanner sc = new Scanner(System.in);

    public static void plugIntoOutlet() {
        String typeIn = null;
        int countOfPluged = 0;
        System.out.println("To pluged by type, enter a type name(KITCHEN_TEC, BATH_TEC, AV_TEC, IT_TEC): ");
        try {
            typeIn = sc.nextLine().toUpperCase().trim();
            ApplianceType typeEn = ApplianceType.valueOf(typeIn);
            for (Appliance s : appliance) {
                if (s.getApplianceType() == typeEn) {
                    System.out.println("sortingByType == type: " + s.toString());
                    countOfPluged++;
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("This is a wrong character");
        }
        System.out.println("The appliances are plugged!" + " " + countOfPluged + " "
               + typeIn + " type of appliances have plugged in.");
        System.out.println();
    }

    public void calculatePowerConsumption() {
        double powerСonsumption = 0;
        for (Appliance s : appliance) {
            powerСonsumption += s.getDevicePower();
        }
        System.out.println("Power consumption is : " + powerСonsumption + "W");
        System.out.println();
    }

    public void searchingDevicesByPower() {
        System.out.println("Enter a min and max power: ");
        try {
            Double minPower = sc.nextDouble();
            Double maxPower = sc.nextDouble();
            for (int i = 0; i < appliance.size(); i++) {
                if (appliance.get(i).getDevicePower() >= minPower && appliance.get(i).getDevicePower() <= maxPower) {
                    System.out.println("This is your appliance : " + appliance.get(i).toString());
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("This is a wrong character");
        }
        System.out.println();
    }

    public void sortingByType() {
        System.out.println("To sort by type, enter a type name(KITCHEN_TEC, BATH_TEC, AV_TEC, IT_TEC): ");
        try {
            String typeIn = sc.nextLine().toUpperCase().trim();
            ApplianceType typeEn = ApplianceType.valueOf(typeIn);
            for (Appliance s : appliance) {
                if (s.getApplianceType() == typeEn) {
                    System.out.println("sortingByStyle == style: " + s.toString());
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("This is a wrong character");
        }
        System.out.println();
    }

    public static void initData() {
        // songs
        appliance.add(new Appliance(1, "Whirlpool", "29-lb",
                50, ApplianceType.KITCHEN_TEC));
        appliance.add(new Appliance(2, "Whirlpool", "21.7-cu ft",
                60, ApplianceType.KITCHEN_TEC));
        appliance.add(new Appliance(3, "Bosch", "300 Series",
                1500, ApplianceType.KITCHEN_TEC));
        appliance.add(new Appliance(4, "SAMSUNG", "WF60F1R2E2WDUA",
                500, ApplianceType.BATH_TEC));
        appliance.add(new Appliance(5, "ELECTROLUX", "EWH 50",
                100, ApplianceType.BATH_TEC));
        appliance.add(new Appliance(6, "Sony", "KD55XF7096BR2",
                70, ApplianceType.AV_TEC));
        appliance.add(new Appliance(7, "LG", "43UK6300PLB",
                50, ApplianceType.AV_TEC));
        appliance.add(new Appliance(8, "Samsung", "UE43N5000AUXUA",
                80, ApplianceType.AV_TEC));
        appliance.add(new Appliance(9, "Dell", "5490 (N073L549014_W10)",
                100, ApplianceType.IT_TEC));
        appliance.add(new Appliance(10, "HP", "Gaming 15-cx0048",
                90, ApplianceType.IT_TEC));

        for (Appliance appliance : appliance) {
            System.out.println(appliance);
        }
        System.out.println();
    }
}
