import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()
    //testing Arrays.toString
    int[] arr = {2,3,4,5,6,7};
    System.out.println(arrToString(arr).equals(Arrays.toString(arr)));
    int[][] arr2 = {{2,3,0},{0,5,6},{8,0,4,1,1}};
    System.out.println(countZeros2D(arr2));
    System.out.println(arr2DSum(arr2));
    int[][] arr3 = {{1,2},{3}};
    System.out.println(htmlTable(arr3));
  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[]ary){
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

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
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

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int index = 0; index < nums.length; index++){
        if (nums[i][index] == 0){
          count ++;

        }

      }

    }

    return count;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int count = 0;
    for (int i = 0; i < nums.length; i++){
      for (int index = 0; index < nums.length; index++){
        count += nums[i][index];

      }

    }

    return count;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
              for (int index = 0; index < vals[i].length; index++){
                  if (vals[i][index] < 0){
                      if (i == index){
                          vals[i][index] = 1;
                      }else{
                          vals[i][index] = 0;
                      }
                  }
              }        
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.

  public static int[] copyInnerArray(int[] nums){
      int[] newArray = new int[nums.length];
      for (int i = 0; i < nums.length; i++){
          newArray[i] = nums[i];
      }

      return newArray;
  }

  public static int[][] copy(int[][] nums){
    int[][] newArray = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){ 
      newArray[i] = copyInnerArray(nums[i]);
    }

    return newArray;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] newArray = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++){
            for (int index = 0; index < nums[i].length; index++){
                newArray[index][i] = nums[i][index];
            }
        
        }
            
        return newArray;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String htmlTag = "<table>";

    for (int i = 0; i < nums.length; i++){
      htmlTag = htmlTag + "<tr>";
      for (int index = 0; index < nums[i].length; index++){
        htmlTag = htmlTag + "<td>";
        htmlTag = htmlTag + nums[i][index];
        htmlTag = htmlTag + "</td>";
      }        
      htmlTag = htmlTag + "</tr>";
    }


    return htmlTag+"</table>";
  }
}
