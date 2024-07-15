import scala.io.StdIn.readLine

object InventoryManagementSystem {

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    printProductList(productList)
    println(s"Total number of products: ${getTotalProducts(productList)}")
  }

  def getProductList(): List[String] = {
    def getProductNames(acc: List[String]): List[String] = {
      val productName = readLine("Enter product name (or type 'done' to finish): ")
      if (productName.toLowerCase == "done") acc
      else getProductNames(acc :+ productName)
    }
    getProductNames(List())
  }

  def printProductList(productList: List[String]): Unit = {
    productList.zipWithIndex.foreach { case (product, index) =>
      println(s"${index + 1}. $product")
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.length
  }
}
