package gb.java.level2.homework2;

import static gb.java.level2.homework2.ArrayChecker.checkArraySize;
import static gb.java.level2.homework2.ArrayConverterStringToInt.arrayDataCheckStringToInt;

public class MainLesson2 {
    public static void main(String[] args) {
////        ex1
//        String[][] array = new String[4][3];
//        try {
//            checkArraySize(array);
//        } catch (MyArraySizeException e) {
//            e.getCause();
//            e.getMessage();
//            e.printStackTrace();
//        }

        //    ex2
        String[][] dataArray = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
//        String[][] dataArrayInvalidNumberOfColumns = {
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "1"},
//                {"1", "1", "1", "1"}
//        };
//        String[][] dataArrayInvalidSymbolProvided = {
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "p", "1"},
//                {"1", "1", "1", "1"}
//        };
//        String[][] dataArrayInvalidSizeAndSymbol = {
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"},
//                {"1", "1", "1", "1"}
//        };
        try {
            checkArraySize(dataArray);
        } catch (MyArraySizeException sizeException) {
            sizeException.getCause();
            sizeException.getMessage();
            sizeException.printStackTrace();
        }

        try {
            arrayDataCheckStringToInt(dataArray);
        } catch (MyArrayDataException | ArrayIndexOutOfBoundsException dataException) {
            dataException.getCause();
            dataException.getMessage();
            dataException.printStackTrace();
        }
    }
}
