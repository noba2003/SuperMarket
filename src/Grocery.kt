class Grocery : Product() {
    override fun getProductInfo(): String {
       return super.toString()
    }

    override fun getDiscountedPrice(): Double {
        return super.getPrice()*0.05
    }
}