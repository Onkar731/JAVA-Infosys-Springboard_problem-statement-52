public class Segregate {
    public static byte[] segregateArray(byte []array) {
        // declaring variables
        int lastIndex = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1) {
                byte temp = array[i];
                array[i] = array[lastIndex];
                array[lastIndex] = temp;

                // incrementing last index
                lastIndex++;
            }
        }

        // returning segregated array
        return array;
    }
}