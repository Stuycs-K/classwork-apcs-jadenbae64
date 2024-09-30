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
    
    public static int[] returnCopy(int[]ary){
        int[] newArray = new int[ary.length];
        
        for (int i = 0; i < ary.length; i++){
            newArray[i] = ary[i];
        }

        return newArray;
    }
    
    public static int[] concatArray(int[]ary1,int[]ary2){
        int[] newArray = new int[ary1.length + ary2.length];
        
        for (int i = 0; i < ary1.length; i++){
            newArray[i] = ary1[i];
        }

        for (int i = 0; i < ary2.length; i++){
            newArray[i + ary1.length] = ary2[i];
        }

        return newArray;


    }
    public static void main(String[]args){
        int myArray[] = {3, 4, 3, 2};
        int myArray2[] = {2, 3 , 4};
        System.out.println(arrayToString(myArray));
        System.out.println(!(myArray == returnCopy(myArray))); //returns true when they point at different array
        System.out.println(arrayToString(concatArray(myArray, myArray2)));

    }



}