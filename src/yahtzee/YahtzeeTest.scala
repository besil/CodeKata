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
  
  @Test
  def fourkind() = assertEquals(8, yahtzee.fourkind(List(2, 2, 2, 2, 5)))
  
  @Test
  def smallstraight() = assertEquals(15, yahtzee.smallstraight(List(1,2,3,4,5)))
  
  @Test
  def largestraight() = assertEquals(20, yahtzee.largestraight(List(2,3,4,5,6)))
  
  @Test
  def fullhouse() = {
    assertEquals(8, yahtzee.fullhouse(List(1,1,2,2,2)))
    assertEquals(0, yahtzee.fullhouse(List(4,4,4,4,4)))
  }
  
  @Test
  def yahtzeeTest() = assertEquals(50, yahtzee.yahtzee(List(2,2,2,2,2)))
  
  @Test
  def chanceTest() = {
    assertEquals(5*5, yahtzee.chance( (for(i <- 1 to 5) yield 5) toList))
    assertEquals(5, yahtzee.chance(List(1,1,1,1,1)))
  }
}