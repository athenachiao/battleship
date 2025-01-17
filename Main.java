import java.lang.*;
import java.util.*;

class Main {
  public static void main(String[] args) 
  {
    // allow user input
    Scanner in = new Scanner(System.in);

    System.out.println("Enter Player 1's Name: ");
    String playerOne = in.nextLine();
    
    // print welcome message:
    System.out.println("Hi, " + playerOne + "!");

    // ask user if they want to play normal mode or extreme mode
    System.out.println("Do you want to play BattleShip normal mode, or extreme? (Type 1 for normal, 2 for extreme");
    int gameType = in.nextInt();
    
    // create battleship object
    BattleShip game;
    // if select 1, user is led to normal battleship class, else (2), leads to extended ver (inheretance class)
    if(gameType == 1)
    {
      game = new BattleShip(playerOne);
    } 
    else 
    {
      game = new EightBattleShip(playerOne);
    }
    

    int playerRow;
    int playerCol;
    // if game.checkForWinner is false...
    while(!game.checkForWinner())
    {
      // print the board
      game.printBoard();
      // ask player where they want to mark, row and column position according to board visual above 
      System.out.println();
      System.out.println("What row index do you want to mark? ");
      playerRow = in.nextInt();
      System.out.println("What column index do you want to mark? ");
      playerCol = in.nextInt();

      // updates board's condition with inputed points using updateBoard method
      game.updateBoard(playerRow, playerCol);
    }
    // when all ships are hit...
    System.out.println("Congrats!");
    
  }
}