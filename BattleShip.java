import java.lang.*;
import java.util.*;
// the default Battle Ship game
// 6 x 6 board
/* 
         0     1     2     3     4     5
      =====================================
    0 |__X__|__X__|_____|_____|_____|__X__|  
    1 |_____|_____|_____|_____|_____|__X__|   
    2 |_____|_____|__X__|_____|_____|__X__|
    3 |_____|_____|__X__|_____|_____|_____|
    4 |_____|_____|__X__|_____|_____|_____|   
    5 |_____|_____|__X__|_____|_____|_____|
      =====================================
*/
// 3 ships

public class BattleShip
  {
  // attributes of the program
  int numShips = 3; // stores max numbers of ships per player

  int numPlayers = 1; // stores number of players (1 default)
  String[] playerNames = new String[numPlayers]; // stores the names of players
  int rows = 6;
  int cols = 6;
  int[][] shipLocations; // stores ship locations (0 means empty, 1 means marked)
  int[][] board; // stores the board for the BattleShip game

  // constructor
  public BattleShip(String playerName)
    {
    // make board given rows and column values
    this.board = new int[rows][cols];
    this.shipLocations = new int[rows][cols];
    // set where the ships are (visual at the top of this file)
    // mark @ (0, 0)
    shipLocations[0][0] = 1;
    // mark @ (0, 1)
    shipLocations[0][1] = 1;
    // mark @ (0, 5)
    shipLocations[0][5] = 1;
    // mark @ (1, 5)
    shipLocations[1][5] = 1;
    // mark @ (2, 5)
    shipLocations[2][5] = 1;
    // mark @ (2, 2)
    shipLocations[2][2] = 1;
    // mark @ (3, 2)
    shipLocations[3][2] = 1;
    // mark @ (4, 2)
    shipLocations[4][2] = 1;
    // mark @ (5, 2)
    shipLocations[5][2] = 1;

    // set player name
    playerNames[0] = playerName;
  }

  
  // draws out the board 
  public void printBoard()
  {
    String dashedLines = "";
    String separatingLines = "";
    for(int i = 0; i < rows; i++) 
    {
      dashedLines += "======";
      separatingLines += "------";
    }
    System.out.println(dashedLines);

      // print where the player has gone, and what ships it has hit
    // loop through every column for every row and print if board has been hit
    // if user hits a boat, board element = 1
    // if user misses, board element = 2
    // if user has not picked a spot, board element = 0
    for(int row = 0; row < board.length; row++)
    {
      System.out.print("|");
      for(int col = 0; col < board[0].length; col++)
      {
        System.out.print("  ");
        //if user spot is empty, print space in middle
        if(board[row][col] == 0)
        {
          System.out.print(" ");
        } 
        else if (board[row][col] == 1)
        {
          // Only runs if user HIT a boat
          System.out.print("X");
        } 
        else
        {
          // only runs if user MISSED a boat
          System.out.print("O");
        }
        System.out.print("  |");
      }
      System.out.println();
      // print out dashed lines only if it's not the last row
      if(row < (board.length - 1))
      {
        System.out.println(separatingLines);
      }
    }
  
    System.out.println(dashedLines);
  }

  // updates the board when player hits
  public int updateBoard(int row, int col)
  {
    // check if in bounds:
    if(row >= rows || col >= cols)
    {
      System.out.println("That's out of bounds! Try again.");
      return -1;
    }
    
    // check if the board is empty at that spot, mark it, otherwise return -1 (error)
    if(board[row][col] == 0)
    {
      // check if that spot is a boat location
      if(shipLocations[row][col] == 1)
      {
        // update board to HIT boat
        board[row][col] = 1;
      } else
      {
        // update board to MISSED boat
        board[row][col] = 2;
      }
      // if successful, return 0
      return 0;
    }

    System.out.println("That spot is already taken.");
    // return -1 if error
    return -1;
  }

  // stops the game when user has hit all the ships 
  public boolean checkForWinner() 
    {
    boolean won = true;
    // check all ship locations for marked spots; travers array
    for(int row = 0; row < shipLocations.length; row++)
    {
      for(int col = 0; col < shipLocations[0].length; col++)
      {
        // if all spots containing ships = 1, being HIT, won returns true  
        if(shipLocations[row][col] == 1)
        {
          // if a certain spot on the board is not equal to 1 (HIT) where it is shipLocations, then won is false 
          if(board[row][col] != 1)
          {
            won = false;
            return won;
          }
        }
      }
    }
    return true;
  }

  // for EightBattleShip class, mutates number of rows and columns 
  public void changeRowsCols(int newRows, int newCols) 
    {
    this.rows = newRows;
    this.cols = newCols;
  }

  // accessor methods
  // methods to return values of specific things (as stated in its method name)
  public int getNumShips() 
  {
    return numShips; // e.g. getNumShips returns number of ships in game 
  }
  public int getNumPlayers()
  {
    return numPlayers; 
  }
  public String[] getPlayerNames() 
    {
    return playerNames; 
  }
  public int getRows() 
    {
    return rows; 
  }
  public int getCols() 
    {
    return cols; 
  }
  public int[][] getShipLocations() 
    {
    return shipLocations; 
  }
  public int[][] getBoard() 
    {
    return board; 
  }

  // update shipLocations array (for inherited classes) 
  public void updateShipLocations(int rows, int cols) // changes size of ships
  {
    shipLocations = new int[rows][cols]; 
  }
  public void changeBoard(int rows, int cols) // changes number of rows and columns present on the board 
  {
    board = new int[rows][cols];
  }
  public void addShip(int row, int col) // adds amount of ships 
  {
    shipLocations[row][col] = 1;
  }
}