#include<iostream>
using namespace std;

class demo{
    public:
    int marks;
    static int per;

    //this :-
    void setMarks(int marks){
        this->marks = marks;
    }

    //static:-
    void static_demo(){
        per++;
    }

    void displayMarks(){
        cout<<"marks = "<<marks<<endl;
    }
};

int demo::per = 85;

int main(){
    demo d1, d2, d3, d4, d5;
    d1.setMarks(95);
    d1.displayMarks();

    d1.static_demo();
    d2.static_demo();
    d3.static_demo();
    d4.static_demo();
    d5.static_demo();
    cout<<"percentage = "<<demo::per;

    return 0;
}