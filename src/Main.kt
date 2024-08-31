//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Comment Generator by ChatGPT
    // Create an instance of Grocery (representing an orange product)
    val orange: Product = Grocery()
    orange.setName(GroceryEnum.Orange.toString())
    orange.setPrice(20.0)
    orange.setQuantity(2000)
    println(orange.getProductInfo()) // Display the product information
    println(orange.getDiscountedPrice()) // Display the discounted price for the product
    println("----------")

// Create an instance of Electronics (representing a laptop product)
    val product2: Product = Electronics()
    product2.setName(ElectronicsEnum.LAPTOP.toString()) // Set the name of the product to "LAPTOP"
    product2.setPrice(15.0)
    product2.setQuantity(30)
    println(product2.getProductInfo()) // Display the product information
    println(product2.getDiscountedPrice()) // Display the discounted price for the product
    println("----------")

// Create an instance of Supermarket to display products
    val supermarket = Supermarket()
    supermarket.displayProduct(product2) // Display information about the laptop product in the supermarket

    println("----------")
    supermarket.displayProduct(orange) // Display information about the orange product in the supermarket
    println("----------")

// Create an instance of a generic supermarket
    val superMarketWithGeneric = SuperMarketWithGeneric<Product>()
    superMarketWithGeneric.displayProductWithGenerics(orange) // Display information about the orange product using generics
    println("----------")

    superMarketWithGeneric.displayProductWithGenerics(product2) // Display information about the laptop product using generics


}