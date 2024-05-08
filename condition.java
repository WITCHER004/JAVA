import java.util.*;

public class condition{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NUMBER A:");
        int a = sc.nextInt();
        System.out.println("ENTER NUMBER B:");
        int b= sc.nextInt();
        if(a==b){
            System.out.println("EQUAL");
        }else if(a>b){
            System.out.println("A is greater than B:");
        }
        else{
            System.out.println("LESSER");
        }
        sc.close();
}
}