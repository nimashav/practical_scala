import scala.io.StdIn.readLine

object StringReversal{
  def reverseString(input:String):String={
    if(input.isEmpty){
      ""
    }
    else{
      reverseString(input.tail)+input.head
    }
  }

  def main(args:Array[String]):Unit={
    println("Enter a string to reverse:")
    val originalString=readLine()
    val reversedString=reverseString(originalString)
    println(s"Original string: $originalString")
    println(s"Reversed string: $reversedString")
  }
}

