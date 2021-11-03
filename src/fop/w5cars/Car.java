package fop.w5cars;

public class Car {
	private String brand;
	private LicensePlate licensePlate;
	private int chassisNumber = 0;
	public Car (String x , LicensePlate y)
    {
        this.brand = x;
        this.licensePlate = y;
        this.chassisNumber++;
    }

    public void setLicensePlate(LicensePlate licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setChassisNumber(int chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public int getChassisNumber() {
        return chassisNumber;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }
    public String toString() {
	  return "Car "+chassisNumber+": (Brand: "+this.brand+", License Plate: "+this.licensePlate+")";
    }
}
