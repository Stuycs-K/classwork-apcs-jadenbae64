public class MyArrays{
    

    public static String arrayToString(int array[]){
        String combined = "[";
        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1){
                combined += array[i];

            }else{
                combined += array[i] + ", ";

            }
        }

        combined += "]";
        return combined;
    }
    
    
    
    public static void main(String[]args){
        int myArray[] = {3, 4, 3, 2};
        System.out.println(arrayToString(myArray));


    }



}