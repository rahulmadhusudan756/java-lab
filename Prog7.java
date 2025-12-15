import java.util.*;
public class Prog7{
    public static void main(String[] args){
        Integer n=Integer.parseInt(args[0]);
        int arr1[][]=new int[n][n];
        int arr2[][]=new int[n][n];
        int arr3[][]=new int[n][n];
        System.out.println("enter first matrix");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                arr1[i][j]=sc.nextInt();
        System.out.println("enter second matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr2[i][j]=sc.nextInt();
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Result matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}