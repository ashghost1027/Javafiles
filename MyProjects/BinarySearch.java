
public class BinarySearch {
    int[] array;
    public BinarySearch(int[] array){
        this.array = array;
    }
    public int search(int element, int[] array){
        if (array[(int) Math.floor(array.length/2)]==element) return (int) Math.floor(array.length/2);
        else {
            if (element<array[(int) Math.floor(array.length/2)]) return search(element, array);

            else{
                int[] greaterHalfOfTheArray = new int[(int)Math.floor(array.length/2)];
                for (int i = (int)(Math.floor(array.length/2)); i<array.length; i++){
                    System.out.println(i-(int)(Math.floor(array.length/2)));
                    System.out.println("length" + greaterHalfOfTheArray.length);
                    greaterHalfOfTheArray[i-(int)(Math.floor(array.length/2))] = array[i];

                }
                return (int) Math.floor(array.length/2) + search(element,greaterHalfOfTheArray);
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        
        BinarySearch binary = new BinarySearch(array);
        System.out.println(binary.search(8,array));
    }
}
