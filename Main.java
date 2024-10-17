public class Main {
    
    // Завдання 1: Знайти кількість від’ємних елементів масиву
    static class NegativeElementsCounter {
        public static int countNegativeElements(int[] array) {
            if (array == null) {
                throw new NullPointerException("Array cannot be null");
            }
            int count = 0;
            for (int value : array) {
                if (value < 0) {
                    count++;
                }
            }
            return count;
        }
    }

    // Завдання 2: Знайти номер найбільшого за модулем елемента масиву, індекс якого кратний 3
    static class MaxAbsElementIndex {
        public static int findMaxAbsElementIndex(int[] array) {
            if (array == null) {
                throw new NullPointerException("Array cannot be null");
            }
            if (array.length == 0) {
                throw new IllegalArgumentException("Array cannot be empty");
            }
            int maxIndex = -1;
            int maxAbsValue = Integer.MIN_VALUE;

            for (int i = 0; i < array.length; i += 3) {
                if (Math.abs(array[i]) > maxAbsValue) {
                    maxAbsValue = Math.abs(array[i]);
                    maxIndex = i;
                }
            }

            return maxIndex;
        }
    }

    // Завдання 3: Сформувати новий масив, елементи якого це елементи початкового масиву, помножені на 2
    static class DoubleElementsArray {
        public static int[] doubleElements(int[] array) {
            if (array == null) {
                throw new NullPointerException("Array cannot be null");
            }
            int[] resultArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                resultArray[i] = array[i] * 2;
            }
            return resultArray;
        }
    }

    public static void main(String[] args) {
        // Перевірка завдання 1
        int[] array1 = {-1, 2, -3, 4, -5};
        int[] array2 = {0, 1, 2, 3};
        int[] array3 = {-1, -2, -3, -4};

        System.out.println("Завдання 1: Кількість від’ємних елементів");
        System.out.println("Count of negative elements: " + NegativeElementsCounter.countNegativeElements(array1));
        System.out.println("Count of negative elements: " + NegativeElementsCounter.countNegativeElements(array2));
        System.out.println("Count of negative elements: " + NegativeElementsCounter.countNegativeElements(array3));

        // Перевірка завдання 2
        System.out.println("\nЗавдання 2: Індекс найбільшого за модулем елемента масиву, індекс якого кратний 3");
        System.out.println("Index of max abs element (divisible by 3): " + MaxAbsElementIndex.findMaxAbsElementIndex(array1));
        System.out.println("Index of max abs element (divisible by 3): " + MaxAbsElementIndex.findMaxAbsElementIndex(array2));
        System.out.println("Index of max abs element (divisible by 3): " + MaxAbsElementIndex.findMaxAbsElementIndex(array3));

        // Перевірка завдання 3
        System.out.println("\nЗавдання 3: Подвоєні елементи масиву");
        System.out.println("Doubled elements array: " + java.util.Arrays.toString(DoubleElementsArray.doubleElements(array1)));
        System.out.println("Doubled elements array: " + java.util.Arrays.toString(DoubleElementsArray.doubleElements(array2)));
        System.out.println("Doubled elements array: " + java.util.Arrays.toString(DoubleElementsArray.doubleElements(array3)));
    }
}
