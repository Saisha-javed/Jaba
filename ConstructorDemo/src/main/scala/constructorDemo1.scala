// Program no 2: Parametrized Constructor (Primary constructor)

class demoClass1(val a:Int, val b:Double, val c:String){
  val x = a       //var(can change the value) and val (can not change the value):
  var y = b       // retrieve(GET) and change(SET) the content of y because it is a var >>> INTERNALLY SCALA CREATES 2 METHODS - GETTER AND SETTER
  val z = c       // ONLY retrieve(GET) the content of y because it is a val () >>> INTERNALLY SCALA CREATES ONLY 1 METHOD - GETTER

  def addNumber() = {
    x + y
  }

  println(s"x = ${x} and y = ${y} and z = ${z}")

}


object constructorDemo1 {
  def main(args: Array[String]): Unit = {
    val demoObject1 = new demoClass1(5,7.2,"Hello World!")  //Object: Instance of class -> Calls Constructor
    val demoObject2 = new demoClass1(6,8.3,"Hello World Again!")  //Object: Instance of class -> Calls Constructor

//    demoObject1.x =3   // Can not change(only retrieve) the content of x as it was defined as val in the class and hence it only has getter method
    demoObject1.y = 7.22222 // can retrieve  and change the content of y as it was defined as var inthe class and hence it has getter and setter method

    println(demoObject1.x, demoObject1.y,demoObject1.z)
    var result = demoObject1.addNumber()
    println(s"result = ${result}")

    println(demoObject2.x, demoObject2.y,demoObject2.z)
    result = demoObject2.addNumber()
    println(s"result = ${result}")

  }
}
