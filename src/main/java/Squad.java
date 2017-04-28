public class Squad{
  private String mName;

  public Squad(String name){
    mName = name;
  }

  public String getName() {
    return mName;
  }

  public static List<Squad> all() {
   return instances;
 }

 public static void clear(){
   instances.clear();
 }
}
