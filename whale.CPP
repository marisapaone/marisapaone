#include <iostream>
#include <vector>
#include <string>

int main () {
  
std::string input = "turpentine and turtles";

std::vector<char> vowels = {'a', 'e', 'i', 'o', 'u'};

std::vector<char> result;

for (int i=0; i < input.size(); i++){

  for (int e=0; e<vowels.size(); e++){

    if (input [i] == vowels [e]){

      result.push_back(input[i]);
    }
    

    

  }
  if (input [i] == 'e'){

      result.push_back('e');


    }
  if (input[i] == 'u'){
    result.push_back('u');
  }
}
for (int k = 0; k < result.size(); k++){
  std::cout << result[k];
}



}
