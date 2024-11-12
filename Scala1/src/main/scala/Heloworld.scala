object Heloworld
{
  def main(A:Array[String]):Unit=
    {
      println("Hello world")

var a1= new Heloworld1()
a1.main1()
println(a1.add2(3,2))
}
}

class Heloworld1 {
  def main1(): Unit = {
    println("Hello world111")
  }

  def add2(a: Int, b: Int): Int = a + b
}
