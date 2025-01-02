<<<<<<< HEAD
public class Game{
  public static void main(String[]args){
    CodeWarrior codeWarrior1 = new CodeWarrior();
    Adventurer adventurer1 = new Adventurer();

    System.out.println(codeWarrior1.getName()+", "+codeWarrior1.getHP()+", "+codeWarrior1.getSpecialName()+", "+codeWarrior1.getSpecial());
    System.out.println(adventurer1.getName()+", "+adventurer1.getHP());
=======
import java.util.Scanner;

public class Game{
  public static boolean checkHealth(Adventurer p1, Adventurer p2){
    if (p1.getHP() <= 0 || p2.getHP() <= 0){

      if (p1.getHP() > p2.getHP()){
        System.out.println(p1.getName()+" has won over "+p2.getName()+"!");
      }else{
        System.out.println(p2.getName()+" has won over "+p1.getName()+"!");
      }
      return true;
    }
    return false;

  }
  public static void main(String[]args){    
    CodeWarrior codeWarrior1 = new CodeWarrior();
    Adventurer adventurer1 = new Warrior("Beowulf");

    System.out.println(codeWarrior1.getName()+", "+codeWarrior1.getHP()+", "+codeWarrior1.getSpecialName()+", "+codeWarrior1.getSpecial());
    System.out.println(adventurer1.getName()+", "+adventurer1.getHP()+", "+adventurer1.getSpecialName()+", "+adventurer1.getSpecial());

    Scanner userInput = new Scanner(System.in);
>>>>>>> ef55622ee9f97ba91dfbbb4060c990362dd67103

    while (true){
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String nextMove = userInput.nextLine();

<<<<<<< HEAD
      if (nextMove.Equals("a")) {

      }else if (nextMove.Equals("sp")){


      }else if (nextMove.Equals("su")){


      }else if (nextMove.Equals("quit")){
=======
      if (nextMove.equals("a")) {
        System.out.println(adventurer1.attack(codeWarrior1));
      }else if (nextMove.equals("sp")){
        System.out.println(adventurer1.specialAttack(codeWarrior1));

      }else if (nextMove.equals("su")){
        System.out.println(adventurer1.support(adventurer1));

      }else if (nextMove.equals("quit")){
>>>>>>> ef55622ee9f97ba91dfbbb4060c990362dd67103
        break;

      }else{
        System.out.println("Please type valid response!");
      }

<<<<<<< HEAD

      if (codeWarrior1.getHP() <= 0 || adventurer1.getHP() <= 0){

        break;
      }
=======
      if (checkHealth(codeWarrior1, adventurer1)){
        break;
      }

      int action = (int) Math.random() * 3;
      if (action == 0){
        System.out.println(codeWarrior1.attack(adventurer1));
      }else if (action == 1){
        System.out.println(codeWarrior1.specialAttack(adventurer1));
      }else{
        System.out.println(codeWarrior1.support(codeWarrior1));
      }

      if (checkHealth(codeWarrior1, adventurer1)){
        break;
      }

>>>>>>> ef55622ee9f97ba91dfbbb4060c990362dd67103
    }


  }
}
