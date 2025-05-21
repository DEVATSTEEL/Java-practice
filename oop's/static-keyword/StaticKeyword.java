public class StaticKeyword {
    
    public static void main(String[] args) {
        
        Friend friend1 = new  Friend("Spongebob");
        Friend friend2 = new  Friend("Patrick");
        Friend friend3 = new  Friend("Squidward");

        System.out.println(Friend.numberofFriends);
        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
    
        Friend.displayFriends();;

    }
}
// static modifier. A single copy of a variable meth0d is created and shared.
// The class "owns" the static member