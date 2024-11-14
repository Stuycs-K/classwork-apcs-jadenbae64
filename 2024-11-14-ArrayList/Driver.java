import java.util.ArrayList;
public class Driver{
  public static void main(String[] args){
    ArrayList<String> a = ArrayListPractice.createRandomArray(100);
    for (int i = 0; i < 100; i++) {
      System.out.println(a.get(i));
    }

  }
}
