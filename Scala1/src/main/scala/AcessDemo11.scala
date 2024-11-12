object AcessDemo {
    def main(A:Array[String]):Unit={
      var hyundai= new Car()
      println(hyundai.cost(150000))
      var tata = new Car()
      println(tata.cost(150000,0.15))

      println(tata.Vgst())
      println(tata.Gst())
      println(tata.Vgst())

    }

  }
  class Car
  {
    var topClass=0
    private var roadTax=0.1
    var total_cost=0.0
    var bcost=0
    protected var var1=1
    private var gst=100
    def Vgst():Int=
    {gst}
    def Gst(): Int = {
      gst=33
      gst

    }

    def cost(bcost1:Int,roadtax:Double=0.1):Double  = {
      roadTax=roadtax
      bcost=bcost1
      total_cost=bcost*roadTax+bcost
      return total_cost

    }}


