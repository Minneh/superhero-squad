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
}
