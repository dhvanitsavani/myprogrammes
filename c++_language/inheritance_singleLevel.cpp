#include<iostream>
using namespace std;

class A{
    public:
    void showA(){
        cout<<"Class A"<<endl;
    }
};

class B : public A{
    public:
    void showB(){
        cout<<"class B"<<endl;
    }
};

int main(){
    B b1;
    b1.showB();
    b1.showA();

    return 0;
}