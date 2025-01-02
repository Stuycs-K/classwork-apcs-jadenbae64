public class Warrior extends Adventurer{
  private int energy, energyMax;
  private String preferredSword;

  /*the other constructors ultimately call the constructor
    with all parameters.*/
  public Warrior(String name, int hp, String sword){
    super(name,hp);
    energyMax = 12;
    energy = energyMax/2;
    preferredSword = sword;
  }

  public Warrior(String name, int hp){
    this(name,hp,"dagger");
  }

  public Warrior(String name){
    this(name,12);
  }

  public Warrior(){
    this("Carmack");
  }

  /*The next 8 methods are all required because they are abstract:*/
  public String getSpecialName(){
    return "Spin";
  }

  public int getSpecial(){
    return energy;
  }

  public void setSpecial(int n){
    energy = n;
  }

  public int getSpecialMax(){
    return energyMax;
  }

  /*Deal 1-6 damage to opponent, restores 2 energy*/
  public String attack(Adventurer other){
    int damage = (int)(Math.random()*6)+1;
    other.applyDamage(damage);
    restoreSpecial(2);
    return this + " attacked "+ other + " and dealt "+ damage +
    " points of damage.";
  }

  /*Deal 3-12 damage to opponent, only if energy is high enough.
    Reduces energy by 8.
  */
  public String specialAttack(Adventurer other){
    if(getSpecial() >= 8){
      setSpecial(getSpecial()-8);
      int damage = (int)(Math.random()*5+Math.random()*5)+3;
      other.applyDamage(damage);
      return this + " used their "+preferredSword+
      " skills."+
      " This stabbed "+other+" dealing "+ damage +" points of damage.";
    }else{
      return "Not enough energy. Instead "+attack(other);
    }
  }

  /*Restores 5 special to other*/
  public String support(Adventurer other){
    return "Uses energy to "+other+" and restores "
    +other.restoreSpecial(5)+" "+other.getSpecialName();
  }
  /*Restores 6 special and 1 hp to self.*/
  public String support(){
    int hp = 1;
    setHP(getHP()+hp);
    return this+" ueses energy to restore "+restoreSpecial(6)+" "
    + getSpecialName()+ " and "+hp+" HP";
  }
}
