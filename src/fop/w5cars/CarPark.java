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
    public int search (LicensePlate lp)
    {
        for (int i=0;i< spaces.length;i++)
            if(spaces[i].getLicensePlate() == lp) return i;
            return -1;
    }
}
