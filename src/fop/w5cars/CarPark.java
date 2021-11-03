package fop.w5cars;

public class CarPark {
	private int spaces;
	public CarPark(int x)
    {
        this.spaces = x;
    }
    public int park (Car c)
    {
        if (spaces > 0) return --spaces;
        return -1;
    }
}
