package DSnA;

public class Algorithms {
    public int[] selectionSort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[i]<array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
    public int[] bubbleSort(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length-1; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public int[] insertionSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < i; j++){
                if(array[i]<array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

    public int[] mergeSort(int[] array){
        if (array.length < 2) return array;
        int firstHalf = array.length/2;
        int secondHalf = array.length/2;
        int[] firstArray = new int[firstHalf];
        int[] secondArray = new int[secondHalf];
        return merge(mergeSort(firstArray),mergeSort(secondArray));
    }
    public int[] merge(int[] array1,int[] array2){
        int[] array = new int[array1.length+array2.length];
        int i = 0;
        while (array1.length > 1 && array2.length > 1){
            if (array1[i]>array2[i]){
                array[i] = array1[i];
                i++;
            }
            else{
                array[i] = array2[i];
                i++;
            }
        }
        while (array1.length > 0 && array2.length <= 0){
            array[i] = array1[array1.length-1];
            i++;
        }
        while (array2.length > 0 && array1.length <= 0){
            array[i] = array2[array2.length-1];
            i++;
        }
        return array;
    }

    public int[] quickSort(int[] array){
        if (array.length < 2){
            return array;
        }
        else{
            int pivot = array[array.length-1];
            int pivotPosition = -1;
            for(int i = 0; i < array.length; i ++){
                if (array[i] < pivot){
                    pivotPosition++;
                    int temp = array[pivotPosition];
                    array[pivotPosition] = array[i];
                    array[i] = temp;
                }
            }
            int temp = array[pivotPosition+1];
            array[pivotPosition+1] = pivot;
            array[array.length-1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        Algorithms algorithms = new Algorithms();
        int[] selectionSortedArray = algorithms.selectionSort(new int[]{4,3,2,5,2,1,6,3,9,8,7});
        for (int i : selectionSortedArray){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] bubbleSortedArray = algorithms.bubbleSort(new int[]{4,3,2,5,2,1,6,3,9,8,7});
        for (int i : bubbleSortedArray){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] insertionSortedArray = algorithms.insertionSort(new int[]{4,3,2,5,2,1,6,3,9,8,7});
        for (int i : insertionSortedArray){
            System.out.print(i + " ");
        }
        System.out.println();
        int[] mergeSortedArray = algorithms.mergeSort(new int[]{4,3,2,5,2,1,6,3,9,8,7});
        for (int i : mergeSortedArray){
            System.out.print(i + " ");
        }

    }
}
