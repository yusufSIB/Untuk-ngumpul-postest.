//Nama : Yusuf Subandrio
//NIM  : 2209116078
//Kelas: Sisterm Infortmasi B2 
//C++
#include<iostream>
#include<cstdlib>

using namespace std;

int main(){
	int x[] = {rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10};
	int j = sizeof(x)/sizeof(*x);
	int temp,pos;

	cout << "X :";
	for(int i = 0; i < j; i++){
	 	cout << x[i] << " ";
	}
	cout << endl;
	
	//proses sorting buble
	for(int i = 0; i < j; i++){
		int acak = 0;//bs hps
		for(int h = 0; h < j-1; h++){
			if(x[h] > x[h+1]){
				temp = x[h];
				x[h] = x[h+1];
				x[h+1] = temp;
				acak++;//bs hps
			}
		}	
		if(acak == 0){
			break;//bs hps
		}
		cout << endl;
		cout << "Tahap  : " << i +1 << " = ";
		for(int a = 0; a < j; a++){
			cout << x[a] << " ";
		} 
	}

	cout << endl;
	cout << endl;
	cout << "hasil : ";
		for(int a = 0; a < j; a++){
			cout << x[a] << " ";
		}
	
	cout << endl;
	cout << endl; 

	cout << "SELECTION SORT!" << endl;
	cout << endl;
	int r[] = {rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10,rand() % 10};

	cout << "Y :";
	for(int i = 0; i < j; i++){
		cout << r[i] << " ";
	}
	cout << endl;
	
	//proses sorting selection
	for(int a = 0; a < j; a++){
		temp = r[a];
		pos = a;
		for(int b = a; b < j; b++){
			if(r[b] < temp){
				temp = r[b];
				pos = b;
			}
		}
		r[pos] = r[a];
		r[a] = temp;
				
		cout << endl;
		cout << "Tahap : " << a +1 << " = ";
		for(int c = 0; c < j; c++){
			cout << r[c] << " ";
		}
	}
	cout << endl;
	cout << endl;
	cout << "Hasil : ";
	for(int d = 0; d < j; d++){
		cout << r[d] << " ";
	}
}  



