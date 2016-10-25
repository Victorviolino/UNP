#include <iostream>
using namespace std;

int main(){
	float n1, n2, m, tap=0, tex=0, trep=0, mc;
	for(int i=0 ; i<7 ; i++){
		cout<<"Digite as duas notas: ";
		cin>>n1>>n2;
		m=(n1+n2)/2;
		if(m>=7){
			tap++;
			cout<<"APROVADO \n";
		}
		else if(m>=3 && m<7){
			tex++;
			cout<<"EXAME \n";
		}
		else if(m<3){
			trep++;
			cout<<"REPROVADO \n";
		}
		cout<<"A media do aluno e: "<<m<<"\n\n";
		mc+=m;
	}
	cout<<"O total de alunos aprovados e: "<<tap<<"\n";
	cout<<"O total de alunos no exame e: "<<tex<<"\n";
	cout<<"O total de alunos reprovados e: "<<trep<<"\n";
	cout<<"A media da classe e: "<<mc/7;
}