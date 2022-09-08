class OnlineStore {
   private var stock:ProductsStock = ProductsStock()

    fun showAllProducts(): MutableList<Product> {
        for(product in stock.showProducts()) {
        }
        return stock.showProducts()
    }
}