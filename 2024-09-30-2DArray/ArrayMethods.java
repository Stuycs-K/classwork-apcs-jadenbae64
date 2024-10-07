//anjali bechu
//abechu60@stuy.edu

//jaden bae
//jabae50@stuy.edu

public class ArrayMethods{
    public static void main(String[] args){

      //returns true if 2D Sum matches the sum  
      int[][] arr = {{2,3,4},{5,6,7},{8,0,4}};
      System.out.println(arr2DSum(arr) == 39);

      int[][] arr2 = {{2,3,0},{5,6},{8,0,4,1,1}};
      System.out.println(arr2DSum(arr2) == 30);
      
      int[][] arr3 = {{2,3,0},{},{8,0,4,1,1}};
      System.out.println(arr2DSum(arr3) == 19);

      int[][] arr4 = {{2,3,4,3},{2,6,5,4},{8,0,4,1}};
      System.out.println(arr2DSum(arr3) == 19);
      
      System.out.println(arrToString(arr));
      System.out.println(arrToString(arr4));

      System.out.print("array swap: are they same array? " + (swapRC(arr) == arr));
      System.out.print(" First Array: " + arrToString(arr));
      System.out.println(" Swapped Array: " + arrToString(swapRC(arr)));

      System.out.print("array swap: are they same array? " + (swapRC(arr4) == arr4));
      System.out.print(" First Array: " + arrToString(arr4));
      System.out.println(" Swapped Array: " + arrToString(swapRC(arr4)));

      // int [] [] array{
      //{2, 3, 4},
      //{5, 6, 7},
      //{8, 0, 4};
      //
      //String result = arrToString(array)
      //System.out.println= (arrToString(result))


    }

    public static String arrToString(int[] ary){
        String combined = "[";
        for (int i = 0; i < ary.length; i++){
            if (i == ary.length - 1){
                combined += ary[i];

            }else{
                combined += ary[i] + ", ";

            }
        }

        combined += "]";
        return combined;
    }

    public static String arrToString(int[][] ary){
        String combined = "[";
        for (int i = 0; i < ary.length; i++){
            if (i == ary.length - 1){
                combined += arrToString(ary[i]);

            }else{
                combined += arrToString(ary[i]) + ", ";

            }
        }

        combined += "]";
        return combined;
    }

    public static int arr2DSum(int[][]nums){
        int combinedSum = 0;
        for (int i = 0; i < nums.length; i++){
            for (int index = 0; index < nums[i].length; index++){
                combinedSum = combinedSum + nums[i][index];
            }
        }

        return combinedSum;
    }
    
    public static int[][] swapRC(int[][]nums){
        
        int[][] newArray = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++){
            for (int index = 0; index < nums[i].length; index++){
                newArray[index][i] = nums[i][index];
            }
        
        }
            
        return newArray;
    }
}