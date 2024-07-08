object InventoryManagement{

  var ItemNames:Array[String]=Array("Youghurt","Biscuits","Chocolate","Ice cream")
  var ItemQuantities:Array[Int]=Array(10,20,15,7)

  def displayInventory():Unit={
    println("\nInventory :\n")
    for(i <- ItemNames.indices){
      println(s"${ItemNames(i)}: ${ItemQuantities(i)}")
    }
  }

  def restockItem(ItemName:String,Quantity:Int): Unit={
    val index=ItemNames.indexOf(ItemName)
    if(index >= 0){
      ItemQuantities(index) += Quantity
      println(s"\nRestocked $Quantity of $ItemName. New quantity: ${ItemQuantities(index)}")
    }
    else{
      println(s"Item '$ItemName' does not exist in the inventory.")
    }
  }

  def sellItem(ItemName:String,Quantity:Int): Unit={
    val index=ItemNames.indexOf(ItemName)
    if(index >= 0){
      if(ItemQuantities(index) >= Quantity){
        ItemQuantities(index) -= Quantity
        println(s"Sold $Quantity of $ItemName.Remaining quantity: ${ItemQuantities(index)}")
      }
      else{
        println(s"Not enough $ItemName in stock to sell $Quantity. Current quantity: ${ItemQuantities(index)}")
      }
    }
      else{
        println(s"Item '$ItemName' does not exist in the inventory.")
      }
  }

  def main(args:Array[String]):Unit ={
    displayInventory()
    restockItem("Biscuits", 8)
    sellItem("Chocolate",3)
    sellItem("Biscuits",5)
    displayInventory()
  }
}