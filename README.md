# Chloe's Monopoly 

Chloe's Monopoly is a simplified version of the classic Monopoly boardgame. The program utilizes an abstract class, an interface, and 11 object classes. Additionally there are two other methods in the main class. createBoard uses a 2d array to map out all squares and visually shows where each player's pieces are at. checkWinner checks for bankruptcy every turn and allows users to mortgage property (for 50% original value) to earn money. 

Note: Player 1 has the * piece and Player 2 has the ~ piece. 

1. Every turn, the dice will automatically be rolled and the board will be displayed. The player will be shown their starting position, ending position (after the roll), and what number they rolled. The player's current balance and owned items (properties, utilities, railroads, houses, hotels) will also be shown. 
*2
Player 1: YOU ROLLED A 8 
*10
--------------------------------------------------------------------------------
Player 1's Current Balance: 300
What Player 1 owns:       0 houses, 0 hotels
--------------------------------------------------------------------------------

2. Properties
If a player lands on an unowned property, they can enter 1 to buy it. After the transaction, an updated version of the player's items will be shown. 

You will now purchase it for $150.
--------------------------------------------------------------------------------
Player 1's Current Balance: 150
What Player 1 owns:  YP2      0 houses, 0 hotels
--------------------------------------------------------------------------------

If a player lands on an owned property, they will be automatically charged and rent will be paid to the other player. 

2a. Houses/Hotels
A player can only purchase a house when they own all four properties from the color group. Then, they are able to buy as many as four houses at a time for a property. Four houses on one property will automatically be converted into a hotel. Players that land on owned properties with houses/hotels will pay a substantially higher rent. 

3. Railroads
If a player lands on an unowned railroad, they can enter 1 to buy it. After the transaction, an updated version of the player's items will be shown. (see above). 
If a player lands on an owned railroad, they will be automatically charged and rent will be paid to the other player. 
Note: If one player has multiple railroads, the rent for each railroad will increase. 

4. Utility 
If a player lands on an unowned railroad, they can enter 1 to buy it. If they land on the utility again, they will get money from the bank (4*dice roll). If another player lands on their utility, the other player will pay them that same amount. 

5. Luxury Tax
Luxury taxes will automatically be charged from the players. 

6. Free Parking 
Just relax here! 

7. GO
Players earn $200 every time they pass GO, unless they passed it by going to JAIL (see below). 

8. GO TO JAIL 
If a player lands on the GO TO JAIL square, they will automatically go to position 10 (Jail). They will not earn $200 and miss three turns unless they roll a double. If a double is not rolled on any of the three turns, they will pay a $50 fine to get out. 

8b. Pass JAIL 
If a player lands on the JAIL square, not the GO TO JAIL square, all is well. 

9. Chance 
If a player lands on a Chance square, they enter any number to draw a card. The Chance cards either win them money or lose them money. 

10. BANKRUPTCY (how to win)
A player will not be allowed to buy anything that they cannot afford (negative money). If they do not have enough money to pay a fine, land on a Luxury Tax square, or pay rent to another player, they must mortgage to stay in the game. Only properties are allowed to be mortgaged. Once a property is mortgaged, it becomes unowned and another player can buy it. Houses and hotels on the property will be returned to the bank. The player then earns 50% of the original value. If a player mortgages all their properties and still has negative money, they will be forced to file for bankrupty. Thus, the other player will win the game and the program will end. 

Abbreviations on the board: 
Properties: RP1 = Red Property 1 (GP is green, YP is yellow, BP is blue) 
Railroads: RR1 = Railroad 1
Utilities: ULT = Utility 
Free Parking: FP1 = Free Parking 1
Luxury Taxes: LUX1 = Luxury Tax 1 

Happy playing!

- Chloe 
