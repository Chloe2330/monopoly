package jansem2.Monopoly;
import java.util.Scanner;
import java.util.ArrayList;
public class MonopolyMain
{
    public static void main (String [] args)
    {
        // ArrayList stores the unpurchased objects
        ArrayList<Property> propbank = new ArrayList<>();
        ArrayList<Railroads> railbank= new ArrayList<>();
        ArrayList<Utility> ultbank = new ArrayList<>();
        ArrayList<LuxuryTax> luxbank = new ArrayList<>();
        ArrayList<FreeParking> fpbank = new ArrayList<>();
        ArrayList<ChanceCard> chancebank = new ArrayList<>();

        // 32 Monopoly squares
        // Property
        Property p1 = new Property("YP1", "property", 0, 3, "yellow", 125, 0, false);
        Property p2 = new Property("YP2", "property", 0, 4, "yellow", 150, 0, false);
        Property p3 = new Property("YP3", "property", 0, 7, "yellow", 175, 0, false);
        Property p4 = new Property("YP4", "property", 0, 8, "yellow", 200, 0, false);
        Property p5 = new Property("RP1", "property", 0, 11, "red", 100, 0, false);
        Property p6 = new Property("RP2", "property", 0, 12, "red", 125, 0, false);
        Property p7 = new Property("RP3", "property", 0, 15, "red", 150, 0, false);
        Property p8 = new Property("RP4", "property", 0, 16, "red", 175, 0, false);
        Property p9 = new Property("GP1", "property", 0, 18, "green", 125, 0, false);
        Property p10 = new Property("GP2", "property", 0, 19, "green", 150, 0, false);
        Property p11 = new Property("GP3", "property", 0, 22, "green", 175 ,0, false);
        Property p12 = new Property("GP4", "property", 0, 23, "green", 200, 0, false);
        Property p13 = new Property("BP1", "property", 0, 27, "blue", 125, 0, false);
        Property p14 = new Property("BP2", "property", 0, 28, "blue", 150, 0, false);
        Property p15 = new Property("BP3", "property", 0, 31, "blue", 175, 0, false);
        Property p16 = new Property("BP4", "property", 0, 32, "blue", 200, 0, false);

        // Luxury Tax
        LuxuryTax lt1 = new LuxuryTax("LUX1", "luxury tax", 0, 100, 6);
        LuxuryTax lt2 = new LuxuryTax("LUX2", "luxury tax", 0, 200, 30);

        // Utility
        Utility ult = new Utility("ULT", "utility", 0, 0, 20, 100);

        // Railroads
        Railroads rr1 = new Railroads("RR1", "railroads", 0, 5, 150);
        Railroads rr2 = new Railroads("RR2", "railroads", 0, 13, 150);
        Railroads rr3 = new Railroads("RR3", "railroads", 0, 21, 150);
        Railroads rr4 = new Railroads("RR4", "railroads", 0, 29, 150);

        // Jail
        Jail j = new Jail("JAIL", "jail", 0, 0, 10);
        GoToJail gtj = new GoToJail("GO TO JAIL", "GoToJail", 0, 26);

        // Chances
        Chances c1 = new Chances("CHANCE", "Chances", 0, 14, chancebank);
        Chances c2 = new Chances("CHANCE", "Chances", 0, 24, chancebank);

        // Chance Cards
        ChanceCard cc1 = new ChanceCard("Won a sports bet against your friend. Collect $100.", 100);
        ChanceCard cc2 = new ChanceCard("Won the lottery! Collect $250", 250);
        ChanceCard cc3 = new ChanceCard("Got a parking ticket. Pay $100", -100);
        ChanceCard cc4 = new ChanceCard("Lost money gambling at the casino. Lose $200", -200);
        ChanceCard cc5 = new ChanceCard("It's your birthday! Collect $100", 100);

        // Free Parking
        FreeParking fp1 = new FreeParking("FP1", "FreeParking", 0, 1);
        FreeParking fp2 = new FreeParking("FP2", "FreeParking", 0, 9);
        FreeParking fp3 = new FreeParking("FP3", "FreeParking", 0, 17);
        FreeParking fp4 = new FreeParking("FP4", "FreeParking", 0, 25);

        propbank.add(p1);
        propbank.add(p2);
        propbank.add(p3);
        propbank.add(p4);
        propbank.add(p5);
        propbank.add(p6);
        propbank.add(p7);
        propbank.add(p8);
        propbank.add(p9);
        propbank.add(p10);
        propbank.add(p11);
        propbank.add(p12);
        propbank.add(p13);
        propbank.add(p14);
        propbank.add(p15);
        propbank.add(p16);

        railbank.add(rr1);
        railbank.add(rr2);
        railbank.add(rr3);
        railbank.add(rr4);

        ultbank.add(ult);

        luxbank.add(lt1);
        luxbank.add(lt2);

        fpbank.add(fp1);
        fpbank.add(fp2);
        fpbank.add(fp3);
        fpbank.add(fp4);

        chancebank.add(cc1);
        chancebank.add(cc2);
        chancebank.add(cc3);
        chancebank.add(cc4);
        chancebank.add(cc5);

        ArrayList<Property> play1prop = new ArrayList<>();
        ArrayList<Property> play2prop = new ArrayList<>();
        ArrayList<Railroads> play1rail = new ArrayList<>();
        ArrayList<Railroads> play2rail = new ArrayList<>();
        ArrayList<Utility> play1ult = new ArrayList<>();
        ArrayList<Utility> play2ult = new ArrayList<>();
        Player play1 = new Player("Chloe", 1500, 0, 0, 2, 1, play1prop, play1rail, play1ult, 0, false);
        Player play2 = new Player("Guest", 1500, 0, 0, 2, 2, play2prop, play2rail, play2ult, 0, false);

        // create the board
        String[][] board = createBoard(play1, play2);
        displayBoard(createBoard(play1, play2));

        int counter = 0;
        boolean checker = true;
        while(checker)
        {
            if (counter % 2 == 0)
            {
                playerOne(play1, propbank, railbank, ultbank, luxbank, fpbank, play2, chancebank);
                displayBoard(createBoard(play1, play2));
            }
            else
            {
                playerTwo(play2, propbank, railbank, ultbank, luxbank, fpbank, play1, chancebank);
                displayBoard(createBoard(play1, play2));
            }
            counter++;

            checkWinner(play1, play2);
        }
    }

    // PLAYER ONE
    public static void playerOne(Player p, ArrayList <Property> prop, ArrayList <Railroads> r, ArrayList <Utility> u, ArrayList <LuxuryTax> l, ArrayList <FreeParking> free, Player op, ArrayList <ChanceCard> cc)
    {
        System.out.println("*" + p.getPosition());
        Scanner s = new Scanner(System.in);
        // rolls dice
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int sum = dice1 + dice2;
        System.out.println("Player 1: YOU ROLLED A " + sum);
        if(p.getinJail() == true && p.getdaysInJail() > 0)
        {
            p.setPosition(10);
        }
        else
        {
            if(((p.getPosition() + sum)%32) == 0)
            {
                p.setPosition(32);
            }
            else
            {
                p.setPosition((p.getPosition() + sum)%32);
            }
            if(p.getPosition() < 32 && p.getPosition()-sum < 2)
            {
                System.out.println("Here's $50 for passing GO!");
                p.setMoney(50);
            }
        }
        System.out.println("*" + p.getPosition());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Player 1's Current Balance: " + p.getMoney());
        System.out.println(p.toString());
        System.out.println("--------------------------------------------------------------------------------");
        if(p.getinJail() == true && p.getdaysInJail() > 0)
        {
            if(dice1 == dice2)
            {
                p.setinJail(false);
                System.out.println("You rolled a double. You got out of jail free.");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 1's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }
            else
            {
                p.setdaysInJail(-1);
                System.out.println("You did NOT roll a double. Stay in jail.");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 1's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }
        }
        else if(p.getinJail() == true && p.getdaysInJail() == 0)
        {
            p.setMoney(-50);
            p.setinJail(false);
            System.out.println("You finished your jail sentence and can pay a $50 fine to get out.");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Player 1's Current Balance: " + p.getMoney());
            System.out.println(p.toString());
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Your turn is over.");
            System.out.println("Enter any number to continue.");
            int cont = s.nextInt();
            s.nextLine();
        }
        else
        {
            // PROPERTY
            for (Property pro: prop)
            {
                if(p.getPosition() == pro.getPost() && pro.getOwner() == 0 && pro.getTileType().equals("property"))
                {
                    System.out.println("You have landed on unowned " + pro.getTileType() + ", " + pro.getName() + ".");
                    System.out.println("Enter 1 to buy. Enter 2 to pass.");
                    int num1 = s.nextInt();
                    s.nextLine();
                    if(p.getMoney() >= pro.getPrice() && num1 == 1)
                    {
                        pro.setOwner(1);
                        p.addProp(pro);
                        p.setMoney(-1*pro.getPrice());
                        System.out.println("You will now purchase it for $" + pro.getPrice() + ".");
                    }
                    else if(num1 == 2)
                    {
                        System.out.println("You have decided to pass.");
                    }
                    else
                    {
                        System.out.println("You do not have enough money to purchase this property or you have hit an invalid key.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == pro.getPost() && pro.getOwner() == 1 && pro.getTileType().equals("property"))
                {
                    System.out.println("You have landed on your own property, " + pro.getName() + ". It currently has " + pro.getHouses() + " houses.");
                    System.out.println("Note 1: if you are buying your fourth house, it will automatically be converted into a hotel.");
                    System.out.println("Note 2: you must own all the properties from that color group before you can build a house.");
                    System.out.println("Enter 1 to buy a house for $50 each. Enter 2 to pass.");
                    int num2 =s.nextInt();
                    s.nextLine();
                    int colorcheck = 0;
                    for(Property pr : p.getProp())
                    {
                        if (pr.getColor().equals(pro.getColor()))
                        {
                            colorcheck++;
                        }
                    }
                    if(p.getMoney() >= 50 && num2 == 1 && pro.getHotel() == false && colorcheck == 4)
                    {
                        System.out.println("How many houses would you like to buy? (MAX is 4)");
                        int buyhouse = s.nextInt();
                        p.setMoney(-50*buyhouse);
                        pro.setHouses(buyhouse);
                        p.setHouses(buyhouse);
                        if(pro.getHouses() == 4)
                        {
                            pro.setHotel(true);
                            p.setHotel(p.getHotel()+1);
                            System.out.println("You now have a hotel on " + pro.getName() + ".");
                        }
                        else
                        {
                            System.out.println("You now have " + pro.getHouses() + " house on " + pro.getName() + ".");
                        }
                    }
                    else if(num2 == 2)
                    {
                        System.out.println("You have decided to pass.");
                    }
                    else
                    {
                        if(pro.getHotel() == true)
                        {
                            System.out.println("You already have a hotel. You cannot buy anything else.");
                        }
                        else if(colorcheck != 4)
                        {
                            System.out.println("You do not have all the properties from that color group.");
                        }
                        else
                        {
                            System.out.println("You do not have enough money to purchase a house or you have hit an invalid key.");
                        }
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == pro.getPost() && pro.getOwner() == 2 && pro.getTileType().equals("property"))
                {
                    System.out.println("You have landed on owned " + pro.getTileType() + ", " + pro.getName() +".");
                    if(pro.getHouses() == 1)
                    {
                        p.setMoney(-50);
                        op.setMoney(50);
                        System.out.println("There is one house on this property. You pay $50.");
                    }
                    else if(pro.getHouses() == 2)
                    {
                        p.setMoney(-75);
                        op.setMoney(75);
                        System.out.println("There are two houses on this property. You pay $75.");
                    }
                    else if (pro.getHouses() == 3)
                    {
                        p.setMoney(-100);
                        op.setMoney(100);
                        System.out.println("There are three houses on this property. You pay $100.");
                    }
                    else if (pro.getHotel() == true)
                    {
                        p.setMoney(-150);
                        op.setMoney(150);
                        System.out.println("There is one hotel on this property. You pay $150.");
                    }
                    else
                    {
                        p.setMoney(-25);
                        op.setMoney(25);
                        System.out.println("There are no houses on this property. You pay $25.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // RAILROADS
            for (Railroads road : r)
            {
                if(p.getPosition() == road.getPost() && road.getOwner() == 0 && road.getTileType().equals("railroads"))
                {
                    System.out.println("You have landed on unowned " + road.getTileType() + ", " + road.getName() + ".");
                    System.out.println("Enter 1 to buy. Enter 2 to pass.");
                    int num1 = s.nextInt();
                    s.nextLine();
                    if(p.getMoney() >= road.getPrice() && num1 == 1)
                    {
                        road.setOwner(1);
                        p.addRailroad(road);
                        p.setMoney(-1*road.getPrice());
                        System.out.println("You will now purchase it for $" + road.getPrice() + ".");
                    }
                    else if(num1 == 2)
                    {
                        System.out.println("You have decided to pass.");
                    }
                    else
                    {
                        System.out.println("You do not have enough money to purchase this railroad or you have hit an invalid key.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == road.getPost() && road.getOwner() == 1 && road.getTileType().equals("railroads"))
                {
                    System.out.println("You already have this railroad.");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == road.getPost() && road.getOwner() == 2 && road.getTileType().equals("railroads"))
                {
                    System.out.println("You have landed on owned " + road.getTileType() + ", " + road.getName() +".");
                    int oprail = op.getRail().size();
                    if(oprail == 2)
                    {
                        p.setMoney(-50);
                        op.setMoney(50);
                        System.out.println("The other player owns two railroads. You pay $50.");
                    }
                    else if(oprail == 3)
                    {
                        p.setMoney(-75);
                        op.setMoney(75);
                        System.out.println("The other player owns three railroads. You pay $75.");
                    }
                    else if(oprail == 4)
                    {
                        p.setMoney(-100);
                        op.setMoney(100);
                        System.out.println("The other player owns four railroads. You pay $100.");
                    }
                    else
                    {
                        p.setMoney(-25);
                        op.setMoney(25);
                        System.out.println("The other player owns one railroad. You pay $25.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // Utility
            for (Utility ult : u)
            {
                if(p.getPosition() == ult.getPost() && ult.getOwner() == 0 && ult.getTileType().equals("utility"))
                {
                    System.out.println("You have landed on unowned " + ult.getTileType() + ", " + ult.getName() + ".");
                    System.out.println("Enter 1 to buy. Enter 2 to pass.");
                    int num1 = s.nextInt();
                    s.nextLine();
                    if(p.getMoney() >= ult.getPrice() && num1 == 1)
                    {
                        ult.setOwner(1);
                        p.addUlt(ult);
                        p.setMoney(-1*ult.getPrice());
                        System.out.println("You will now purchase it for $" + ult.getPrice() + ".");
                    }
                    else if(num1 == 2)
                    {
                        System.out.println("You have decided to pass.");
                    }
                    else
                    {
                        System.out.println("You do not have enough money to purchase this utility or you have hit an invalid key.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == ult.getPost() && ult.getOwner() == 1 && ult.getTileType().equals("utility"))
                {
                    System.out.println("You already have this utility and now you can collect some money.");
                    System.out.println("YOU ROLLED A " + sum + ". You collect $" + (sum*4));
                    p.setMoney(sum*4);
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == ult.getPost() && ult.getOwner() == 2 && ult.getTileType().equals("utility"))
                {
                    System.out.println("You have landed on owned " + ult.getTileType() + ", " + ult.getName() +" and now you must pay the other player.");
                    System.out.println("YOU ROLLED A " + sum + ". You pay $" + (sum*4));
                    p.setMoney(-1*(sum*4));
                    op.setMoney(sum*4);
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // LUXURY TAX
            for (LuxuryTax lt: l)
            {
                if(p.getPosition() == lt.getPost() && lt.getTileType().equals("luxury tax"))
                {
                    System.out.println("You have hit luxury tax. You owe $" + lt.getTax());
                    p.setMoney(-1* lt.getTax());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // FREE PARKING
            for (FreeParking fp: free)
            {
                if(p.getPosition() == fp.getPost() && fp.getTileType().equals("FreeParking"))
                {
                    System.out.println("You have hit a free parking square. Just relax!");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 1's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // PASS BY JAIL
            if(p.getPosition() == 10)
            {
                System.out.println("You are just passing by jail. Nothing to worry about.");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 1's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }

            // GO TO JAIL
            if(p.getPosition() == 26)
            {
                p.setinJail(true);
                p.setdaysInJail(3);
                p.setPosition(10);
                System.out.println("POLICE HAVE PUT YOU IN JAIL. YOU LOSE THREE TURNS UNLESS U ROLL A DOUBLE.");
                System.out.println("PAY $50 FINE WHEN U GET OUT.");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 1's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }

            // Chances
            if(p.getPosition() == 14 || p.getPosition() == 24)
            {
                System.out.println("You have landed on a CHANCE square. Enter any number to draw a card.");
                int drawChance = s.nextInt();
                s.nextLine();
                int randomDraw = (int)(Math.random() * (cc.size()-1));
                System.out.println(cc.get(randomDraw).getActivity());
                p.setMoney(cc.get(randomDraw).getValue());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 1's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }
        }
    }

        // PLAYER TWO
    public static void playerTwo(Player p, ArrayList <Property> prop, ArrayList <Railroads> r, ArrayList <Utility> u, ArrayList <LuxuryTax> l, ArrayList <FreeParking> free, Player op, ArrayList <ChanceCard> cc)
    {
        System.out.println("~" + p.getPosition());
        Scanner s = new Scanner(System.in);
        // rolls dice
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int sum = (dice1 + dice2);
        System.out.println("Player 2: YOU ROLLED A " + sum);
        if(p.getinJail() == true && p.getdaysInJail() > 0)
        {
            p.setPosition(10);
        }
        else
        {
            if(((p.getPosition() + sum)%32) == 0)
            {
                p.setPosition(32);
            }
            else
            {
                p.setPosition((p.getPosition() + sum)%32);
            }
            if(p.getPosition() < 32 && p.getPosition()-sum < 2)
            {
                System.out.println("Here's $50 for passing GO!");
                p.setMoney(50);
            }
        }
        System.out.println("~" + p.getPosition());
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Player 2's Current Balance: " + p.getMoney());
        System.out.println(p.toString());
        System.out.println("--------------------------------------------------------------------------------");
        if(p.getinJail() == true && p.getdaysInJail() > 0)
        {
            if(dice1 == dice2)
            {
                p.setinJail(false);
                System.out.println("You rolled a double. You got out of jail free.");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 2's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }
            else
            {
                p.setdaysInJail(-1);
                System.out.println("You did NOT roll a double. Stay in jail.");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 2's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }
        }
        else if(p.getinJail() == true && p.getdaysInJail() == 0)
        {
            p.setMoney(-50);
            p.setinJail(false);
            System.out.println("You finished your jail sentence and can pay a $50 fine to get out.");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Player 2's Current Balance: " + p.getMoney());
            System.out.println(p.toString());
            System.out.println("--------------------------------------------------------------------------------");
            System.out.println("Your turn is over.");
            System.out.println("Enter any number to continue.");
            int cont = s.nextInt();
            s.nextLine();
        }
        else
        {
            // PROPERTY
            for (Property pro: prop)
            {
                if(p.getPosition() == pro.getPost() && pro.getOwner() == 0 && pro.getTileType().equals("property"))
                {
                    System.out.println("You have landed on unowned " + pro.getTileType() + ", " + pro.getName() + ".");
                    System.out.println("Enter 1 to buy. Enter 2 to pass.");
                    int num1 = s.nextInt();
                    s.nextLine();
                    if(p.getMoney() >= pro.getPrice() && num1 == 1)
                    {
                        pro.setOwner(2);
                        p.addProp(pro);
                        p.setMoney(-1*pro.getPrice());
                        System.out.println("You will now purchase it for $" + pro.getPrice() + ".");
                    }
                    else if(num1 == 2)
                    {
                        System.out.println("You have decided to pass.");
                    }
                    else
                    {
                        System.out.println("You do not have enough money to purchase this property or you have hit an invalid key.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == pro.getPost() && pro.getOwner() == 2 && pro.getTileType().equals("property"))
                {
                    System.out.println("You have landed on your own property, " + pro.getName() + ". It currently has " + pro.getHouses() + " houses.");
                    System.out.println("Note 1: if you are buying your fourth house, it will automatically be converted into a hotel.");
                    System.out.println("Note 2: you must own all the properties from that color group before you can build a house.");
                    System.out.println("Enter 1 to buy a house for $50. Enter 2 to pass.");
                    int num2 =s.nextInt();
                    s.nextLine();
                    int colorcheck = 0;
                    for(Property pr : p.getProp())
                    {
                        if (pr.getColor().equals(pro.getColor()))
                        {
                            colorcheck++;
                        }
                    }
                    if(p.getMoney() >= 50 && num2 == 1 && pro.getHotel() == false && colorcheck == 4)
                    {
                        System.out.println("How many houses would you like to buy? (MAX is 4)");
                        int buyhouse = s.nextInt();
                        p.setMoney(-50*buyhouse);
                        pro.setHouses(buyhouse);
                        p.setHouses(buyhouse);
                        if(pro.getHouses() == 4)
                        {
                            pro.setHotel(true);
                            p.setHotel(p.getHotel()+1);
                            System.out.println("You now have a hotel on " + pro.getName() + ".");
                        }
                        else
                        {
                            System.out.println("You now have " + pro.getHouses() + " house on " + pro.getName() + ".");
                        }
                    }
                    else if(num2 == 2)
                    {
                        System.out.println("You have decided to pass.");
                    }
                    else
                    {
                        if(pro.getHotel() == true)
                        {
                            System.out.println("You already have a hotel. You cannot buy anything else.");
                        }
                        if(colorcheck != 4)
                        {
                            System.out.println("You do not have all the properties from that color group.");
                        }
                        else
                        {
                            System.out.println("You do not have enough money to purchase a house or you have hit an invalid key.");
                        }
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == pro.getPost() && pro.getOwner() == 1 && pro.getTileType().equals("property"))
                {
                    System.out.println("You have landed on owned " + pro.getTileType() + ", " + pro.getName() +".");
                    if(pro.getHouses() == 1)
                    {
                        p.setMoney(-50);
                        op.setMoney(50);
                        System.out.println("There is one house on this property. You pay $50.");
                    }
                    else if(pro.getHouses() == 2)
                    {
                        p.setMoney(-75);
                        op.setMoney(75);
                        System.out.println("There are two houses on this property. You pay $75.");
                    }
                    else if (pro.getHouses() == 3)
                    {
                        p.setMoney(-100);
                        op.setMoney(100);
                        System.out.println("There are three houses on this property. You pay $100.");
                    }
                    else if (pro.getHotel() == true)
                    {
                        p.setMoney(-150);
                        op.setMoney(150);
                        System.out.println("There is one hotel on this property. You pay $150.");
                    }
                    else
                    {
                        p.setMoney(-25);
                        op.setMoney(25);
                        System.out.println("There are no houses on this property. You pay $25.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // RAILROADS
            for (Railroads road : r)
            {
                if(p.getPosition() == road.getPost() && road.getOwner() == 0 && road.getTileType().equals("railroads"))
                {
                    System.out.println("You have landed on unowned " + road.getTileType() + ", " + road.getName() + ".");
                    System.out.println("Enter 1 to buy. Enter 2 to pass.");
                    int num1 = s.nextInt();
                    s.nextLine();
                    if(p.getMoney() >= road.getPrice() && num1 == 1)
                    {
                        road.setOwner(2);
                        p.addRailroad(road);
                        p.setMoney(-1*road.getPrice());
                        System.out.println("You will now purchase it for $" + road.getPrice() + ".");
                    }
                    else if(num1 == 2)
                    {
                        System.out.println("You have decided to pass.");
                    }
                    else
                    {
                        System.out.println("You do not have enough money to purchase this railroad or you have hit an invalid key.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == road.getPost() && road.getOwner() == 2 && road.getTileType().equals("railroads"))
                {
                    System.out.println("You already have this railroad.");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == road.getPost() && road.getOwner() == 1 && road.getTileType().equals("railroads"))
                {
                    System.out.println("You have landed on owned " + road.getTileType() + ", " + road.getName() +".");
                    int oprail = op.getRail().size();
                    if(oprail == 2)
                    {
                        p.setMoney(-50);
                        op.setMoney(50);
                        System.out.println("The other player owns two railroads. You pay $50.");
                    }
                    else if(oprail == 3)
                    {
                        p.setMoney(-75);
                        op.setMoney(75);
                        System.out.println("The other player owns three railroads. You pay $75.");
                    }
                    else if(oprail == 4)
                    {
                        p.setMoney(-100);
                        op.setMoney(100);
                        System.out.println("The other player owns four railroads. You pay $100.");
                    }
                    else
                    {
                        p.setMoney(-25);
                        op.setMoney(25);
                        System.out.println("The other player owns one railroad. You pay $25.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // Utility
            for (Utility ult : u)
            {
                if(p.getPosition() == ult.getPost() && ult.getOwner() == 0 && ult.getTileType().equals("utility"))
                {
                    System.out.println("You have landed on unowned " + ult.getTileType() + ", " + ult.getName() + ".");
                    System.out.println("Enter 1 to buy. Enter 2 to pass.");
                    int num1 = s.nextInt();
                    s.nextLine();
                    if(p.getMoney() >= ult.getPrice() && num1 == 1)
                    {
                        ult.setOwner(2);
                        p.addUlt(ult);
                        p.setMoney(-1*ult.getPrice());
                        System.out.println("You will now purchase it for $" + ult.getPrice() + ".");
                    }
                    else if(num1 == 2)
                    {
                        System.out.println("You have decided to pass.");
                    }
                    else
                    {
                        System.out.println("You do not have enough money to purchase this utility or you have hit an invalid key.");
                    }
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == ult.getPost() && ult.getOwner() == 2 && ult.getTileType().equals("utility"))
                {
                    System.out.println("You already have this utility and now you can collect some money.");
                    System.out.println("YOU ROLLED A " + sum + ". You collect $" + (sum*4));
                    p.setMoney(sum*4);
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
                if(p.getPosition() == ult.getPost() && ult.getOwner() == 1 && ult.getTileType().equals("utility"))
                {
                    System.out.println("You have landed on owned " + ult.getTileType() + ", " + ult.getName() +" and now you must pay the other player.");
                    System.out.println("YOU ROLLED A " + sum + ". You pay $" + (sum*4));
                    p.setMoney(-1*(sum*4));
                    op.setMoney(sum*4);
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }
            // LUXURY TAX
            for (LuxuryTax lt: l)
            {
                if(p.getPosition() == lt.getPost() && lt.getTileType().equals("luxury tax"))
                {
                    System.out.println("You have hit luxury tax. You owe $" + lt.getTax());
                    p.setMoney(-1* lt.getTax());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // FREE PARKING
            for (FreeParking fp: free)
            {
                if(p.getPosition() == fp.getPost() && fp.getTileType().equals("FreeParking"))
                {
                    System.out.println("You have hit a free parking square. Just relax!");
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Player 2's Current Balance: " + p.getMoney());
                    System.out.println(p.toString());
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("Your turn is over.");
                    System.out.println("Enter any number to continue.");
                    int cont = s.nextInt();
                    s.nextLine();
                    break;
                }
            }

            // PASS BY JAIL
            if(p.getPosition() == 10)
            {
                System.out.println("You are just passing by jail. Nothing to worry about.");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 2's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }

            // GO TO JAIL
            if(p.getPosition() == 26)
            {
                p.setinJail(true);
                p.setdaysInJail(3);
                p.setPosition(10);
                System.out.println("POLICE HAVE PUT YOU IN JAIL. YOU LOSE THREE TURNS UNLESS U ROLL A DOUBLE.");
                System.out.println("PAY $50 FINE WHEN U GET OUT.");
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 2's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }

            // CHANCE
            if(p.getPosition() == 14 || p.getPosition() == 24)
            {
                System.out.println("You have landed on a CHANCE square. Enter any number to draw a card.");
                int drawChance = s.nextInt();
                s.nextLine();
                int randomDraw = (int)(Math.random() * (cc.size()-1));
                System.out.println(cc.get(randomDraw).getActivity());
                p.setMoney(cc.get(randomDraw).getValue());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 2's Current Balance: " + p.getMoney());
                System.out.println(p.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = s.nextInt();
                s.nextLine();
            }
        }
    }

    // checks for winner
    public static void checkWinner(Player one, Player two)
    {
        Scanner cw = new Scanner(System.in);
        boolean quit = false;
        boolean quit2 = false;
        while(one.getMoney() < 0 && quit == false)
        {
            System.out.println("Player 1: You are bankrupt and must mortgage property to continue.");
            System.out.println("Enter 1 to mortgage. Enter any other number to quit the game.");
            int mort1 = cw.nextInt();
            cw.nextLine();
            if (mort1 == 1)
            {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 1's Current Balance: " + one.getMoney());
                System.out.println(one.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Note: you will earn back 50% of the original property value. All houses/hotels will return to the bank.");
                System.out.println("Enter the name of the property you want to mortgage.");
                String mortprop = cw.nextLine();
                for(Property p: one.getProp())
                {
                    if(mortprop.equals(p.getName()))
                    {
                        one.setMoney((int)(0.5*p.getPrice()));
                        one.setHouses(-p.getHouses());
                        one.getProp().remove(p);
                        if(p.getHotel() == true)
                        {
                            one.setHotel(one.getHotel()-1);
                        }
                        p.setOwner(0);
                        p.setHotel(false);
                        p.setHouses(p.getHouses()*0);
                        System.out.println("You have successfully mortgaged this property. It will return to the bank and other players will be able to buy it.");
                        break;
                    }
                }
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 1's Current Balance: " + one.getMoney());
                System.out.println(one.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = cw.nextInt();
                cw.nextLine();
            }
            else
            {
                quit = true;
                System.out.println(" ");
                System.out.println("~~~Player 2 has won the game!~~~");
                System.exit(0);
            }

        }
        while(two.getMoney() < 0 && quit2 == false)
        {
            System.out.println("Player 2: You are bankrupt and must mortgage property to continue.");
            System.out.println("Enter 1 to mortgage. Enter any other number to quit the game.");
            int mort1 = cw.nextInt();
            cw.nextLine();
            if (mort1 == 1)
            {
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 2's Current Balance: " + two.getMoney());
                System.out.println(two.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Note: you will earn back 50% of the original property value. All houses/hotels will return to the bank.");
                System.out.println("Enter the name of the property you want to mortgage.");
                String mortprop = cw.nextLine();
                for(Property p: two.getProp())
                {
                    if(mortprop.equals(p.getName()))
                    {
                        two.setMoney((int)(0.5*p.getPrice()));
                        two.getProp().remove(p);
                        two.setHouses(-p.getHouses());
                        if(p.getHotel() == true)
                        {
                            two.setHotel(two.getHotel()-1);
                        }
                        p.setOwner(0);
                        p.setHotel(false);
                        p.setHouses(p.getHouses()*0);
                        System.out.println("You have successfully mortgaged this property. It will return to the bank and other players will be able to buy it.");
                        break;
                    }
                }
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Player 2's Current Balance: " + two.getMoney());
                System.out.println(two.toString());
                System.out.println("--------------------------------------------------------------------------------");
                System.out.println("Your turn is over.");
                System.out.println("Enter any number to continue.");
                int cont = cw.nextInt();
                cw.nextLine();
            }
            else
            {
                quit2 = true;
                System.out.println(" ");
                System.out.println("***Player 1 has won the game!***");
                System.exit(0);
            }
        }
        System.out.println();
    }

    // creates the Monopoly board
    public static String [][] createBoard(Player one, Player two)
    {
        String[][] board = new String[19][91];
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                if (j == 0 || j == 10 || j == board[i].length - 1 || j == board[i].length-11)
                {
                    board[i][j] = "|";
                }
                else if ((i == 1 || i == 2 || i == board.length-1 || i == board.length-2 || i == 0) && (j == 0 || j % 10 == 0))
                {
                    board[i][j] = "|";
                }
                else if(i % 2 == 0)
                {
                    board[i][j] = "_";
                }
                else
                {
                    board[i][j] = " ";
                }
            }
        }
        for (int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[i].length; j++)
            {
                if((i > 2 && i < 16 && j > 10 && j < 80))
                {
                    board[i][j] = " ";
                }
            }
        }
        // Free Parking
        board[1][1] = "F";
        board[1][2] = "P";
        board[1][3] = "1";
        board[1][81] = "F";
        board[1][82] = "P";
        board[1][83] = "2";
        board[17][81] = "F";
        board[17][82] = "P";
        board[17][83] = "3";
        board[17][1] = "F";
        board[17][2] = "P";
        board[17][3] = "4";

        // Start
        board[1][11] = "S";
        board[1][12] = "T";
        board[1][13] = "A";
        board[1][14] = "R";
        board[1][15] = "T";
        board[2][11] = "+";
        board[2][12] = "$";
        board[2][13] = "2";
        board[2][14] = "0";
        board[2][15] = "0";

        // Blue Properties
        board[3][1] = "B";
        board[3][2] = "P";
        board[3][3] = "4";
        board[4][1] = "$";
        board[4][2] = "2";
        board[4][3] = "0";
        board[4][4] = "0";
        board[5][1] = "B";
        board[5][2] = "P";
        board[5][3] = "3";
        board[6][1] = "$";
        board[6][2] = "1";
        board[6][3] = "7";
        board[6][4] = "5";
        board[13][1] = "B";
        board[13][2] = "P";
        board[13][3] = "1";
        board[14][1] = "$";
        board[14][2] = "1";
        board[14][3] = "2";
        board[14][4] = "5";
        board[11][1] = "B";
        board[11][2] = "P";
        board[11][3] = "2";
        board[12][1] = "$";
        board[12][2] = "1";
        board[12][3] = "5";
        board[12][4] = "0";

        // Yellow Properties
        board[1][21] = "Y";
        board[1][22] = "P";
        board[1][23] = "1";
        board[2][21] = "$";
        board[2][22] = "1";
        board[2][23] = "2";
        board[2][24] = "5";
        board[1][31] = "Y";
        board[1][32] = "P";
        board[1][33] = "2";
        board[2][31] = "$";
        board[2][32] = "1";
        board[2][33] = "5";
        board[2][34] = "0";
        board[1][61] = "Y";
        board[1][62] = "P";
        board[1][63] = "3";
        board[2][61] = "$";
        board[2][62] = "1";
        board[2][63] = "7";
        board[2][64] = "5";
        board[1][71] = "Y";
        board[1][72] = "P";
        board[1][73] = "4";
        board[2][71] = "$";
        board[2][72] = "2";
        board[2][73] = "0";
        board[2][74] = "0";

        // Red Properties
        board[5][81] = "R";
        board[5][82] = "P";
        board[5][83] = "1";
        board[6][81] = "$";
        board[6][82] = "1";
        board[6][83] = "2";
        board[6][84] = "5";
        board[7][81] = "R";
        board[7][82] = "P";
        board[7][83] = "2";
        board[8][81] = "$";
        board[8][82] = "1";
        board[8][83] = "5";
        board[8][84] = "0";
        board[13][81] = "R";
        board[13][82] = "P";
        board[13][83] = "3";
        board[14][81] = "$";
        board[14][82] = "1";
        board[14][83] = "7";
        board[14][84] = "5";
        board[15][81] = "R";
        board[15][82] = "P";
        board[15][83] = "4";
        board[16][81] = "$";
        board[16][82] = "2";
        board[16][83] = "0";
        board[16][84] = "0";

        // Green Properties
        board[17][71] = "G";
        board[17][72] = "P";
        board[17][73] = "1";
        board[18][71] = "$";
        board[18][72] = "1";
        board[18][73] = "2";
        board[18][74] = "5";
        board[17][61] = "G";
        board[17][62] = "P";
        board[17][63] = "2";
        board[18][61] = "$";
        board[18][62] = "1";
        board[18][63] = "5";
        board[18][64] = "0";
        board[17][31] = "G";
        board[17][32] = "P";
        board[17][33] = "3";
        board[18][31] = "$";
        board[18][32] = "1";
        board[18][33] = "7";
        board[18][34] = "5";
        board[17][21] = "G";
        board[17][22] = "P";
        board[17][23] = "4";
        board[18][21] = "$";
        board[18][22] = "2";
        board[18][23] = "0";
        board[18][24] = "0";

        // Railroads
        board[1][41] = "R";
        board[1][42] = "R";
        board[1][43] = "1";
        board[2][41] = "$";
        board[2][42] = "1";
        board[2][43] = "5";
        board[2][44] = "0";
        board[17][41] = "R";
        board[17][42] = "R";
        board[17][43] = "3";
        board[18][41] = "$";
        board[18][42] = "1";
        board[18][43] = "5";
        board[18][44] = "0";
        board[9][81] = "R";
        board[9][82] = "R";
        board[9][83] = "2";
        board[10][81] = "$";
        board[10][82] = "1";
        board[10][83] = "5";
        board[10][84] = "0";
        board[9][1] = "R";
        board[9][2] = "R";
        board[9][3] = "4";
        board[10][1] = "$";
        board[10][2] = "1";
        board[10][3] = "5";
        board[10][4] = "0";

        // Luxury Taxes
        board[1][51] = "L";
        board[1][52] = "U";
        board[1][53] = "X";
        board[1][54] = "1";
        board[2][51] = "-";
        board[2][52] = "$";
        board[2][53] = "2";
        board[2][54] = "0";
        board[2][55] = "0";
        board[7][1] = "L";
        board[7][2] = "U";
        board[7][3] = "X";
        board[7][4] = "2";
        board[8][1] = "-";
        board[8][2] = "$";
        board[8][3] = "1";
        board[8][4] = "0";
        board[8][5] = "0";

        // Utility
        board[17][51] = "U";
        board[17][52] = "L";
        board[17][53] = "T";
        board[18][51] = "$";
        board[18][52] = "1";
        board[18][53] = "0";
        board[18][54] = "0";

        // Chance Cards
        board[11][81] = "C";
        board[11][82] = "H";
        board[11][83] = "A";
        board[11][84] = "N";
        board[11][85] = "C";
        board[11][86] = "E";
        board[17][11] = "C";
        board[17][12] = "H";
        board[17][13] = "A";
        board[17][14] = "N";
        board[17][15] = "C";
        board[17][16] = "E";

        // Jail
        board[3][81] = "J";
        board[3][82] = "A";
        board[3][83] = "I";
        board[3][84] = "L";

        board[15][1] = "G";
        board[15][2] = "O";
        board[15][4] = "T";
        board[15][5] = "O";
        board[16][1] = "J";
        board[16][2] = "A";
        board[16][3] = "I";
        board[16][4] = "L";

        if(one.getPosition() >= 1 && one.getPosition() <= 9)
        {
            board[1][one.getPosition()*10-2] = "*";
        }
        if(one.getPosition() >= 10 && one.getPosition() <= 16)
        {
            board[((one.getPosition()-10)*2)+3][88] = "*";
        }
        if(one.getPosition() >= 17 && one.getPosition() <= 25)
        {
            board[17][88-((one.getPosition()-17)*10)] = "*";
        }
        if(one.getPosition() >= 26 && one.getPosition() <= 32)
        {
            board[15-((one.getPosition()-26)*2)][8] = "*";
        }
        if(two.getPosition() >= 1 && two.getPosition() <= 9)
        {
            board[2][two.getPosition()*10-2] = "~";
        }
        if(two.getPosition() >= 10 && two.getPosition() <= 16)
        {
            board[((two.getPosition()-10)*2)+4][88] = "~";
        }
        if(two.getPosition() >= 17 && two.getPosition() <= 25)
        {
            board[18][88-((two.getPosition()-17)*10)] = "~";
        }
        if(two.getPosition() >= 26 && two.getPosition() <= 32)
        {
            board[15-((two.getPosition()-26)*2)+1][8] = "~";
        }

        return board;
    }

    // displays the Monopoly board
    public static void displayBoard(String [][] b)
    {
        for (int i = 0; i < b.length; i++)
        {
            for (int j = 0; j < b[i].length; j++)
            {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
