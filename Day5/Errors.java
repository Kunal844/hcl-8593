class Student{
    int age;
    Student(int a){
        this.age=a;
    }
    void check(int age){
        if(age<18){
            throw new ArithmeticException("Age limit not reached");
        }
        else{
            System.out.println("Age limit reached");
        }
    }
}


public class Errors{
    public static void main(String[]args){
       
        Student s1= new Student(10);

        try{
             s1.check(10);
        }
        catch(Exception e){
                System.out.println("Age limit not reached...");
        }
        finally{
            System.out.println("Finally block is executed");
        }
    }
}