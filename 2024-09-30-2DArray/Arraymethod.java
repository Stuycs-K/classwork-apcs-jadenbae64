//anjali bechu
//abechu60@stuy.edu

//jaden bae
//jabae50@stuy.edu

public class ArrayMethods{
    public static void main(String[] args){
      int[][] arr = {{2,3,4},{5,6,7},{8,0,4}};

      System.out.println(arrToString(arr));

      // int [] [] array{
      //{2, 3, 4},
      //{5, 6, 7},
      //{8, 0, 4};
      //
      //String result = arrToString(array)
      //System.out.println= (arrToString(result))


    }

    public static String arrayToString(int ary[]){
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

    public static String arrToString(int[][]ary){
        String combined = "{{";
        for (int i = 0; i < ary.length; i++){
            if (i == ary.length - 1){
                combined += arrToString(ary[i]);

            }else{
                combined += arrToString(ary[i] + "}, {}");

            }
        }

        combined += "}}";
        return combined;
    }





}
