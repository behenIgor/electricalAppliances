package electrical_appliances;

import electrical_appliances.controller.appliance_manager.ApplianceManager;
import electrical_appliances.view.menu.Menu;

public class Main {
    public static void main(String[] args) {
        ApplianceManager am = new ApplianceManager();
        am.initData();
        Menu.menu();
    }
}
