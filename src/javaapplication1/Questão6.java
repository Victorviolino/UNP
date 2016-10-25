#include <iostream>
using namespace std;

int main(){
	int I, F, m2=0, m3=0, m5=0, mt=0, n;
	cout<<"Digite dois valores inteiros e positivos: ";
	cin>>I>>F;
		for(n = I+1 ; n<F ; n++){
			if(n%2==0 && n%3==0 && n%5==0){
				m2++;
				m3++;
				m5++;
				mt++;
			}
			else if(n%2==0){
				m2++;
			}
			else if(n%3==0){
				m3++;
			}
			else if(n%5==0){
				m5++;
			}
		}
	cout<<"No intervalo, existem "<<m2<<" multiplos de 2\n";
	cout<<"No intervalo, existem "<<m3<<" multiplos de 3\n";
	cout<<"No intervalo, existem "<<m5<<" multiplos de 5\n";
	cout<<"No intervalo, existem "<<mt<<" multiplos de 2, 3 e 5";
}