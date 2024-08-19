object NameFormatter {

  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String)(formatFunction: String => String): String = {
    formatFunction(name)
  }

  def main(args: Array[String]): Unit = {
    val benny = formatNames("Benny")(toUpper)
    val niroshan = formatNames("Niroshan")(name => name.take(2).toUpperCase + name.drop(2).toLowerCase)
    val saman = formatNames("Saman")(toLower)
    val kumara = formatNames("Kumara")(name => name.take(1).toUpperCase + name.drop(1).dropRight(1).toLowerCase + name.takeRight(1).toUpperCase)

    println(benny)      
    println(niroshan)   
    println(saman)     
    println(kumara)    
  }
}
