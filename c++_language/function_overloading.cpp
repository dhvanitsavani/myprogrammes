#include<iostream>
#include<string>
using namespace std;

class Max{
    public: 
    int a, b, c, d;

    //max of two numbers :-
    void findmax(int x, int y){
        a = x;
        b = y;
        if(a > b){
            cout<<a<<" is max"<<endl;
        }else{
            cout<<b<<" is max"<<endl;
        }
    }

    //max of three numbers :-
    void findmax(int x, int y, int z){
        a = x;
        b = y;
        c = z;
        if(a > b){
            if(a > c){
                cout<<a<<" is max"<<endl;
            }else{
                cout<<c<<" is max"<<endl;
            }
        }else{
            if(b > c){
                cout<<b<<" is max"<<endl;
            }else{
                cout<<c<<" is max"<<endl;
            }
        }
    }

    //max of four numbers :-
    void findmax(int x, int y, int z, int o){
        a = x;
        b = y;
        c = z;
        d = o;   
        if(a >= b && a >= c && a >= d){
            cout<<a<<" is max"<<endl;
        }else if(b >= a && b >= c && b >= d){
            cout<<b<<" is max"<<endl;
        }else if(c >= a && c >= b && c >= d){
            cout<<c<<" is max"<<endl;
        }else{
            cout<<d<<" is max"<<endl;
        }
    }
};

int main(){
    Max m1;
    int choice, n1, n2, n3, n4;

    cout<<endl<<string(45, '-')<<" Welcome to findmax service "<<string(45, '-')<<endl;
    cout<<endl<<string(30, '*')<<endl<<"1. max of two numbers\n2. max of three numbers\n3. max of four numbers\n4. exit\n";

    while(true){
        cout<<string(30, '*')<<endl<<"Enter choice : ";
        cin>>choice;

        if(choice == 1){
            cout<<"Enter two numbers : ";
            cin>>n1>>n2;
            m1.findmax(n1, n2);
        }else if(choice == 2){
            cout<<"Enter three numbers : ";
            cin>>n1>>n2>>n3;
            m1.findmax(n1, n2, n3);
        }else if(choice == 3){
            cout<<"Enter four numbers : ";
            cin>>n1>>n2>>n3>>n4;
            m1.findmax(n1, n2, n3, n4);
        }else if(choice == 4){
            cout<<"Thank you for using our service";
            break;
        }else{
            cout<<"Invalid choice, please try again."<<endl;
        }
    }

    return 0;
}