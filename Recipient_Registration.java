import java.util.Scanner;

public class Recipient_Registration {
    Scanner donor = new Scanner(System.in);
    String recipeName = donor.nextLine();
    String recipeGender = donor.nextLine();
    int recipeAge = donor.nextInt();

    String recipeMobileNumber = donor.nextLine();
    String recipeBloodGroup = donor.nextLine();
    String recipeEmail = donor.nextLine();
    String recipeAddress = donor.nextLine();
    private String recipePassword = donor.nextLine();
}
