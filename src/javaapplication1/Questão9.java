#include <iostream>
using namespace std;

int main(){
	int N, x, f;
	cout<<"Digite um numero: ";
	cin>>N;
	cout<<"\n\n";
	for(int i = 0 ; i < N ; i++){
		cout<<"Digite um numero: ";
		cin>>x;
		f=1;
		for (int i = 1 ; i <= x ; i++){
			f *= i;
		}
		cout<<" -> O fatorial do numero digitado e: "<<f<<"\n\n";
	}
}