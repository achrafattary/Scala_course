package lectures.part1_thebasics
/*
this is elementary but i prefer to start from the start
as the reason on why i started this course is a luck that
i felt while practicing spark
*/


object ValueVariableTypes extends  App {
  var x: Int = 5
  x= 7
  // var are mutable

  val y : Int = 6
  // vals are immutable
 // in functional programing we prefer using vals
  val z = 45
  // the compiler can infer the types

  val aString : String = "This is a string"

  val long : Long = 123456789123L
  // long syntax , the L is not a part of the number only present
  // in the creation of the variable
  // same for float
  val afloat : Float = 1.123F
  println(long)
  println(afloat)

}
