import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size - ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            boolean seen =false;
        
        for (int j=0; j<i; j++ ){
            if (arr[i]==arr[j]){
                seen = true;
                break;
            }
        }
        if(!seen){
            System.out.print( arr[i]+" ");
        }

        }
    }
}