#include <iostream>
#include <vector>

int main() {
  std::vector <int> numbers = {2, 4, 3, 6, 1, 9};

int sumeven = 0;
std::vector <int> evennumbers(2);
std::vector <int> oddnumbers = {1,1};
int sumevennumbers = 0;
int productoddnumbers = 1;

  for (int i = 0; i<numbers.size(); i++){
    
    
    if (numbers[i] % 2 == 0) {

       evennumbers.push_back(numbers[i]);
      
    }
    
    else {
     
      productoddnumbers = productoddnumbers * numbers[i];
    }

    evennumbers[i+1] = evennumbers[i] + evennumbers[i+1];
    

    sumevennumbers = evennumbers [i];
 

  }

  std::cout << "Sum of even numbers is " << sumevennumbers << "\n";
  std::cout << "Product of odd numbers is "
<< productoddnumbers << "\n";


}
