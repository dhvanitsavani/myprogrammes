#include<iostream>
using namespace std;

class A{
    public:
    int x;

    A(int x){
        this->x = x;
    }
};

class B : public A{
    public:
    int y;

    B(int x, int y) : A(x){
        this->y = y;
    }
};

class C : public B{
    public:
    int z;

    C(int x, int y, int z) : B(x, y){
        this->z = z;
    }

    void display(){
        cout<<"x = "<<x<<endl<<"y = "<<y<<endl<<"z = "<<z<<endl;
    }
};

int main(){
    C c1(1, 2, 3);

    c1.display();

    return 0;
}