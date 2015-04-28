package yahtzee

class Yahtzee {
//  def makeSimpleRule(n: Int): List[Int] => Int = {
//    (l: List[Int]) => l filter{ _ == n } sum
//  }
  def makeSimpleRule(n: Int)(l: List[Int]): Int = l filter { _ == n } sum
  
//  val ones = (l: List[Int]) => l.filter { x => x==1 }.sum
  val ones = makeSimpleRule(1)(_)
//  val ones = (l: List[Int]) => makeSimpleRule(1)(l)
  val twos = makeSimpleRule(2) _
  
  def pair = (l: List[Int]) => {
   l.map { x => (x, l.count(_==x)) }.maxBy(x => x._1) match {
     case (x, y) => x * y
   }
  }
  
  def twopair = (l: List[Int]) => l.groupBy(x => x).filter(x => x._2.size==2).values.flatten.sum
  
}