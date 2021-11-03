package fop.w5cars;

public class LicensePlate {
	private String regionalCode , letters;
	private int digits;
	public LicensePlate (String x , String y , int k)
    {
        this.regionalCode = x;
        this.letters = y;
        this.digits = k;
    }
    public boolean isEqual (LicensePlate x)
    {
        return (this.regionalCode.equals(x.regionalCode)  && this.letters.equals(x.letters)  && this.digits == x.digits);
    }


}
