public class Q5 {
    public static <E> void printArray(E[] inputArray){
        for (E element : inputArray){
            System.out.print(element+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Integer[] intArr = {1,2,3,4,5};
        Double[] doubleArr = {1.2,1.4,1.6};
        Character[] charArr = {'a','b','c'};
        String[] strArr = {"hello","why","bye"};

        System.out.println("Integer array:");
        printArray(intArr);

        System.out.println("Double array:");
        printArray(doubleArr);

        System.out.println("Character array:");
        printArray(charArr);

        System.out.println("String array:");
        printArray(strArr);
    }

}
