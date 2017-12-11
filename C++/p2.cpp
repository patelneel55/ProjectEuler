#include <iostream>
#include <string>

using namespace std;

int main()
{
	int second = 1;
	int result = 2;

	int sum = 0;
	while(result <= 4000000)
	{
		if(result % 2 == 0)
			sum += result;
		int temp = result;
		result += second;
		second = temp;
	}
	cout << "Sum: " + sum << endl;
}
