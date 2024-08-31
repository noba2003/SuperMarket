class SuperMarketWithGeneric<T>
  {
    // Generic function
    fun displayProductWithGenerics(product:T) {
        when(product) {
            is Product ->{
                println(product.getProductInfo() + "from method Generic")
                println(product.getPrice()-product.getDiscountedPrice())
            } else->{
            println("Not Found")
        }

        }
    }


}