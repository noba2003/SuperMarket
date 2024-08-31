abstract class Product {

    private var name : String =""
    private var quantity : Int =0
    private var price : Double =0.0
    fun setName(name: String) {
        this.name = name
    }
    fun getName() : String {return name}
    fun setQuantity(quantity: Int) {
        this.quantity = quantity
    }
    fun getQuantity() : Int {return quantity}
    fun setPrice(price: Double) {
        this.price = price
    }
    fun getPrice() : Double {return price}

    // Abstract method to show ProductInfo

    abstract fun getProductInfo() :String

    // Abstract method to calculate the discounted price

    abstract fun getDiscountedPrice() :Double

    override fun toString(): String {
        return "Product(name='$name', quantity=$quantity, price=$price)"
    }

}