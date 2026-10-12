import java.util.*;



public class Self {
    public static void main(String []args){
        Comparator<Integer> com=new Comparator<Integer>(){
            public int compare(Integer i,Integer j){
                if(i%10 > j%10){
                    return 1;
                }else return -1;
            }  
        };

        List<Integer> nums=new ArrayList<>();
        nums.add(39);
        nums.add(40);
        nums.add(15);
        nums.add(44);

        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
