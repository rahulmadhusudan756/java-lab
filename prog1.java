import java.util.*;
class prog1{
    static void quad(int a,int b,int c){
        double d=b*b - 4*a*c;
        if (d==0) {
            System.out.println("equal and real roots");
            double x = (double)-b/(2*a);
            System.out.println(x);
        }else if(d>0){
            System.out.println("distinct and real roots");
            double x1 = (double)(-b+Math.sqrt(d))/(2*a);
            double x2 = (double)(-b-Math.sqrt(d))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }else{
            System.out.println("Imaginary roots");
            System.out.println((double)(-b/(2*a))+"+"+(Math.sqrt(-d))/(2*a)+"i");
            System.out.println((double)(-b/(2*a))+"-"+(Math.sqrt(-d))/(2*a)+"i");
        }
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }}
        } 
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
    static void arrMul(){
        int[] x={1,2,3}, y={2,3,4}, z=new int[3];
        for(int i=0; i<3; i++){
            z[i]=x[i]*y[i];
        }
        System.out.println("Product : " + Arrays.toString(z));
    }
    public static void main(String args[]){
        System.out.println("enter a b c");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        quad(a,b,c);
        arrMul();
        int arr[]={1,56,98,1,3,55,6,2,4};
        sort(arr);
    }
}