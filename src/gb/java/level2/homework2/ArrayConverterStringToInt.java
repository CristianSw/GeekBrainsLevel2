package gb.java.level2.homework2;


public class ArrayConverterStringToInt {
    public static void arrayDataCheckStringToInt(String[][] array) throws MyArrayDataException {
        int intValue;
        int sum = 0;
        int column = 0;
        int row = 0;
        boolean isFalse = true;
        if (isFalse) {
            try {
                for (int i = 0; i < array.length; i++) {
                    column = i;
                    for (int j = 0; j < array.length; j++) {
                        row = j;
                        intValue = Integer.parseInt(array[i][j]);

                        sum += intValue;
                    }
                }
            } catch (NumberFormatException e) {
                isFalse = false;
                throw new MyArrayDataException("Cell array[" + column + "][" + row + "] is not number." + "This is : " + array[column][row]);
            }
        }
        System.out.println("Sum is " + sum);

    }
}
