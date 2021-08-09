package gb.java.level2.level3;

import java.util.*;

public class MainCollections {
    public static void main(String[] args) {
//        String text = "One Two Three Four One Moving One Riding Two SQL One Moving One SQL";
//        Set<String> textWithoutDuplicates = new HashSet<>();
//
//        ParseString.splitStringText(text, textWithoutDuplicates);

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Tanas","123456648"));
        personList.add(new Person("Dolinta","793569212511"));
        personList.add(new Person("Dolinta","752212135542"));
        personList.add(new Person("Bantas","3322551515"));
        personList.add(new Person("Crouch","1223254522"));
        personList.add(new Person("Burduja","12355262651"));
        personList.add(new Person("Leonti","123251651"));
        personList.add(new Person("Gangan","13165032165165"));
        personList.add(new Person("Capcan","12165850511"));
        personList.add(new Person("Comic","651651654225"));
        personList.add(new Person("Tomic","61651654822321"));
        personList.add(new Person("Guz","65165523221561"));
        personList.add(new Person("Ursu","65123265421165165"));
        personList.add(new Person("Ursu","1132215655955"));

        TelephoneBook.searchPerson(personList,"dolinta");

    }

}
