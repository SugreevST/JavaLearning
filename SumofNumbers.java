// Sum of numbers between 110 to 145 

package New;
public class SumofNumbers {
    public static void main(String[] args) {
        int start = 110; 
        int end = 145;   
        int sum = 0;     

        for (int i = start; i <= end; i++) {
            sum += i; 
        }

        // Print the result
        System.out.println("The sum of numbers between " + start + " and " + end + " is: " + sum);
    }
}