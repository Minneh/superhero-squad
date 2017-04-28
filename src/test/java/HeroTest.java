import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest{
  Hero myHero;
  @Before
  public void instantiating() {
    myHero = new Hero("Superman", 35, "Flight", "Kryptonite");
  }

  @Test
  public void Hero_instantiatesCorrectly_true(){
    // Hero myHero = new Hero("Superman");
    assertEquals(true, myHero instanceof Hero);
  }

  @Test
  public void Hero_instantiatesWithName_String() {
    // Hero myHero = new Hero("Superman");
    assertEquals("Superman", myHero.getName());
  }
  @Test
  public void all_returnsAllInstancesOfHero_true(){
    Hero firstHero = new Hero("Superman", 35, "Flight", "Kryptonite");
    Hero secondHero = new Hero("Antman", 32, "Shrinkage", "Aardvarks");
    assertEquals(true, Hero.all().contains(firstHero));
    assertEquals(true, Hero.all().contains(secondHero));
    }

  @Test
  public void clear_emptiesAllHeroesFromArrayList_0() {
    Hero myHero = new Hero("Superman", 35, "Flight", "Kryptonite");
    Hero.clear();
    assertEquals(Hero.all().size(), 0);
  }

  @Test
  public void getId_heroesInstantiateWithAnID_1() {
    Hero.clear();  // Remember, the test will fail without this line! We need to empty leftover Heros from previous tests!
    Hero myHero = new Hero("Superman", 35, "Flight", "Kryptonite");
    assertEquals(1, myHero.getId());
  }
    @Test
    public void find_returnsHeroWithSameId_secondHero() {
      Hero firstHero = new Hero("Hulk", 39, "Super strength", "Black Widow");
      Hero secondHero = new Hero("Black Widow", 30, "Ninja skills", "Dr. Jekyll");
      assertEquals(Hero.find(secondHero.getId()), secondHero);
    }
}
