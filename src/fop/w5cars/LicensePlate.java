package fop.w5cars;

public class LicensePlate {
	public String regionalCode , letters;
	int digits;
	public LicensePlate (String x , String y , int k)
    {
        this.regionalCode = x;
        this.letters = y;
        this.digits = k;
    }

}
