#include<iostream>
using namespace std;

class A{
    public:
    void show(){
        cout<<"showed from class A";
    }
};

class B : public A{
    public:
    void show(){
        cout<<"showed from class B";
    }
};

class C : public B{
    public:
    void show(){
        cout<<"showed from class C";
    }
};

int main(){
    C c1;
    c1.show();

    /* When there is a same method prototype in your both baseclass and derived class and
    if you call that method using the object of derived class, then only derived class
    method will be called. So you can say that method of derived class overrides the
    method of base class. */

    return 0;
}