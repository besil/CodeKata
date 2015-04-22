package fizzbuzz

abstract class Rule {
  def apply(n: Int): String
}

class FizzRule extends Rule {
  def apply(n: Int): String = if(n%3==0) "fizz" else ""
}

class BuzzRule extends Rule {
  def apply(n: Int): String = if(n%5==0) "buzz" else ""
}

object RuleSet {
  def rules = List( new FizzRule(), new BuzzRule() )
}

class FizzBuzz() {
  def fizzBuzz(n: Int): String = {
    var res: String = ( for(r<-RuleSet.rules) yield(r(n)) ).reduce(_ + _)
    if(res.equals("")) n.toString() else res
  }
}


