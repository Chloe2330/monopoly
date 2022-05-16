package jansem2.Monopoly;

public class Property extends SquareType
{
    private String color;
    private int price;
    private int houses;
    private boolean hotel;

    public Property(String n, String t, int o, int p, String c, int pri, int hou, boolean hot)
    {
        super(n,t,o,p);
        color = c;
        price = pri;
        houses = hou;
        hotel = hot;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int p)
    {
        price = p;
    }
    public int getHouses()
    {
        return houses;
    }
    public void setHouses(int hou)
    {
        houses += hou;
    }
    public boolean getHotel()
    {
        return hotel;
    }
    public void setHotel(boolean hot)
    {
        hotel = hot;
    }
}
