package sets;

import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {

    private Set<String> guests;

    public PartyGuestList() {
        guests = new HashSet<>();
    }

    public PartyGuestList(Set<String> guests) {
        this.guests = guests;
    }

    public void addGuest(String guest) {
        guests.add(guest);
    }

    public void removeGuest(String guest) {
        guests.remove(guest);
    }

    public boolean isGuestInList(String guest) {
        return guests.contains(guest);
    }

    public int getTotalGuests() {
        return guests.size();
    }

    public boolean isEmpty() {
        return guests.isEmpty();
    }
}
