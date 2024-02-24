package DSA;
public class Demo13 {

    public static void main(String[] args) {

        int A[] = { 3, 2, 1, 56, 10000, 157 };
        int min = A[0];
        
        int max = 0; //3 - 56 - 10000

        int n = 6;

        for (int i = 0; i < n; i += 1) {

            if (A[i] < min ) {

                min = A[i];

            }

        }
        
        System.out.println(min);


        int k = 36;

        int a = 7;
        int b = 9;

        if (a+b > k) {
            System.out.println(a+b);
        }
        else
        System.out.println(100);
        

    }
}
