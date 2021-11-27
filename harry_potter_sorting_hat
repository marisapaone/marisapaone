#include <iostream>
#include <cstdlib>

int main() {

 int gryffindor = 0;
 int hufflepuff = 0;
 int ravenclaw = 0;
 int slytherin = 0;

 int answer1 = 0;
 int answer2 = 0;
 int answer3 = 0;
 int answer4 = 0;

 std::cout << "You are starting The Sorting Hat Quiz!\n";

std::cout << "Question 1. When I'm dead, I want people to remember me as: \n\n";
std::cout << "1) Good\n";
std::cout<< "2) Great\n";
std::cout<<"3) Wise\n";
std::cout<<"4) Bold\n";
std::cout << "Enter answer here: ";
std::cin>>answer1;

if (answer1 == 1){
  hufflepuff++;
}
else if (answer1 ==2){
  slytherin++;
}
else if (answer1 ==3){
  ravenclaw++;
}
else if (answer1 ==4){
  gryffindor++;
}
else {
  std::cout << "Invalid input";
}



std::cout << "Question 2. Dawn or Dusk?\n";
std::cout <<"1) Dawm\n2) Dusk\n";
std::cout <<"Enter answer here: ";
std::cin >> answer2;

if (answer2==1){
  gryffindor++;
  ravenclaw++;
}
else if (answer2==2) {
  hufflepuff++;
  slytherin++;
}
else {
  std::cout <<"Invalid input.";

}
std::cout<< "Question 3. Which kind of instrument most pleases your ear?\n";
std::cout<<"1) Violin\n2) Trumpet\n3) Piano\n4) Drum \n";
std::cout << "Enter answer here: ";
std::cin >> answer3;

if (answer3 == 1){
  slytherin++;
}
else if (answer3 ==2){
  hufflepuff++;
}
else if(answer3 == 3){
  ravenclaw++;
}
else if (answer3 == 4){
  gryffindor++;
}
else {
  std::cout <<"Invalid input.\n";

}
std::cout << "Question 4. Which road temps you most?\n1) The wide, sunny grassy lane\n2) The narrow, dark, lantern-lit alley\n3) The twisting, leaf strewn path through woods\n4) The cobbled street lined (ancient buildings)\n";
std::cout <<"Enter answer here: ";
std::cin>> answer4;

if (answer4 == 1) {
  hufflepuff++;
}
else if (answer4 ==2){
  slytherin++;
}
else if(answer4 ==3){
  gryffindor++;
}
else if (answer4 == 4){
  ravenclaw++;
}
else {
  std::cout << "Invalid input.";

}

int max = 0;
std::string house;

if (gryffindor > max) {
  max = gryffindor;
  house = "Gryffindor";
}
if (hufflepuff>max){
  max=hufflepuff;
  house="Hufflepuff";
}
if (ravenclaw>max){
  max=ravenclaw;
  house = "Ravenclaw";
}
if (slytherin>max){
  max = slytherin;
  house = "Slytherin";
}
std::cout<<house<<"!\n";
}
