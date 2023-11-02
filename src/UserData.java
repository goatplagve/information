
public class UserData {

    public static void main(String[] args) {

        if (args.length < 3) {
            System.out.println("Instructions: UserData <username> <ownedPet> <favColor>");
            return;
        }

        String username = args[0];
        String ownedPet = args[1];
        String favColor = args[2];

        System.out.println("User Information:");
        System.out.println("Username: " + username);
        System.out.println("Owned Pet: " + ownedPet);
        System.out.println("Favorite Color: " + favColor);


    }
}
