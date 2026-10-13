public class Throww{
    public static void main(String []args){
        int balance=5000;
        int withdraw=6000;

        try{
            if(withdraw>balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            else{
                balance=balance-withdraw;
                System.out.println("Transaction Successful");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}