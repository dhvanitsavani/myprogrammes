#include<iostream>
using namespace std;

class A{
    public:
    int x;

    A(int x){
        this->x = x;
    }
};

class B{
    public:
    int y;

    B(int y){
        this->y = y;
    }
};

class C : public A, public B{
    public:
    int z;

    C(int x, int y, int z) : A(x), B(y) {
        this->z = z;
    }

    void display(){
        cout<<"x = "<<x<<endl<<"y = "<<y<<endl<<"z = "<<z<<endl;
    }
};

int main(){
    C c1(10, 20, 30);

    c1.display();

    return 0;
}