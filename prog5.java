import java.util.*;
class prog5{
    static boolean usrstrcmp(String s1,String s2){
        if(s1.length() != s2.length()) return false;
        int n = s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    static boolean usrstrcmp(String s1,String s2,int n){
        int l1=Math.min(s1.length(),n);
        int l2=Math.min(s2.length(),n);
        if(l1!= l2) return false;
        for(int i=0;i<n;i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String args[]){
        String s1="hello";
        String s2="hello ji";

        System.out.println("Compare Full String: " + usrstrcmp(s1, s2));
        System.out.println("Compare first n Characters: " + usrstrcmp(s1, s2, 5));
    }
}