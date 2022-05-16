package jansem2.Monopoly;

public class Railroads extends SquareType
{
    private int price;

    public Railroads(String n, String t, int o, int post, int pri)
    {
        super(n,t,o, post);
        price = pri;
    }
    public int getPrice()
    {
        return price;
    }
    public void setName(int p)
    {
        price = p;
    }
}
