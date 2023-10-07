public class ArrayCalculator {
    private int[] arrayNumber;

    public ArrayCalculator() {
        arrayNumber = new int[5];
    }

    public ArrayCalculator(int[] array) {
        arrayNumber = array;
    }

    public int findMin() {
        int min = arrayNumber[0];
        for (int i : arrayNumber) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int findMax() {
        int max = arrayNumber[0];
        for (int i : arrayNumber) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public int sum() {
        int sum = 0;
        for (int i : arrayNumber) {
            sum += i;
        }
        return sum;
    }

    public boolean isExists() {
        if (arrayNumber.length > 0) {
            return true;
        }
        return false;
    }

    public boolean contains(int value) {
        for (int i : arrayNumber) {
            if (i == value) {
                return true;
            }
        }
        return false;

    }

    public int indexOf(int value) {
        for (int i = 0; i < arrayNumber.length; i++) {
            if (arrayNumber[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean isDivisible(int divisor) {
        for (int i : arrayNumber) {
            if (i % divisor != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean sumOfArrayIsOdd() {
        ArrayCalculator arrays = new ArrayCalculator();
        int sum = arrays.sum();
        if (sum % 2 != 0) {
            return true;
        }
        return false;
    }

    public boolean sumOfArrayIsEven() {
        ArrayCalculator arrays = new ArrayCalculator();
        int sum = arrays.sum();
        if (sum % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayCalculator arrays = new ArrayCalculator();
        System.out.println(arrays.sum());
        System.out.println(arrays.findMin());
        System.out.println(arrays.findMax());
        System.out.println(arrays.isExists());
        System.out.println(arrays.contains(4));
        System.out.println(arrays.indexOf(4));
        System.out.println(arrays.isDivisible(2));
        System.out.println(arrays.sumOfArrayIsOdd());
        System.out.println(arrays.sumOfArrayIsEven());

    }
}
