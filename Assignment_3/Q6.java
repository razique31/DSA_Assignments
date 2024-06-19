public class Q6 {
    public static <T> int count(T[] array, T item){
        int count = 0 ;
        for (T element : array){
            if (element.equals(item)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Integer[] intArr = {1,2,3,2,4,5,2};
        Double[] doubleArr = {1.2,1.4,1.2,1.6,1.2};
        Character[] charArr = {'a','b','a','c','a'};
        String[] strArr = {"bye","hello","why","bye"};
        
        System.out.println("count of 2: "+count(intArr, 2));
        System.out.println("count of 1.2: "+count(doubleArr,1.2));
        System.out.println("count of a: "+count(charArr, 'a'));
        System.out.println("count of bye: "+count(strArr, "bye"));

    }

}
