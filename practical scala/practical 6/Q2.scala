import scala.io.StdIn

object StudentRecordManager {
  
  def calculatePercentageAndGrade(marks: Int, totalMarks: Int): (Double, Char) = {
    val percentage = (marks.toDouble / totalMarks) * 100
    val grade = percentage match {
      case p if p >= 90 => 'A'
      case p if p >= 75 => 'B'
      case p if p >= 50 => 'C'
      case _            => 'D'
    }
    (percentage, grade)
  }

  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.trim.isEmpty) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || totalMarks <= 0 || marks > totalMarks) {
      (false, Some("Marks must be a positive integer and cannot exceed total possible marks."))
    } else {
      (true, None)
    }
  }

  def getStudentInfo: (String, Int, Int, Double, Char) = {
    println("Enter student's name:")
    val name = StdIn.readLine()

    println("Enter marks obtained:")
    val marks = StdIn.readInt()

    println("Enter total possible marks:")
    val totalMarks = StdIn.readInt()

    val (percentage, grade) = calculatePercentageAndGrade(marks, totalMarks)
    (name, marks, totalMarks, percentage, grade)
  }

  def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = record
    println(s"Student Name: $name")
    println(s"Marks Obtained: $marks")
    println(s"Total Possible Marks: $totalMarks")
    println(f"Percentage: $percentage%.2f%%")
    println(s"Grade: $grade")
  }

  def getStudentInfoWithRetry: (String, Int, Int, Double, Char) = {
    var valid = false
    var studentInfo: (String, Int, Int, Double, Char) = ("", 0, 0, 0.0, ' ')

    while (!valid) {
      studentInfo = getStudentInfo
      val (name, marks, totalMarks, percentage, grade) = studentInfo
      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
      if (isValid) {
        valid = true
      } else {
        println(s"Error: ${errorMessage.get}")
      }
    }
    studentInfo
  }

  def main(args: Array[String]): Unit = {
    println("Welcome to the Student Record Manager")
    
    var continue = true
    while (continue) {
      val studentRecord = getStudentInfoWithRetry
      printStudentRecord(studentRecord)
      
      println("Do you want to add another student record? (yes/no)")
      val response = StdIn.readLine().toLowerCase
      if (response != "yes") {
        continue = false
      }
    }
    println("Thank you for using the Student Record Manager!")
  }
}
