import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        String firstName;
        String lastName;
        String identificationNumber;
        
        while(true){
            System.out.println("First name: ");
            firstName = scanner.nextLine();
            if(firstName.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            lastName = scanner.nextLine();
            System.out.println("identificationNumber: ");
            identificationNumber = scanner.nextLine();
            
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }
        
        for(PersonalInformation personalInformation : infoCollection){
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }
        

    }
}
