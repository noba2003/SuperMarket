class Supermarket  {

    fun displayProduct(product: Product) {
        println(product.getProductInfo())
        println(product.getPrice()-product.getDiscountedPrice())
    }

}