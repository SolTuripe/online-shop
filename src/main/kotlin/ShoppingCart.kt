class ShoppingCart {
    var shoppingProducts: MutableList<Product> = ArrayList()
    private var total = 0.0

    fun addProduct(product: Product) {
        shoppingProducts.add(product)
    }

}