package gb.java.level2.level3;

import java.util.ArrayList;
import java.util.List;

public class TelephoneBook {

    public static void searchPerson(List<Person> telephoneBook, final String lastName) {
        boolean isPresent = false;
        System.out.println("Search person by Last Name : " + lastName);
        for (Person t : telephoneBook) {
            if (t.getLastName().equalsIgnoreCase(lastName)){
                System.out.println(t.getLastName() + " : " + t.getTelephone());
                isPresent = true;
            }
        }
        if (!isPresent){
            System.out.println("Person not found!");
        }
    }
}
