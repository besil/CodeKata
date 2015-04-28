package yahtzee

import org.junit.Test
import org.junit.Assert._

class YahtzeeTest {
  private val yahtzee = new Yahtzee()
  
  @Test
  def ones() {
    assertEquals(5, yahtzee.ones(List(1,1,1,1,1)))
    assertEquals(2, yahtzee.ones(List(1,2,3,4,1)))
  }
  
  @Test
  def twos() {
    assertEquals(4, yahtzee.twos(List(2,2,1,1,1)))
    assertEquals(6, yahtzee.twos(List(2,2,2,1,1)))
  }
}