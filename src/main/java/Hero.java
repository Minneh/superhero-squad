public class Hero{
  //member property to hold hero name
  private String mName;

  //Hero class with a constructor that (for now) takes only one argument: the superhero's name
  public Hero(String name){
    mName = name;
  }

  //function to return a hero's name
  public String getName(){
    return mName;
  }
}
