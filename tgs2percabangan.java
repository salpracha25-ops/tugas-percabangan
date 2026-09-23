import java.util.Scanner;

public class tgs2percabangan {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Status Member anda: ");
        String member = input.nextLine();

        if(member.equalsIgnoreCase("GOLD")) {
            System.out.println("Diskon 20%");
        }
        else if(member.equalsIgnoreCase("SILVER")) {
            System.out.println ("Diskon 15%");
        }
        else if(member.equalsIgnoreCase("BRONZE")) {
            System.out.println("Diskon 10%");
        }
        else {
            System.out.println("Tidak ada diskon");
        }
        input.close();

    }
}