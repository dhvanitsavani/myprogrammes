#include<iostream>
using namespace std;

class A{
    public:

    void showA(){
        cout<<"class A"<<endl;
    }
};

class B : public A{
    public:

    void showB(){
        cout<<"class B"<<endl;
    }
};

class C : public A{
    public:

    void showC(){
        cout<<"class C"<<endl;
    }
};

int main(){
    B b1;
    C c1;
    b1.showA();
    c1.showA();
    
    return 0;
}