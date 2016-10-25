#include <iostream>
using namespace std;

int main(){
	float N, F, R=0;
	cout<<"Digite um Numero: ";
	cin>>N;
	cout<<"Digite agora o fator de multiplicaçao: ";
	cin>>F;
	R = N * F;
	while (R <= 400){
		cout<<"O Resultado e: "<<R<<"\n";
		R *= F;
	}
}