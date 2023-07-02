# Tick_tack_toe
Tic-tac-toe is a game played on a grid with 9 cells. Two players take turns marking X or O on empty cells. The first to get 3 marks in a row (horizontally, vertically, or diagonally) wins. 
The provided code is a Java implementation of the Tic-tac-toe game. It uses a 2D array board to represent the game board, with 'X' and 'O' as player moves and empty spaces represented by ' '.

The main method initializes the game board and displays it. It then calls the play method to start the game.

The play method is a recursive function that handles the game flow. It checks if the player has won, lost, or if it's a draw by calling the won, lost, and Empty_spaces methods, respectively. If any of these conditions are met, the game ends. Otherwise, it proceeds to let the player and the computer make their moves alternately.

The select_space method prompts the player to enter their move as (Row, Column) coordinates. It checks if the selected space is empty using the isEmpty method and updates the board if the move is valid.

The select_space_auto method represents the computer's move. It checks for winning moves for both the player and the computer and tries to block the player from winning. If no winning moves are available, it selects an empty space randomly.

The won and lost methods check if the player or the computer has won the game, respectively, by checking all possible winning combinations.

The display method prints the current state of the game board.

The Empty_spaces method checks if there are any empty spaces left on the board.

Overall, the code allows the player to play Tic-tac-toe against the computer. The computer makes its moves strategically to win or block the player from winning. The game continues until there's a winner or a draw.
