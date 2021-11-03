package fop.w5cars;

public class Car {
	private String brand;
	private LicensePlate licensePlate;
	private static int chassisnumber;
	public Car (String x , LicensePlate y)
    {
        this.brand = x;
        this.licensePlate = y;
        this.chassisnumber -- ;
    }
}
