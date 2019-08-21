package electrical_appliances.view.menu;

import electrical_appliances.controller.appliance_manager.ApplianceManager;

import java.util.Scanner;

public enum Menu {
    FINISH,
    SORT,
    SEARCH,
    CALCULATE,
    PLUG;

    public static void menu() {
        ApplianceManager amEnum = new ApplianceManager();
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s = "";
        Menu number = null;

        while (!"0".equals(s)) {
            System.out.println("1. To sort by type, enter                             - 1");
            System.out.println("2. Searching devices by power, enter                  - 2");
            System.out.println("3. To calculate power consumption, enter              - 3");
            System.out.println("4. Plug the appliance into an outlet, enter           - 4");
            System.out.println("0. To quit, press                                     - 0");
            s = scan.next();

            try {
                x = (Integer.parseInt(s));
                number = Menu.values()[x];

            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
            if (number != null) {
                switch (number) {
                    case FINISH:
                        System.out.println("Goodbye!");
                        break;
                    case SORT:
                        amEnum.sortingByType();
                        break;
                    case SEARCH:
                        amEnum.searchingDevicesByPower();
                        break;
                    case CALCULATE:
                        amEnum.calculatePowerConsumption();
                        break;
                    case PLUG:
                        amEnum.plugIntoOutlet();
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
            }
        }
        scan.close();
    }
}
