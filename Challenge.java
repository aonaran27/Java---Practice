import java.util.Scanner;

public class Challenge {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int count = 1 ;
        double sum = 0 ;
        while (count <= 5){

            System.out.println("Enter number #"+ count + ": ");
            String number = scanner.nextLine();
            try {
//                int Number = Integer.parseInt(number);
                double Number = Double.parseDouble(number);
                count +=1 ;
                sum += Number;
            }catch (Exception e){
                System.out.println("Invalid number!!!");
            }

        }
        System.out.println("Sum of the numbers is : "+ sum);
    }
}
