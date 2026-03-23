#include<iostream>
using namespace std;

class complexNumber{
    public:
    int real, img;
    
    complexNumber(int x, int y){
        real = x;
        img = y;
    }

    complexNumber operator+(complexNumber obj){
        int ans_real = this->real + obj.real;
        int ans_img = this->img + obj.img;
        return complexNumber(ans_real, ans_img);
    }

    void display(){
        cout<<real<<" + "<<img<<"i"<<endl;
    }
};

int main(){
    complexNumber complex1(5, 2), complex2(3, 9);
    complexNumber result = complex1 + complex2;

    complex1.display();
    complex2.display();
    result.display();

    return 0;
}