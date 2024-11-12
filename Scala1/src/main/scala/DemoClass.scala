object DemoClass {
  def main(A:Array[String]):Unit={
 var hyundai= new Car1()
 println(hyundai.cost(150000))
    var tata = new Car1()
    println(tata.cost(150000,0.15))

  }

}
class Car1
{
  var topClass=0
  private var roadTax=0.1
  var total_cost=0.0
  var bcost=0
  protected var var1=1
  def cost(bcost1:Int,roadtax:Double=0.1):Double  = {
    roadTax=roadtax
    bcost=bcost1
    total_cost=bcost*roadTax+bcost
    return total_cost

  }}
