package electrical_appliances.model.appliance_types;

public abstract class ApplianceBasic {
    private int applianceId;
    private double devicePower ;
    private String producer;
    private String model;

    public ApplianceBasic(int applianceId, String model, String producer, double devicePower) {
        this.applianceId = applianceId;
        this.devicePower = devicePower;
        this.producer = producer;
        this.model = model;
    }

    public ApplianceBasic(int applianceId, String model, double devicePower) {
        this.applianceId = applianceId;
        this.devicePower = devicePower;
        this.model = model;
    }

    public String toString() {
        return "id:" + applianceId + " / "  + " Producer: " + producer +  " / "
                + " Model: " + model + " / " + " Device Power: " + devicePower ;
    }

    public int getApplianceId() {
        return applianceId;
    }

    public void setApplianceId(int id) {
        this.applianceId = id;
    }

    public double getDevicePower() {
        return devicePower ;
    }

    public void setDevicePower(double devicePower) {
        this.devicePower  = devicePower;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
