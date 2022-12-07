
class HelloWorld {
    public static void main(String[] args) {
        
        System.out.println("Hello, World!"); 


        // test some math
        int num1 = 3;
        int num2 = 10;
        int sum = num1 + num2;
        int test_num = 15;
        System.out.println(sum); 
        
        // test if statement
        if (sum > test_num) {
            System.out.println("sum is greater than test_num");
        }
        else{
            System.out.println("sum is less than test_num");
        }

        // test using a function
        int test_num_squared = squareNumber(test_num);
        System.out.println(test_num_squared);

    }
    public static int squareNumber(int x){

        x = x*x;        
        return x;
    }

}