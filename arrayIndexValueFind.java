import java.util.*;
public class arrayIndexValueFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Size of The Array:");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.println("Enter The Elements of The Array:");
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Type The Array value you want to search the index:");
        int search = sc.nextInt();
        int index = -1;
        for(int i=0; i<size; i++){
            if(array[i] == search){
                index = i;
                break;
            }
        }
        if(index != -1){
            System.out.println("The index of the value " + search + " is: " + index);
        } else {
            System.out.println("Value not found in the array.");
        }
        

        

    }
    
}
