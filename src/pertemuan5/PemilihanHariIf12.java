package pertemuan5;

import java.util.Scanner;

public class PemilihanHariIf12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dayNumber;
        String dayType; 

        System.out.print("Input day number (1-7): ");
        dayNumber = sc.nextInt();
        
        switch (dayNumber) {
            case 1 :
            case 2 :
            case 3 :
            case 4 :
            case 5 :
                dayType = "weekday";
                break;
            case 6 :
            case 7 :
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day number";
        }

        System.out.println(dayNumber + " is a " + dayType);
        
        sc.close();
    }
}
