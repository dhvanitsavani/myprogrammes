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

class D : public B, public C{
    public:

    void showD(){
        cout<<"class D";
    }
};

int main(){
    D d1;
    d1.showB();
    d1.showC();
    d1.showD();
    
    /*  -- d1.showA() is not accessible because there are two ways
        to access showA() - one is by class B and another is by
        class C so compiler will be confused which class way 
        should it use. thus, showA() is not accessible.
        -- To access showA() virtual keyword must be used. */ 

    return 0;
}