package fop.w5cars;

public class CarPark {

	private Car[] spaces;
	public CarPark(int n)
    {
        this.spaces = new Car [n];
    }
    public int park (Car c)
    {
      for (int i=0;i<spaces.length;i++)
          if(spaces [i] == null) {spaces[i] = c;return i;}
      return -1;
    }

    public Car[] getSpaces() {
        return spaces;
    }

    public int search (LicensePlate lp)
    {
        for (int i=0;i<spaces.length;i++)
        {if(spaces[i]!=null){
            if(spaces[i].getLicensePlate().isEqual(lp)) return i;}}
            return -1;
    }
    public Car driveOff (LicensePlate lp)
    {
        int pos = search(lp);
        if(pos == -1) return null;
        else {
            Car car = spaces[pos];
            spaces[pos] = null;
            return car;
        }

    }
    public String toString() {
	    String  s  ="Car Park:\n";
	    for (int i=0;i<spaces.length;i++)
        {
            if(spaces[i] == null) s+=i+": []\n";
            else
            s+= i+": ["+spaces[i]+"]\n";
        }
      return s;
    }
}
