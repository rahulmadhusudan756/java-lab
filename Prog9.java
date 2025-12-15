import java.util.*;
class Prog9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("enter two nums");
            int n=sc.nextInt();int d=sc.nextInt();
            if(n<0 || d<0) {throw new IllegalArgumentException("negative nums not allowed!");}
            System.out.println("answer: "+n/d);
        }
        catch (ArithmeticException e){
            System.out.println("CANT DIVIDE BY 0");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally{sc.close();}
    }
}