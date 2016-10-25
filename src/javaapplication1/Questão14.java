#include <iostream>
using namespace std;

int main(){
	int n, n1;
	cout<<"Digite um numero: ";
	cin>>n;
	for(int i=1 ; i<11 ; i++){
		n1=n*i;
		cout<<n<<" * "<<i<<" = "<<n1<<"\n";
	}
}