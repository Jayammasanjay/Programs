package Recursion;

public class factorial {

        public static void main(String[] args) {
            int n=5;
            int fact=fact(n);
            System.out.print(n+" "+fact);
        }
        public static int fact(int n){
            if(n==1){
                return 1;
            }
            return n*fact(n-1);
        }
}
