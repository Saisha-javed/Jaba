object Function_Demo
{
  def main(A:Array[String]):Unit=
  {
    println("Hello world")

    var a1= new Heloworld11()
    a1.main1()
    println(a1.add2(3,2))
    println(a1.add211(3,2))
    println(a1.add21(3,2))
  }// main
} //obj

class Heloworld11 {
  def main1(): Unit = {
    println("Hello world111")
  }//main1
def add2(a:Int,b:Int):Int = a+b
  def add21(a:Int,b:Int):Int =
    {
      var z=a+b
      z
    }

def add211(a:Int,b:Int):Int =
{
  var z=a+b
  return z
}
}