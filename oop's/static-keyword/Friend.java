public class Friend {
    
    @SuppressWarnings("unused")
    String name;
    static int numberofFriends;

    Friend(String name){
        this.name=name;
        numberofFriends++;
    }

    static void displayFriends() {
        System.out.println(" You have " + numberofFriends + " friends ");
    }
}
