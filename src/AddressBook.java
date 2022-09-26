import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> buddies = new ArrayList<BuddyInfo>();

    void addBuddy(BuddyInfo b) {
        buddies.add(b);
    }

    void removeBuddy(BuddyInfo b) {
        buddies.remove(b);
    }

    void sayHi() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        System.out.println("Address Books");
        BuddyInfo b2 = new BuddyInfo("Homer", "somehwere","123456869");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(b2);
        addressBook.addBuddy(b2);
        addressBook.removeBuddy(b2);
    }


}
