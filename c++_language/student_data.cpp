#include<iostream>
#include<string>
using namespace std;

class student{
    public:
    int roll_no, std, maths, science, computer, history;
    float per;
    char div;
    string name;

    student(int roll_no, string name, int std, char div, int maths, int science, int computer, int history){
        this->roll_no = roll_no;
        this->name = name;
        this->std = std;
        this->div = div;
        this->maths = maths;
        this->science = science;
        this->computer = computer;
        this->history = history;
    
        this->per = (maths + science + computer + history) / 4.0;
    }

    void display_student_data(){
        if(name.length() < 8){
            cout<<roll_no<<"\t"<<name<<"\t\t"<<std<<"\t"<<div<<"\t"<<per<<endl;
        }else{
            cout<<roll_no<<"\t"<<name<<"\t"<<std<<"\t"<<div<<"\t"<<per<<endl;
        }
    }
    
};

int main(){
    student all_students[5] = {
        student(1, "Dhruv", 9, 'a', 90, 85, 87, 91),
        student(12, "Priyanshi", 11, 'c', 79, 81, 66, 83),
        student(9, "Mahi", 9, 'a', 80, 59, 67, 55),
        student(25, "Soham", 9, 'b', 43, 30, 56, 60),
        student(3, "Nirbhaysinh", 10, 'b', 99, 98, 97, 99)
    };

    cout<<endl<<"====================== Student Data ========================="<<endl<<endl;
    cout<<"R_no\tName\t\tStd\tDiv\tPer"<<endl<<endl;

    for(int i=0; i<5; i++){
        all_students[i].display_student_data();
    }

    cout<<endl;

    return 0;
}