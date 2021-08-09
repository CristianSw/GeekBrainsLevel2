package gb.java.level2.homework5;

public class Main {
    static final int size = 10000000;
    static final int half = size / 2;

    public static void main(String[] args) {
        float[] array = new float[size];
        long startTime = 0L;
        long endTime = 0L;
        simpleArrayProcessing(array, startTime, endTime);
        multithreadingArrayProcessing(array, startTime, endTime);


    }


    public static void simpleArrayProcessing(float[] array, long startTime, long endTime) {

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }
        startTime = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            array[i] = (float) (array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Processing time for simple processing is: " + endTime);

    }

    public static void multithreadingArrayProcessing(float[] array, long startTime, long endTime) {

        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        float[] firstPartArray = new float[half];
        float[] secondPartArray = new float[half];
        float[] processedArray = new float[array.length];

        startTime = System.currentTimeMillis();
        System.arraycopy(array, 0, firstPartArray, 0, half);
        System.arraycopy(array, half, secondPartArray, 0, secondPartArray.length);

        Thread firstThread = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
            processArray(firstPartArray);
        });
        Thread secondThread = new Thread(() -> {
//            System.out.println(Thread.currentThread().getName());
            processArray(secondPartArray);
        });

        firstThread.start();
        secondThread.start();

        System.arraycopy(firstPartArray, 0, processedArray, 0, half);
        System.arraycopy(secondPartArray, 0, processedArray, half, half);

        endTime = System.currentTimeMillis() - startTime;
        System.out.println("Processing time for multithreading processing is : " + endTime);


    }

    public static void processArray(float[] arrayToBeProcessed) {
        for (int i = 0; i < arrayToBeProcessed.length; i++) {
            arrayToBeProcessed[i] = (float) (arrayToBeProcessed[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
