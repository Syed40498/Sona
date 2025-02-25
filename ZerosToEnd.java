import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;
public class ZerosToEnd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=sc.nextInt();
        Integer arr[]=new Integer[size];
        System.out.println("Enter Values");
        //input
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //printing the array
        for(int i=0;i<size;i++){
              System.out.print(arr[i]+" ");
        }
        List<Integer>list=Arrays.asList(arr);
        Collections.sort(list);
        Collections.reverse(list);
        System.out.println();
        System.out.println(list);
        sc.close();
    }
}