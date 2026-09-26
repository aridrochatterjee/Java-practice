public class loop_practice{
    public static void main(String[] args) {
        for(int i = 0; i <= 4; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("--------------------------------    ");
        
        int n = 4;
        int m = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
               
                }      
            }
            System.out.println();
        }

        System.out.println("--------------------------------    ");

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------------------------------    ");

        for(int i = 5; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("--------------------------------    ");


        for (int i = 1 ; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------------------------    ");

        for (int i = 1 ; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
        System.out.println();
        }
        System.out.println("--------------------------------    ");

        for (int i = 5 ; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------------------------------    ");

        int num = 1;
        for (int i = 1 ; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(num+ "");
                num++;  
            }
            System.out.println();
        }
        System.out.println("--------------------------------    ");
        int k = 5;
        
        for(int i = 1 ; i <= k; i++){
            for(int j = 1; j <= i; j++){
                int sum = i + j;
                if(sum% 2 == 0){
                    System.out.print("1");
                }else if (sum% 2 != 0){
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}   