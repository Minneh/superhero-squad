import org.junit.*;
import static org.junit.Assert.*;

public class SquadTest {

  @Test
  public void squad_instantiatesCorrectly_true() {
    Squad testSquad = new Squad("Justice League");
    assertEquals(true, testSquad instanceof Squad);
  }

  @Test
  public void getName_squadInstantiatesWithName_Home() {
    Squad testSquad = new Squad("Justice League");
    assertEquals("Justice League", testSquad.getName());
  }

  @Test
  public void all_returnsAllinstancesOfSquad_true(){
    Squad firstSquad = new Squad("Justice League");
    Squad secondSquad = new Squad("The Avengers");
    assertEquals(true, Squad.all().contains(firstSquad));
    assertEquals(true, Squad.all().contains(secondSquad);
  }

  @Test
  public void clear_emptiesAllSquadsFromList_0(){
    Squad testSquad = new Squad("Justice League");
    Squad.clear();
    assertEquals(Category.all().size(), 0);
  }

  @Test public void getId_squadsInstantiateWihtAnId_1(){
    Squad testSquad = new Squad("Justice League");
    assertEquals(1, testSquad.getId());
  }
}
