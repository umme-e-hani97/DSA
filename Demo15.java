package DSA;
public class Demo15 {

    public static void main(String[] args) {
        
        // 2. Program to print reverse of an array.

        int A[] = {1, 2, 3, 4, 5};

        // for(int i = 4; i >=0; i--){
        //     System.out.println(A[i]);
        // }

        // 3. Program to find sum of all elements of Array.

        // int sum = 0;

        // for(int i = 0; i <= 4; i++){

        //     sum = sum + A[i];
        //     //basket =basket+dress[i]
           
        // }

        // return;

        //4. Program to find greatest no. from array.

        // int max = 0;

        // for (int i = 0; i < 4; i++) {
        //     if (A[i] > max ) {

        //         max = A[i];

        //     }
        // }

        // System.out.println(max);

        //Program to count even and odd no from Array.

        // if A[i] %2 == 0 - even
        // if A[i] %2 != 0 - odd

        int even = 0;
        int odd = 0;

        for(int i = 0; i <= 4; i++){

            if(A[i] %2 == 0){
                even = even+1;
            }
            else {
                odd = odd+1;
            }

        }

        System.out.println(even);
        System.out.println(odd);

        // Program to find average of all elements of Array.

        // sum of elements in array
        // number of elements in array

        int sum = 0;
        int num = 0;

        for (int i = 0; i < A.length; i++){

            sum = sum + A[i];

            num = num + 1;

        }

        int avg = sum / num;

        System.out.println(avg);

        //Program to search an element from array.

        // A {.....}
        // element 
        // print
        // not available

        int element = 7;
        int elemenet1 = 3;
        int x = 0;

        for(int i =0; i <= 4; i++) {
            if(elemenet1 == A[i]){
                System.out.println("Element is found");
                 x = 1;
                 A[i] = 7;
            }
        }
        if (x == 0){
             System.out.println("Element not found"); 
        }

        for(int i = 0; i <= 4; i++){
            System.out.println(A[i]);
        }

        // Program to search the number from array and replace it by another number.

        // 


    }
    }

