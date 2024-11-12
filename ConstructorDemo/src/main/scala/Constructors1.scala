
class demoClass11(a:Int,b:Int,c:String)
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
}


 object Constructors1
   {
     def main(args: Array[String]): Unit = {
       println("Hello World")

       val demoObject1 = new demoClass11(3, 4, "jsbs") // Creating a object - instance of class - Constructor: Will execute every thing in class

     }
   }