import java.io.*;
import java.util.*;
public class main{
    public static void main(String [] args)throws IOException{
        Scanner input=new Scanner(new File("graph2.txt"));
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        while(input.hasNext()){
            int a=input.nextInt();
            int b= input.nextInt();
            
            if(!map.containsKey(a)){
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(b);
                map.put(a,arr);
            }else{
                map.get(a).add(b);
            }
        }
        System.out.println(map);
        input.close();

        Scanner input1=new Scanner(new File("graph3.txt"));
        int size=input1.nextInt();
        int[][] mat = new int [size][size];
        for(int i=0;i<mat.length;++i){
            for(int j=0;j<mat.length;++j){
                mat[i][j]=0;
            }
        }
        while(input1.hasNext()){
            int a=input1.nextInt();
            int b=input1.nextInt();
            int num=input1.nextInt();
            mat[a][b]=num;
            mat[b][a]=num;
        }
        System.out.print(" ");
        for(int i=0;i<mat.length;++i){
            System.out.print(" "+i);
        }
        System.out.println();
        for(int i=0;i<mat.length;++i){
            System.out.print(i+" ");
            for(int j=0;j<mat.length;++j){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}