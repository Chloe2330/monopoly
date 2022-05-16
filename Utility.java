package jansem2.Monopoly;

public class Utility extends SquareType
{
    private int value;
    private int price;

    public Utility(String n, String t, int o, int v, int post, int p)
    {
        super(n,t,o,post);
        value = v;
        price = p;
    }
    public int getValue()
    {
        return value;
    }
    public void setName(int c)
    {
        value = c;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int p)
    {
        price = p;
    }
}
