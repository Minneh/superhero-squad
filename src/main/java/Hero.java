public class Hero{
  //member property to hold hero name
  private String mName;
  private int mAge;
  private String mSpecialPower;
  private String mWeakness;

  //Hero class with a constructor that (for now) takes only one argument: the superhero's name
  public Hero(String name){
    mName = name;
  }

  //function to return a hero's name
  public String getName(){
    return mName;
  }
}
