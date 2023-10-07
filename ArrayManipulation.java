public class ArrayManipulation {
    public int[] addElement(int element, int[] arrayToAdd) {
        int[] array = new int[arrayToAdd.length + 1];
        for (int i = 0; i < arrayToAdd.length - 1; i++) {

            array[i] = arrayToAdd[i];

        }
        array[arrayToAdd.length] = element;
        return array;
    }

    public String printArray(int[] arr) {
        String array = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            array += i;
            array += ",";
        }
        return array + arr[arr.length - 1] + "]";
    }

    public int[] removeElement(int element, int[] arrayToRemove) {
        int[] removedArray = new int[arrayToRemove.length - 1];
        for (int i = 0; i < arrayToRemove.length - 1; i++) {
            if (arrayToRemove[i] != element) {
                removedArray[i] = arrayToRemove[i];
            }

        }
        return removedArray;

    }

    public int[] modifyElement(int elementToAdd, int index, int[] arrayToManipulate) {
        int[] modifiedArray = new int[arrayToManipulate.length];
        for (int i = 0; i < arrayToManipulate.length; i++) {
            if (i == index) {
                modifiedArray[i] = elementToAdd;
            } else {
                modifiedArray[i] = arrayToManipulate[i];
            }

        }
        return modifiedArray;
    }

    public static void main(String[] args) {
        ArrayManipulation arrays = new ArrayManipulation();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        int elementToAdd = 69;
        int elementToRemove = 9;
        int elementToModify = 4;

        System.out.println(
                "Element 69 added to the end of the array: " + arrays.printArray(arrays.addElement(elementToAdd, arr)));
        System.out.println("Element 9 removed from the original array: "
                + arrays.printArray(arrays.removeElement(elementToRemove, arr)));
        System.out.println("Index 9 modified to have element 9: "
                + arrays.printArray(arrays.modifyElement(elementToModify, 3, arr)));

    }
}
