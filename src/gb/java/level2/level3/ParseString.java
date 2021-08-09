package gb.java.level2.level3;

import java.util.*;

public class ParseString {
    Integer wordCount = 0;
    static String regex = "\\ ";
    Set<String> textWithoutDuplicates = new HashSet<>();

    public static void splitStringText(final String text, Set<String> textWithoutDuplicates) {
        String[] values = text.split(regex);
        int wordCounter = 0;
        String word;


        textWithoutDuplicates.addAll(Arrays.asList(values));

        for (int i = 0; i < values.length; i++) {

            word = values[i];
            for (int j = 0; j < values.length; j++) {

                if (values[j].equals(word)) {
                    wordCounter++;
                }
            }
            System.out.println("Found " + word + " : " + wordCounter + " times.");
            wordCounter = 0;
        }
        System.out.println("Text without duplicates!");
        System.out.println(textWithoutDuplicates);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParseString that = (ParseString) o;
        return Objects.equals(textWithoutDuplicates, that.textWithoutDuplicates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textWithoutDuplicates);
    }
}


