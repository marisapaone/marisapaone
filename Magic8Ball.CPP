#include <iostream>
#include <cstdlib>
int main() {
  std::cout << " MAGIC 8 BALL: \n";
  srand(time(NULL));

  int magic = std::rand() % 10;

  if (magic == 0 ){
    std::cout<< "It is certain.";
  }
  else if (magic ==1) {
    std::cout << "You may rely on it.";
  }
  else if (magic ==2){ 
    std::cout<<"As I see it, yes.";
  }
  else if (magic ==3){ 
    std::cout<<"Most likely.";
  }
  else if (magic ==4){ 
    std::cout<<"Outlook is good.";
  }
  else if (magic ==5){ 
    std::cout<<"Yes.";
  }
  else if (magic ==6){ 
    std::cout<<"Reply hazy, try again";
  }
  else if (magic ==7){ 
    std::cout<<"Ask again later.";
  }
  else if (magic ==8){ 
    std::cout<<"Better not tell you now.";
  }
  else  {
    std::cout << "Very doubtful.";
  }

 // std::cout << magic;
 return 0;
}



