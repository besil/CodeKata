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
  
  @Test
  def pair() = assertEquals(8, yahtzee.pair(List(3,3,3,4,4)))
  
  @Test
  def twopair() = assertEquals(8, yahtzee.twopair(List(1,1,2,3,3)))
  
  @Test
  def threekind() = assertEquals(9, yahtzee.threekind(List(3, 3, 3, 4, 5)))
  
  
}