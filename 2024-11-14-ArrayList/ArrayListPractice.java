public class ArrayListPractice{
  public static ArrayList<String>createRandomArray(int size){
    ArrayList<String> array = new ArrayList<String>[size];
    for (int i = 0; i < size; i++){
      ArrayList.set(i, ""+(int)(Math.random() * 11));
      if (ArrayList.get(i).equals("0")){
        ArrayList.set(i, "");
      }

    }

  }
}
