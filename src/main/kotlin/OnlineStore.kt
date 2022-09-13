class OnlineStore {
   private var stock:ProductsStock = ProductsStock()

    fun showAllProducts(): String {
        var productList = ""
        for(product in stock.showProducts()) {
            productList += " ${product.productImg}\n ${product.productName}\n ${product.productAttribute}\n " +
                    "${product.productDescription}\n \uD83D\uDCB0 Price: ${product.productPrice} €\n Reference: ${product.productReference}\n \n"
        }
        return productList
    }

}