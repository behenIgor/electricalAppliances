package electrical_appliances.model.appliance_types;

import java.util.List;

public class Appliance extends ApplianceBasic {
    private ApplianceType applianceType;
    private List<Appliance> list;

    public Appliance(int applianceId, String producer, String model, double devicePower, ApplianceType applianceType) {
        super(applianceId, producer, model, devicePower);
        this.applianceType = applianceType;
    }

    public List<Appliance> getList() {
        return list;
    }

    public void setList(List<Appliance> list) {
        this.list = list;
    }

    public ApplianceType getApplianceType() {
        return applianceType;
    }

    public void setApplianceType(ApplianceType applianceType) {
        this.applianceType = applianceType;
    }

    @Override
    public String toString() {
        String appliance = super.toString() + " / " + " Appliance Type: " + applianceType;
        return appliance;
    }
}
