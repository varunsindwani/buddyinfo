import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> buddys = new ArrayList<BuddyInfo>();

    void addBuddy(BuddyInfo b) {
        buddys.add(b);
    }

    void removeBuddy(int index) {
        buddys.remove(index);
    }

    public static void main(String[] args) {
        System.out.println("Address Books");
        BuddyInfo b2 = new BuddyInfo("Homer", "somehwere","123456869");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(b2);
        addressBook.removeBuddy(0);
    }


}
