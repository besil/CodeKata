package yahtzee

class Yahtzee {
  def makeRule(n: Int): List[Int] => Int = {
    (l: List[Int]) => l filter{ _ == n } sum
  }
  
//  val ones = (l: List[Int]) => l.filter { x => x==1 }.sum
  val ones = makeRule(1)
  val twos = makeRule(2)
  
}