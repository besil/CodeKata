package fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class FizzBuzzTest() {
  var fb: FizzBuzz = _
  
  @Before def before() {
    fb = new FizzBuzz()
  }
  
  @Test def testNormal() {
    assertEquals("1", fb.fizzBuzz(1))
    assertEquals("2", fb.fizzBuzz(2))
    assertEquals("4", fb.fizzBuzz(4))
  }
  
  @Test def testThree()   = assertEquals("fizz", fb.fizzBuzz(3))
  @Test def testFive()    = assertEquals("buzz", fb.fizzBuzz(5))
  @Test def testFifteen() = assertEquals("fizzbuzz", fb.fizzBuzz(15))
  
  
}