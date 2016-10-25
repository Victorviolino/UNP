#include <iostream>
using namespace std;

int main (){
	int i;
	char s,e,x='S';
	while(x != 'N'){
		cout<<"Informe seu sexo: (M ou F): ";
		cin>>s;
		cout<<"Informe sua idade: ";
		cin>>i;
		cout<<"Informe sua escolaridade: (f,m ou s) ";
		cin>>e;
			if(i < 30 && e == 's' ){
				cout<<"Vaga para professor\n";
			}
			else if(s == 'F' && i < 25 && e == 'm'){
				cout<<"Vaga para recepcionista\n";
			}
			else if(s == 'M' && i > 40 && e == 'f'){
				cout<<"Vaga para Servente\n";
			}
			else{
				cout<<"Nao ha vaga disponivel\n";
			}
		cout<<"O usuario ainda deseja continuar? (S ou N): ";
		cin>>x;
	}
}