package Day8;

public class Main {
    public static void main(String[] args) {

        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();

        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());//same Hash Code 
        System.out.println(s2.hashCode());// same hash Code
    }
}
