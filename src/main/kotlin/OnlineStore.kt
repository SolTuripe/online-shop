class OnlineStore {
   var stock = ProductsStock()

    fun showAllProducts(): MutableList<Product> {
        return stock.productsStock
    }
}