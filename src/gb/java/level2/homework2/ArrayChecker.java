package gb.java.level2.homework2;

public class ArrayChecker {
    public static void checkArraySize(String[][] array) throws MyArraySizeException {
        final int SIZE_OF_ARRAY = 4;

        int row = array.length;
        int column = array[0].length;

        if (row < SIZE_OF_ARRAY || column < SIZE_OF_ARRAY) {
            throw new MyArraySizeException("Size of array not valid. Needed size is " + SIZE_OF_ARRAY);
        }else  System.out.println("Array is OK.");


    }
}
