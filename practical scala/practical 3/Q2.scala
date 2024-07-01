import scala.io.StdIn.readLine

object FilterStrings{
  def filterLongStrings(strings:List[String]):List[String]={
    strings.filter(_.length > 5)
  }

  def main(args:Array[String]):Unit={
    print("Enter a list of strings separated by commas:")
    val input=readLine()
    val inputStrings = input.split(",").map(_.trim).toList
    val filteredStrings = filterLongStrings(inputStrings)
    println(s"Original list: $inputStrings")
    println(s"Filtered list: $filteredStrings")
  }
}


