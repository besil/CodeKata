package yahtzee

class Yahtzee {
  def makeSimpleRule(n: Int)(l: List[Int]): Int = l filter { _ == n } sum
  
  val ones = makeSimpleRule(1)(_)
  val twos = makeSimpleRule(2) _
  
  def pair = (l: List[Int]) => {
   l.map { x => (x, l.count(_==x)) }.maxBy(x => x._1) match {
     case (x, y) => x * y
   }
  }
  
  def groupKind(n: Int)(l:List[Int]): Int = {
    l.groupBy(x=>x).filter(x => x._2.size==n).values.flatten.sum
  }
  
//  def twopair = (l: List[Int]) => l.groupBy(x => x).filter(x => x._2.size==2).values.flatten.sum
  def twopair = groupKind(2) _
//  def threekind = groupKind(3) _
  def threekind = (l: List[Int]) => {
    l.groupBy { x => x }.filter(_._2.size==3).values.flatten.sum
  }
}