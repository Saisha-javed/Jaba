import scala.util.control.Breaks

object ForLoop extends App {

  println("for looop <-")
  for (i <- 1 to 10) {
    println(s"value of i is $i")
  }

  println("untill")
  for (i <- 1 until 10) {
    println(s"untill value of i is $i")
  }
  println("nested loop")
  for (i <- 1 to 10) {
    for (j <- 1 to i) {
      print(j, i)
    }
    println("\n")
    for (i <- 1 to 10; j <- 1 to i) {
      print(s"$j $i \n")
    }
  }
  var list1 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  for (i <- list1) {
    println(i)
  }
  for (i <- list1 if i%2==0)
  //divisble by 2
    {
    println(i)
  }
  for (i <- list1 if i%2==0;if i!=4)
    //divisble by 2
  {
    println(i)
  }
var yiedFor = for(i <- list1 if(i%2==0))  yield i
  print("Yield for demo \t ")
  for(i<- yiedFor) {
    print(s"$i \t")
    println(yiedFor)
  }
  val boject = new Breaks;
  boject.breakable{

  for (i <- list1 if i%2==0)
    //divisble by 2
  {
    println(i)
    if(i==4) {
      println("Breaking at 4")
      boject.break
    }
  }
  }
}//oj

