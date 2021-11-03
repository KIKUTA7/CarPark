package fop.w5cars;

public class Car {
	private String brand;
	private LicensePlate licensePlate;
	static int chassisNumber = 0;
	public Car (String x , LicensePlate y)
    {
        this.brand = x;
        this.licensePlate = y;
        chassisNumber++;
    }

    public LicensePlate getLicensePlate() {
        return licensePlate;
    }
}
