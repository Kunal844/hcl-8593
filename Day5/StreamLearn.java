import java.util.*;
import java.util.stream.Stream;

public class StreamLearn{
    public static void main(String []args){
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(44);
        list.add(55);
        list.add(10);

        // Stream<Integer> s1=list.stream();
        // Stream<Integer> s2=s1.filter(n->n%2==0);
        // s1.forEach(n->System.out.println(n));
        // System.out.println("Even numbers are:");
        // s2.forEach(n->System.out.println(n));
        //U can use a stream only once 
        //If you try to print s1 then u cant print s2.
        //Only onc s1 or s2 can be Printed .

        // Getting a Single value using Stream here is the example

        int singleDig=list.stream()
                     .filter(n->n%2==0)
                     .map(n->n*2)
              .reduce(0,(c,e)->c+e);

        System.out.println("Single value is: "+singleDig);
    }
}