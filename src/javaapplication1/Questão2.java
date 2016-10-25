#include<iostream>
using namespace std;

int main(){
	int N, a, b, c, d, F;
	cout<<"Digite um numero: ";
	cin>>N;
	a=N;
	b=N;
	c=N;
	d=N+99;
	F=d;
	do{
		cout<<a<<" ";
		a++;
		cout<<b<<" ";
		b+=10;
		cout<<c<<" ";
		c+=2;
		cout<<d<<" \n";
		d--;
	}
	while(a<=F);
}