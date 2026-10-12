import java.util.*;

class Comparison implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        return s1.length()-s2.length();
    }
}

class MyCopmarator implements Comparator<Integer>{

    @Override
    public int compare(Integer i1, Integer i2) {
        return i1.compareTo(i2);
    }
}

public class Compare{
    public static void main(String[]args){
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        List<String> words=new ArrayList<>();
        words.add("banana");
        words.add("apple");
        words.add("date");
        words.sort(new Comparison());
        System.out.println(words);
        System.out.println(list);

        list.sort(new MyCopmarator());
        System.out.println(list);
    }
}