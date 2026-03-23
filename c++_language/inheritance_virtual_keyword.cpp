#include<iostream>
using namespace std;

class A{
    public:

    void showA(){
        cout<<"class A"<<endl;
    }
};

class B : virtual public A{
    public:

    void showB(){
        cout<<"class B"<<endl;
    }
};

class C : virtual public A{
    public:

    void showC(){
        cout<<"class C"<<endl;
    }
};

class D : public B, public C{
    public:

    void showD(){
        cout<<"class D";
    }
};

int main(){
    D d1;
    d1.showA();
    d1.showB();
    d1.showC();
    d1.showD();

    // If we didn't use virtual keyword, d1.showA() wouldn't be accessible. 
    
    return 0;
}