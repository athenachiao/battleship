// same as BattleShip game, just larger grid, and one more ship (length 5)
public class EightBattleShip extends BattleShip
{  
  // attributes
  int rows = 8;
  int cols = 8;

  // access values from superclass and change their information within subclass
  public EightBattleShip(String playerName)
  {
    // updates game set up conditions
    super(playerName);
    // update grid to be 8x8
    super.changeRowsCols(rows, cols);
    // update ship locations
    super.updateShipLocations(rows, cols);
    // update board grid
    super.changeBoard(rows, cols);

    // update where ships are marked
    /* 
         0     1     2     3     4     5     6     7
      =================================================
    0 |__X__|__X__|_____|_____|__X__|_____|_____|_____| 
    1 |_____|_____|_____|_____|__X__|_____|_____|_____|    
    2 |_____|_____|_____|_____|__X__|_____|_____|_____|
    3 |_____|_____|_____|_____|__X__|_____|_____|__X__|
    4 |_____|_____|_____|_____|_____|_____|_____|__X__|   
    5 |_____|_____|_____|_____|_____|_____|_____|__X__|
    6 |__X__|__X__|__X__|_____|_____|_____|_____|__X__|
    7 |_____|_____|_____|_____|_____|_____|_____|__X__|
      =================================================
*/
    // change ship locations
    // mark @ (0, 0)
    super.addShip(0, 0);
    // mark @ (0, 1)
    super.addShip(0, 1);
    // mark @ (0, 4)
    super.addShip(0, 4);
    // mark @ (1, 4)
    super.addShip(1, 4);
    // mark @ (2, 4)
    super.addShip(2, 4);
    // mark @ (3, 4)
    super.addShip(3, 4);
    // mark @ (6, 0)
    super.addShip(6, 0);
    // mark @ (6, 1)
    super.addShip(6, 1);
    // mark @ (6, 2)
    super.addShip(6, 2);
    // mark @ (3, 7)
    super.addShip(3, 7);
    // mark @ (4, 7)
    super.addShip(4, 7);
    // mark @ (5, 7)
    super.addShip(5, 7);
    // mark @ (6, 7)
    super.addShip(6, 7);
    // mark @ (7, 7)
    super.addShip(7, 7);
  }
}