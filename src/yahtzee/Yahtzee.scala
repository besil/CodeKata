package yahtzee

class Yahtzee {
  def makeSimpleRule(n: Int)(l: List[Int]): Int = l filter { _ == n } sum
  
  val ones = makeSimpleRule(1)(_)
  val twos = makeSimpleRule(2) _
  val threes = makeSimpleRule(3) _
  val fours = makeSimpleRule(4) _
  val fives = makeSimpleRule(5) _
  val sixes = makeSimpleRule(6) _
  
  val pair = (l: List[Int]) => {
   l.map { x => (x, l.count(_==x)) }.maxBy(x => x._1) match {
     case (x, y) => x * y
   }
  }
  
  private def groupKind(n: Int)(l:List[Int]): Int = l.groupBy(x=>x).filter(x => x._2.size==n).values.flatten.sum
  
  val twopair = groupKind(2) _
  val threekind = groupKind(3) _
  val fourkind = groupKind(4) _
  
  private def straight(range: List[Int])(l:List[Int]) = l==range match {
    case true => range.sum
    case _ => 0
  }
  
  val smallstraight = straight(1 to 5 toList)(_)
  val largestraight = straight(2 to 6 toList)(_)
  
  val fullhouse = (l: List[Int]) => if(twopair(l)>0 && threekind(l)>0) l.sum else 0
  
  val yahtzee = (l: List[Int]) => l.map(x => x/l(0)).sum match {
    case 5 => 50
    case _ => 0
  }
  
  val chance = (l: List[Int]) => l.sum
}