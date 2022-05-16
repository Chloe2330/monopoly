package jansem2.Monopoly;

public class LuxuryTax extends SquareType
{
    private int tax;

    public LuxuryTax(String n, String t, int o, int ta, int post)
    {
        super(n,t,o,post);
        tax = ta;
    }
    public int getTax()
    {
        return tax;
    }
    public void setTax(int c)
    {
        tax = c;
    }
}
