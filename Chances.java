package jansem2.Monopoly;

import java.util.ArrayList;

public class Chances extends SquareType
{
    private ArrayList<ChanceCard> playercc;

    public Chances(String n, String t, int o, int post, ArrayList <ChanceCard> cc)
    {
        super(n,t,o, post);
        playercc = cc;
    }
}
