#include <iostream>
using namespace std;

int main(){
	float voto,x=0,y=0,z=0,w=0,n=0,b=0,V,Pn,Pb;
	while (voto != -2){
		cout<<"Digite seu voto: ";
		cin>>voto;
			if(voto==10){
				x++;
			}
			else if(voto==21){
				y++;
			}
			else if(voto==34){
				z++;
			}
			else if(voto==42){
				w++;
			}
			else if(voto==0){
				n++;
			}
			else if(voto==-1){
				b++;
			}
	}
		V=x+y+z+w+n+b;
		Pn = n / V * 100;
		Pb = b / V * 100;
		cout<<"Total de votos do candidato x: "<<x<<"\n";
		cout<<"Total de votos do candidato y: "<<y<<"\n";
		cout<<"Total de votos do candidato z: "<<z<<"\n";
		cout<<"Total de votos do candidato w: "<<w<<"\n";
		cout<<"Total de votos nulos: "<<n<<"\n";
		cout<<"Total de votos em branco: "<<b<<"\n";
		cout<<"Porcentagem de votos nulos sobre o total de votos validos: "<<Pn<<"%\n";
		cout<<"Porcentagem de votos brancos sobre o total de votos validos: "<<Pb<<"%";
}