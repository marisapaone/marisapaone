#include <iostream>
#include <cstdlib>
int main() {
int firstguess = 0;
int secondguess = 0;
int thirdguess = 0;

std::cout << "Welcome to The Price is right! Today you are going to guess the price of this RAM Truck.\n";

//int truck = 32400;
srand(time(NULL));
int truck = 31000 + (rand () % 5000);

std::cout << "You have 3 tries and I will tell you if your answer is too low or too high. You will guess first and then if you guess wrong it is the computers turn. Make your guess: \n";

std::cin >> firstguess;

if (firstguess == truck) {
  std::cout << "Wow! You guessed it right on the money! You win this brand new car! Game over.";
  return 0;
}

else if (firstguess < truck){
  std::cout <<"Your guess was too low! The computer now has a chance to beat you!";
}
else {
  std::cout << "Your guess was too high! The computer now has a chance to beat you...";
}

srand(time(NULL));
int computer = truck + (rand () % 1000);

std::cout << "The computer guessed " << computer << "!\n";

if (computer == truck) {
  std::cout << "Wow! The computer guessed it right on the money! You do not get a brand new car! Game over.";
  return 0;
}

else if (computer < truck){
  std::cout <<"The computers guess was too low! Your turn! Guess now: ";
  std::cin >> secondguess;
    if (secondguess == truck) {
    std::cout << "Wow! You guessed it right on the money! You  with this brand new car! Game over.";
    return 0;
    }

    else if (secondguess < truck){
    std::cout <<"Your guess was too low! The computer now has a chance to beat you!";
    }
    else {
    std::cout << "Your guess was too high! The computer now has a chance to beat you...";
    }

}
else {
  std::cout << "The computer guessed too high! Your turn! Guess now: ";
  std::cin >> secondguess;
    if (secondguess == truck) {
      std::cout << "Wow! You guessed it right on the money! You with this brand new car! Game over.";
      return 0;
}

    else if (secondguess < truck){
    std::cout <<"Your guess was too low! The computer now has a chance to beat you!";
    }
    else {
    std::cout << "Your guess was too high! The computer now has a chance to beat you...";
    }
}

    srand(time(NULL));
int computer2 = truck + (rand () % 50);

std::cout << "The computer guessed " << computer2 << "!\n";

if (computer2 == truck) {
  std::cout << "Wow! The computer guessed it right on the money! You do not get a brand new car! Game over.";
  return 0;
}

else if (computer2 < truck){
  std::cout <<"The computers guess was too low! Your turn! Guess now: ";
  std::cin >> thirdguess;
    if (thirdguess == truck) {
    std::cout << "Wow! You guessed it right on the money! You  with this brand new car! Game over.";
    return 0;
    }

    else if (thirdguess < truck){
    std::cout <<"Your guess was too low! That was your last and final guess.\n The computer wins. Sorry charlie. :( womp womp\n";
    std::cout << "The correct answer was: " << truck ;
    return 0;
    }
    else {
    std::cout << "Your guess was too high! \nThat was your last and final guess. The computer wins. sucks to suck.\n";
    std::cout << "The correct answer was: " << truck << "\n";
    return 0;
    }

}
else {
  std::cout << "The computer guessed too high! Your turn! Guess now: ";
  std::cin >> thirdguess;
    if (thirdguess == truck) {
      std::cout << "Wow! You guessed it right on the money! You with this brand new car! Game over.";
      return 0;
}

    else if (thirdguess < truck){
    std::cout <<"Your guess was too low! The computer wins.";
    std::cout << "The correct answer was: " << truck ;
    return 0;
    }
    else {
    std::cout << "Your guess was too high! The computer wins..... ";
    std::cout << "The correct answer was: " << truck ;
    return 0;
    }

}


}
