object StringFormatter{
  def toUpper(input:String):String={
    input.toUpperCase
  }
  def toLower(input:String):String={
    input.toLowerCase
  }
  def formatNames(name:String)(formatFunc:String=>String):String ={
  formatFunc(name)
  }
  
  def main(args:Array[String]): Unit={
    val names = List("Nethmi","Chathura","Malki","Nadun")

    val formattedNames = List(
      formatNames("Nethmi")(toUpper),
      formatNames("Chathura")(name=> name.substring(0 ,3).toUpperCase + name.substring(2)),
      formatNames("Malki")(toLower),
      formatNames("Nadun")(name=>name.init + name.last.toUpper)
    )

    formattedNames.foreach(println)
    }
  }
