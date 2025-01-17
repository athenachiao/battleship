# Battleship Game

A Java implementation of the classic Battleship game where players try to sink enemy ships by guessing their locations on a grid.

## Description

This is a single-player implementation of the Battleship game with a 6x6 grid. The player attempts to find and sink three ships placed on the board by guessing their coordinates. The game features a command-line interface with a visual representation of the game board.

## Game Features

- 6x6 game board
- 3 ships with different sizes
- Visual board display
- Input validation for moves
- Hit/Miss tracking system

## Board Layout

The game board is displayed as follows:
- Empty spaces are shown as " "
- Hits are marked with "X"
- Misses are marked with "O"

## Game Rules

1. The game starts with three ships pre-positioned on the board
2. Player enters coordinates (row and column) to attack a position
3. If the attack hits a ship, an "X" is displayed
4. If the attack misses, an "O" is displayed
5. The game continues until all ships are sunk
6. Previously attacked positions cannot be targeted again

## Technical Details

### Class Structure

The `BattleShip` class contains:

#### Attributes
- `numShips`: Number of ships in the game (default: 3)
- `numPlayers`: Number of players (default: 1)
- `rows`: Number of rows on the board (default: 6)
- `cols`: Number of columns on the board (default: 6)
- `shipLocations`: 2D array tracking ship positions
- `board`: 2D array representing the game board

#### Key Methods
- `printBoard()`: Displays the current game state
- `updateBoard(row, col)`: Processes a player's move
- `checkForWinner()`: Verifies if all ships have been sunk
- Various getter methods for accessing game state

## Future Enhancements

The codebase includes provisions for potential extensions:
- Support for different board sizes
- Multiple player support
- Customizable ship counts and positions

## Getting Started

### Prerequisites
- Java Development Kit (JDK)
- Java Runtime Environment (JRE)

### Running the Game
1. Compile the Java file:
```bash
javac BattleShip.java
```

2. Run the compiled program:
```bash
java BattleShip
```

## Contributing

Feel free to fork this project and submit pull requests with improvements or bug fixes.
