public class Task2 {
    public static <T> boolean compareArrays(T[] arr1, T[]arr2) {
        if(arr1.length == arr2.length) {
            if(arr1.getClass().getName().equals(arr2.getClass().getName())) {
                for (int i = 0; i < arr1.length; i++) {
                    if (arr1[i].equals(arr2[i])) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] array1 = {"one", "two", "three"};
        String[] array2 = {"one", "two", "three"};
        String[] array3 = {"one", "two", "three", "four"};

        System.out.println(compareArrays(array1, array2));
        System.out.println(compareArrays(array1, array3));
    }
}
