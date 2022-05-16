package jansem2.Monopoly;
import java.util.ArrayList;
public class Player implements Pieces
{
    private String name;
    private int money;
    private int houses;
    private int hotel;
    private int playerposition;
    private int playernumber;
    private ArrayList<Property> playerprop;
    private ArrayList<Railroads> playerrail;
    private ArrayList<Utility> playerult;
    private int daysInJail;
    private boolean inJail;

    public Player(String n, int m, int hou, int hot, int post, int num, ArrayList<Property> pp, ArrayList<Railroads> pr, ArrayList<Utility> pu, int dij, boolean ij)
    {
        name = n;
        money = m;
        houses = hou;
        hotel = hot;
        playerposition = post;
        playernumber = num;
        playerprop = pp;
        playerrail = pr;
        playerult = pu;
        daysInJail = dij;
        inJail = ij;
    }

    public String getName()
    {
        return name;
    }
    public void setOwner(String human)
    {
        name = human;
    }
    public int getMoney()
    {
        return money;
    }
    public void setMoney(int m)
    {
        money += m;
    }
    public int getPosition()
    {
        return playerposition;
    }
    public void setPosition(int p)
    {
        playerposition = p;
    }

    public void addProp(Property p)
    {
        playerprop.add(p);
    }
    public ArrayList <Property> getProp()
    {
        return playerprop;
    }
    public void addRailroad(Railroads r)
    {
        playerrail.add(r);
    }
    public ArrayList <Railroads> getRail()
    {
        return playerrail;
    }
    public void addUlt(Utility u)
    {
        playerult.add(u);
    }
    public ArrayList <Utility> getUlt()
    {
        return playerult;
    }
    public int getHouses()
    {
        return houses;
    }
    public void setHouses(int h)
    {
        houses += h;
    }
    public int getHotel()
    {
        return hotel;
    }
    public void setHotel(int h)
    {
        hotel = h;
    }
    public int getPlayerNumber()
    {
        return playernumber;
    }

    public int getdaysInJail()
    {
        return daysInJail;
    }
    public void setdaysInJail(int d)
    {
        daysInJail += d;
    }
    public boolean getinJail()
    {
        return inJail;
    }
    public void setinJail(boolean i)
    {
        inJail = i;
    }

    public String toString()
    {
        String stringprop = " ";
        for(Property p: playerprop)
        {
            stringprop += p.getName() + " ";
        }
        String stringrail = " ";
        for(Railroads r: playerrail)
        {
            stringrail += r.getName() + " ";
        }
        String stringult = " ";
        for(Utility u: playerult)
        {
            stringult += u.getName() + " ";
        }
        return "What Player " + playernumber + " owns: " + stringprop + " " + stringrail + " " + stringult + " " + houses + " houses, " + hotel + " hotels";
    }



}
