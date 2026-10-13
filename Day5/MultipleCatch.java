public class MultipleCatch{
     public static void main(String[]args){
        int []a={1,2,3};


        try{
            int c=10/0;
            int c=10/2;
            System.out.println(a[10]);
        }
        catch(ArithmeticException e){
            System.out.println("Cant divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Not present in array");
        }
     }
}