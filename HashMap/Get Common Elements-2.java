import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }
    int n1=sc.nextInt();
     int[] a1=new int[n1];
    for(int i=0;i<a.length;i++)
    {
        a1[i]=sc.nextInt();
    }
    HashMap<Integer,Integer> fmap=new HashMap<>();
    for(int val:a)
    {
        if(fmap.containsKey(val))
        {
            int of=fmap.get(val);
            int nf=of+1;
            fmap.put(val,nf);
        }
        else
        {
            fmap.put(val,1);
        }
    }
    for(int val:a1)
    {
        if(fmap.containsKey(val)&& fmap.get(val)>0)
        {
            System.out.println(val);
            int of=fmap.get(val);
            int nf=of-1;
            fmap.put(val,nf);
            
        }
    }
 }

}