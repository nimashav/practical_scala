import scala.io.StdIn._

object InventorySystem {
  type Product = (Int, String, Int, Double)

  def main(args: Array[String]): Unit = {

    val inventory1: Map[Int, Product] = Map(
      100 -> (100, "Product A", 10, 30.0),
      101 -> (101, "Product B", 5, 50.0),
      102 -> (102, "Product C", 15, 10.0)
    )

    val inventory2: Map[Int, Product] = Map(
      100 -> (100, "Product A", 4, 35.0),
      102 -> (102, "Product C", 8, 15.0)
    )

    var continue = true

    while (continue) {
      println(
        """
          |Choose an operation:
          |1. Retrieve all product names from inventory1
          |2. Calculate the total value of all products in inventory1
          |3. Check if inventory1 is empty
          |4. Merge inventory1 and inventory2
          |5. Check if a product with a specific ID exists and print its details
          |6. Exit
        """.stripMargin)
      val choice = readInt()

      choice match {
        case 1 =>
          val productNames: Iterable[String] = inventory1.values.map(_._2)
          println("Product names in inventory1:")
          productNames.foreach(println)

        case 2 =>
          val totalValue: Double = inventory1.values.map(p => p._3 * p._4).sum
          println(s"Total value of all products in inventory1: $$${totalValue}")

        case 3 =>
          val isInventory1Empty: Boolean = inventory1.isEmpty
          println(s"Is inventory1 empty? $isInventory1Empty")

        case 4 =>
          val mergedInventory: Map[Int, Product] = (inventory1.keys ++ inventory2.keys).map { id =>
            val product1 = inventory1.get(id)
            val product2 = inventory2.get(id)

            val mergedProduct = (product1, product2) match {
              case (Some(p1), Some(p2)) =>
                (p1._1, p1._2, p1._3 + p2._3, math.max(p1._4, p2._4))
              case (Some(p), None) => p
              case (None, Some(p)) => p
              case (None, None) => throw new Exception("This should never happen")
            }
            id -> mergedProduct
          }.toMap

          println("Merged inventory:")
          mergedInventory.values.foreach { case (id, name, quantity, price) =>
            println(s"ID: $id, Name: $name, Quantity: $quantity, Price: $price")
          }

        case 5 =>
          println("Enter the product ID to check:")
          val productIdToCheck = readInt()
          inventory1.get(productIdToCheck) match {
            case Some(product) => println(s"Product with ID $productIdToCheck exists: $product")
            case None => println(s"Product with ID $productIdToCheck does not exist in inventory1")
          }

        case 6 =>
          continue = false

        case _ =>
          println("Invalid choice. Please select a valid operation.")
      }
    }

    println("Exiting the inventory system.")
  }
}
