import java.util.ArrayList;

public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String>ary = new ArrayList<String>(size);
    for (int i = 0; i < size; i++){
      ary.add(""+(int)(Math.random() * 11));
      if (ary.get(i).equals("0")){
        ary.set(i, "");
      }

    }
    return ary;
  }
}