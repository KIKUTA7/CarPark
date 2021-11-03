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

    public String getRegionalCode() {
        return regionalCode;
    }

    public String getLetters() {
        return letters;
    }

    public boolean isEqual (LicensePlate other)
    {
        return (this.regionalCode.equals(other.regionalCode)  && this.letters.equals(other.letters)  && this.digits == other.digits);
    }
    public String toString () {
	return this.regionalCode+":"+this.letters+" "+this.digits;
    }




}
