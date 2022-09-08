class OnlineStore {
   private var stock:ProductsStock = ProductsStock()

    fun showAllProducts(): String {
        var productList = ""
        for(product in stock.showProducts()) {
            productList += "${product.productImg}\n ${product.productName}\n ${product.productAttribute}\n " +
                    "${product.productDescription}\n ${product.productPrice} €\n ${product.productReference}\n"
        }
        return productList
    }
}