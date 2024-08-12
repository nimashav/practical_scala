import scala.io.StdIn.readLine

object CaesarCiper {

  def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if(char.isLetter) {
        val shiftAmount = if (char.isUpper) 'A' else 'a'
        ((char + shift - shiftAmount) % 26 + shiftAmount).toChar
      } else {
        char
      }
    }
  }
    def decrypt(text: String, shift: Int): String = {
      encrypt(text,26 - shift)
    }
    def cipher(text: String,shift:Int,operation: (String,Int) => String): String ={
      operation(text, shift)
    }

    def main(args: Array[String]): Unit = {
      val text = readLine("Enter the text:")
      val shift = readLine("Enter the shift value: ").toInt
      val action = readLine("Do you want to (E)ncrypt or (D)ecrypt? ").toUpperCase
      val result = action match {
        case "E" => cipher(text,shift,encrypt)
        case "D" => cipher(text,shift,decrypt)
        case _ => "Invalid option"
      }

      println(s"Result: $result")
    }
}
