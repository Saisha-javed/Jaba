
class demoClass2(a:Int=99,b:Double=5.5,c:String="scala")
{
  val x = a    // var <- can change to value of variable, val<- can not change
  val y = b
  val z=c
  def addNumber() = {
    x + y
  }

  println(s"x = ${x} and y = ${y}")

  val z1 = addNumber()
  println(s"z1 = ${z1}")
  def this() = {
    this(2,4.5,"tt")
    println("zero param Aux Cons")
  }
  def this(a:Int) = {
    this(a,4.5,"tt")
    println("One param Aux Cons")
  }
  def this(a:Int,b:Int) = {
    this(a,b,"tt")
    println("two param Aux Cons")
  }
  def this(c:String) = {
    this(1,2,c)
    println("111111111 param Aux Cons")
  }
}


object AuxCon
{
  def main(args: Array[String]): Unit = {
    println("Hello World")


    val demoObject11111 = new demoClass2(5,5.5) // Creating a object - instance of class - Constructor: Will execute every thing in class
    demoObject11111.addNumber()
    val v2 = new demoClass2()
    v2.addNumber()
    val v21 = new demoClass2(1)
    v21.addNumber()


    val v4 = new demoClass2(1,2)
    v4.addNumber()

    val v41 = new demoClass2("Jaba")
    v41.addNumber()
  }
}
