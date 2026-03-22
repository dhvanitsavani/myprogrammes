#include<iostream>
using namespace std;

class human{
    public:
    int a = 10;

    //constructor :-
    human(int height, int weight){
        cout<<"This person is "<<height<<" inches long."<<endl;
        cout<<"This person is "<<weight<<" kg weighted."<<endl;
    }

    //destructor :-
    ~human(){
        cout<<"destructor"<<endl;
    }

    int display(int b){
        cout<<"a = "<<a<<endl;
        cout<<"b = "<<b<<endl;
    }

    void eating(){
        cout<<"Humans can eat food."<<endl;
    }

    void sleeping(){
        cout<<"Humans should sleep properly."<<endl;
    }
};

int main(){
    human h1(60, 50);
    h1.eating();
    h1.sleeping();
    h1.display(15);

    return 0;
}