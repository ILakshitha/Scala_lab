object InvetoryManagement{
    def displayInvetory(itemName:Array[String],itemQuantities:Array[Int])={
        println("Inventory:");

        for( i<- itemName.length){
            println(s"${itemName(i)}: ${itemQuantities(i)}")
        }
    }

    def restockitem(itemName:Array[String], itemQ:Array[Int],itemname:String,quantity:Int):Unit={
        val index = itemName.indexOf(itemname)
       
        if(index== -1){
            println(s"Item `$itemName`does not exist in the inventory.")
        } else {
      itemQ(index) += quantity
      println(s"Restocked $quantity units of '$itemName'. New quantity: ${itemQ(index)}")
    }
    }

    def sellitem(itemName:Array[String], itemQuantities:Array[Int],itemname:String,quantity:Int):Unit={
        val index= itemName.indexOf(itemname)
         if (index == -1) {
      println(s"Item '$itemName' does not exist in the inventory.")
    } else if (itemQuantities(index) < quantity) {
      println(s"Not enough quantity of '$itemName' to sell. Available: ${itemQuantities(index)}, Requested: $quantity")
    } else {
      itemQuantities(index) -= quantity
      println(s"Sold $quantity units of '$itemName'. Remaining quantity: ${itemQuantities(index)}")
    }

    }

    def main(args:Array[String]): Unit ={
        val itemN = Array("Apple", "Oranges", "Bananas","Graps")
        val itemQ = Array(10, 20, 15, 5)

        println("Initial Inventory:")
        displayInvetory(itemN,itemQ)

        println("Restocking Oranges with 10 units:")
        restockitem(itemN, itemQ, "Oranges", 10)

        println("Restocking Mangoes with 5 units:")
        restockitem(itemN, itemQ, "Mangoes", 5)

        println("Updated Inventory:")
        displayInvetory(itemN, itemQ)

         println("Selling 5 Oranges:")
         sellitem(itemN, itemQ, "Oranges", 5)

         println("Selling 7 Grapes:")
         sellitem(itemN, itemQ, "Grapes", 7)

         println("Selling 10 Mangoes:")
         sellitem(itemN, itemQ, "Mangoes", 10)

         println("Updated Inventory:")
         displayInvetory(itemN, itemQ)
    }
}