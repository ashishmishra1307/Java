class Student {
    int rno;
    String name;
    float marks;     

    Student(){
        this.rno =12;
        this.name ="Ashisshh";
        this.marks = 457f;
    }

    Student(int roll,String naam,float marks){
        this.rno = roll;
        this.name = naam;
        this.marks = marks;
    }

    void greeting(){
        System.out.println("My name is "+ this.name);
    }
    void changename(String newname){
        name = newname;
    }

}

public class oops {
    public static void main(String args[]){
         Student Kunal = new Student();
       //System.out.print(Kunal.name);
   //    Kunal.changename("Rahul");               // changed to Newname
     //  Kunal.greeting();
        
        Student random = new Student(23,"Raj",56.89f);
        System.out.println(random.name);
        System.out.print(random.marks);

    }

} 
    

