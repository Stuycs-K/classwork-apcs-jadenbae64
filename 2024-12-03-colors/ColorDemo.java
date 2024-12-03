public class ColorDemo{
  public static void main(String[] args){

    for (int j = 0; j < 7; j++){
      System.out.println("");
      for (int i = 0; i < 3; i++){
        System.out.print("\u001b[34mBlue");
        System.out.print(" fish ");
      }

      for (int i = 0; i < 6; i++){
        if (j % 2 == 1){
          System.out.print("\u001b[37mRed");
          System.out.print(" fish ");
        }else{
          System.out.print("\u001b[31mRed");
          System.out.print(" fish ");

        }

      }

    }

    for (int j = 1; j < 7; j++){
      System.out.println("");
      for (int i = 0; i < 3; i++){
        if (j % 2 == 1){
          System.out.print("\u001b[37mBlue");
          System.out.print(" fish ");
        }else{
          System.out.print("\u001b[31mBlue");
          System.out.print(" fish ");

        }

      }

      for (int i = 0; i < 6; i++){
        if (j % 2 == 1){
          System.out.print("\u001b[37mRed");
          System.out.print(" fish ");
        }else{
          System.out.print("\u001b[31mRed");
          System.out.print(" fish ");

        }

      }

  }
}
}
