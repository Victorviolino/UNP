#include <iostream>
using namespace std;

int main(){
	float N, f=1, E=1;
	cout<<"Digite o numero de termos: ";
	cin>>N;
	cout<<"1+ ";
	for(int i=1 ; i<=N ; i++){
		for(int j=1 ; j<=i ; j++){
			f *= j;
		}
		cout<<"1 /"<<f<<"+ ";
		E+=1/f;
		f=1;
	}
	cout<<"\nE = "<<E;
}