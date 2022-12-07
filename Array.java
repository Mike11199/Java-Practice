public class Array {
    public static void main(String[] args) {

    int[] anArray;
    anArray = new int[50];

    for (int i = 0; i < anArray.length; i++){
        anArray[i] = i;
    }

    System.out.println("The length of the array is " + anArray.length);
    System.out.println("Printing prime numbers");

    for (int i = 0; i < anArray.length; i++){

        if (isPrime(anArray[i])){
            System.out.println(anArray[i]);
        }
    }    
    }

    static boolean isPrime(int n){
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }
}

