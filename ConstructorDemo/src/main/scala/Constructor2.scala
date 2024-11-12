class demoClass111(a:Int=99,b:Double=5.5,c:String="scala")
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
    }
}


object Constructors2
{
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val demoObject1= new demoClass111(3, 4.6, "jsbs") // Creating a object - instance of class - Constructor: Will execute every thing in class
    demoObject1.addNumber()
    val demoObject11 = new demoClass111() // Creating a object - instance of class - Constructor: Will execute every thing in class
    demoObject11.addNumber()
    val demoObject111 = new demoClass111(a=5) // Creating a object - instance of class - Constructor: Will execute every thing in class
    demoObject111.addNumber()
    val demoObject1111 = new demoClass111(50) // Creating a object - instance of class - Constructor: Will execute every thing in class
    demoObject1111.addNumber()
    val demoObject11111 = new demoClass111(5,5.5) // Creating a object - instance of class - Constructor: Will execute every thing in class
    val v2 = new demoClass111()
    v2.addNumber()
  }
}