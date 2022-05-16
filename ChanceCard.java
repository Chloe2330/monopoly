package jansem2.Monopoly;

public class ChanceCard
{
    private String activity;
    private int value;

    public ChanceCard(String a, int v)
    {
        activity = a;
        value = v;
    }
    public String getActivity()
    {
        return activity;
    }
    public void setName(String a)
    {
        activity = a;
    }
    public int getValue()
    {
        return value;
    }
    public void setValue(int v)
    {
        value = v;
    }
}

