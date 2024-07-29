object InventoryManagement {

  // Type alias for product details
  type ProductDetails = (String, Int, Double) // (name, quantity, price)

  // Sample inventories
  val inventory1: Map[Int, ProductDetails] = Map(
    101 -> ("Product A", 10, 99.99),
    102 -> ("Product B", 5, 149.99),
    103 -> ("Product C", 20, 79.99)
  )

  val inventory2: Map[Int, ProductDetails] = Map(
    102 -> ("Product B", 10, 139.99),
    104 -> ("Product D", 15, 199.99)
  )

  // I. Retrieve all product names from inventory1
  def getAllProductNames(inventory: Map[Int, ProductDetails]): List[String] = {
    inventory.values.map(_._1).toList
  }

  // II. Calculate the total value of all products in inventory1
  def calculateTotalValue(inventory: Map[Int, ProductDetails]): Double = {
    inventory.values.map { case (_, quantity, price) => quantity * price }.sum
  }

  // III. Check if inventory1 is empty
  def isInventoryEmpty(inventory: Map[Int, ProductDetails]): Boolean = {
    inventory.isEmpty
  }

  // IV. Merge inventory1 and inventory2, updating quantities and retaining the highest price
  def mergeInventories(inv1: Map[Int, ProductDetails], inv2: Map[Int, ProductDetails]): Map[Int, ProductDetails] = {
    inv2.foldLeft(inv1) { case (acc, (id, (name, quantity, price))) =>
      acc.get(id) match {
        case Some((existingName, existingQuantity, existingPrice)) =>
          acc.updated(id, (existingName, existingQuantity + quantity, math.max(existingPrice, price)))
        case None =>
          acc.updated(id, (name, quantity, price))
      }
    }
  }

  // V. Check if a product with a specific ID (e.g., 102) exists and print its details
  def checkAndPrintProductDetails(inventory: Map[Int, ProductDetails], productId: Int): Unit = {
    inventory.get(productId) match {
      case Some((name, quantity, price)) =>
        println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
      case None =>
        println(s"Product ID: $productId does not exist in the inventory.")
    }
  }

  // Main function to demonstrate the operations
  def main(args: Array[String]): Unit = {
    println("All product names in inventory1: " + getAllProductNames(inventory1))
    println("Total value of all products in inventory1: $" + calculateTotalValue(inventory1))
    println("Is inventory1 empty? " + isInventoryEmpty(inventory1))

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("Merged inventory: " + mergedInventory)

    checkAndPrintProductDetails(inventory1, 102)
  }
}

InventoryManagement.main(Array())
