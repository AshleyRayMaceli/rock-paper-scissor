
//Perry's suggested specs
1. App accepts input and returns something, "paper", "paper".
2. App accept two separate inputs and return something, "rock" and "scissor", "rock" and "scissor".
3. App evaluates inputs, if first input beats second, return player 1 wins!
4. App evaluates inputs, if second beats first, return player 2 wins!
5. App allows computer to play as player 2 - generate input randomly,
return correct winner


//Mike's suggested specs
1. Rock beats scissors, "Rock", true
2. Scissors beats paper, "Scissors", true
3. Paper beats rock, "Paper", true
4. Scissors loses to rock, false
5. Paper loses to scissors, false
6. Rock loses to paper, false
7. Rock ties rock, "Rock", "Tie game, play again"


//Our initial specs
1. User enters symbol choice, "Paper", "Paper"
2. Computer randomly chooses Rock or Paper or Scissor, String "Rock",       String "Rock".
3. Determine winner, user enters "Rock" and computer enters "Scissor", win for user.
  3b. Paper wins vs. Rock, Paper, win.
  3c. Scissor wins vs. Paper, Scissor, win.
4. When computer and player choose same symbol, "Rock" and "Rock", tie game.

//Final BDD
1. Rock beats scissors, "Rock", true
2. Scissors beats paper, "Scissors", true
3. Paper beats rock, "Paper", true
4. Rock beats scissors, true, "Player 1 wins!"
5. announce tie, false and symbols are the same, "Tie!"
6. Scissors loses to rock, false, "Player 2 wins!"
//Integration tests
7. Get input of players, player1 "rock" player2 "scissors", "player 1 wins!"
