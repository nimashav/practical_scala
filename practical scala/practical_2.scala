//Question 1

object Question1 extends App {
  var k = 2
  var i = 2
  var j = 2
  var m = 5
  var n = 5
  var f = 12.0f
  var g = 4.0f
  var c = 'X'


  print("\n\n\n")
  println(s"Result of a : ${k+ 12*m}")
  println(s"Result of b : ${m/j}")
  println(s"Result of c : ${n%j}")
  println(s"Result of d : ${m/j*j}")
  println(s"Result of e : ${f + 10*5 +g}")
  i+=1
  println(s"Result of f : ${i * n}")
 
}

//Question 2

object Question2 extends App{
var a = 2
var b = 3
var c = 4
var d = 5
var k = 4.3f
var g = 5

print("\n")
//a)
b-=1
println(b * a + c * d)
d-=1

//b)
println(a) 
a += 1

//c)
println (-2 * ( g - k ) +c)

//d)
println (c)
c += 1

//e)
c += 1
c = c * a
println(c)
a += 1

}


//Question 3
object Question3 extends App{

def NormalWorking(hrs:Int):Double={
  hrs*250}

def OT(hrs:Int):Double={
  hrs*85
}

def Income(h1:Int,h2:Int):Double={
  NormalWorking(h1)+OT(h2)
}

def Tax(Income:Double):Double={
  Income*0.12
}

def TakeHome(h1:Int,h2:Int):Double={
  Income(h1,h2)-Tax(Income(h1,h2))
}

val salary=TakeHome(40,30)

println(s"Take Home Salary: ${salary}")
}

//Question 4

object Question4 extends App{

def attendees(TicketPrice:Int):Int ={
  120+(15-TicketPrice)/5*20}

def Revenue(TicketPrice:Int):Int={
  attendees(TicketPrice)*TicketPrice}

def cost(TicketPrice:Int):Int={
  500+3*attendees(TicketPrice)}

def profit(TicketPrice:Int):Int={
  Revenue(TicketPrice)-cost(TicketPrice)}


}


