import java.util.*;
class Prog8{
    int[] buf=new int[5];
    int in=0,out=0,count=0;
    synchronized void put(int n)throws InterruptedException{
        while(count==buf.length){
            wait();
        }
        buf[in]=n;
        in=(in+1)%buf.length;
        count++;
        System.out.println("\nProduced: "+n);
        notifyAll();
    }
    synchronized int get() throws InterruptedException{
        while(count==0){
            wait();
        }
        int p=buf[out];
        out=(out+1)%buf.length;
        count--;
        System.out.println("\nconsumed: "+p);
        notifyAll();
        return(p);
    }
    public static void main(String[] args){
        Prog8 pc=new Prog8();
        new Thread(()->{
            try{
                for(int i=0;i<5;i++){
                pc.put(i);
                Thread.sleep(500);
                }
            }catch(InterruptedException ignored){}
        }).start();
        new Thread(()->{
            try{
                while(true){
                    pc.get();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException ignored){}
        }).start();
    }
}

