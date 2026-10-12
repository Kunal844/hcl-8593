import java.util.*;

public class SortingOFString{
    public static void main(String[]args){
        Comparator <String> com =new Comparator<String>(){
            public int compare(String s1, String s2){
                if(s1.length()> s2.length()){
                    return 1;
                }else return -1;
            }
        };
        List <String> list=new ArrayList<>();
        list.add("Sam");
        list.add("suhana");
        list.add("mohini");
        list.add("Xerjoff");

        Collections.sort(list,com);
        System.out.println(list);
        
    }
}