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

    public String getBrand() {
        return brand;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }
    public String toString() {
	  return "Car "+chassisNumber+": (Brand: "+this.brand+", License Plate: "+this.licensePlate+")";
    }
}
