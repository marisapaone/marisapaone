/* This game is for playing rock, paper, scissors, lizard, or spock and will instruct the computer to randomly select either rock, paper, scissors, lizard, or spock and compare the user's choice and the computer's choice and determine the winner*/
#include <iostream>
#include <cstdlib>
int main (){
  srand (time(NULL));
  int computer = rand() % 5 +1;
  int user=0;

  std::cout << "Rock, Paper, Scissors!\n";

  std::cout << "1)✊\n2)✋\n3)✌️\n4)🦎\n5)🖖 \nShoot: \n";

  std::cin >> user;

  if (user == computer) {
    std::cout << "Tie!\n";
  }
  else if (user == 2 && computer == 1 || user==3 && computer == 2 || user == 1 && computer == 3 || user == 1 && computer == 4 || user == 4 && computer == 5 || user == 5 && computer ==3 || user == 3 && computer ==4 || user == 4 && computer == 2|| user == 2 && computer == 5 || user == 5 && computer == 1){
    std::cout << user << " beats " << computer;
    std::cout << " You win!\n";
  }
  else if (computer == 2 && user == 1 || computer == 3 && user ==2 || computer == 1 && user ==3 || computer ==1 && user ==4 || computer == 4 && user ==5 || computer ==5 && user == 3 || computer == 3 && user ==4 || computer == 4 & user ==2 || computer == 2 && user == 5 || computer ==5 && user ==1){
    std::cout << computer << " beats " << user;
    std::cout << " Computer wins! You loose!\n";
  }
  else {
    std::cout << "Invalid entry. Try again.";
  }
return 0;
}
