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
    public boolean isEqual (LicensePlate other)
    {
        return (this.regionalCode.equals(other.regionalCode)  && this.letters.equals(other.letters)  && this.digits == other.digits);
    }


}
