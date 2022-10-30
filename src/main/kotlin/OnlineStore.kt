class OnlineStore(private var stock:ProductsStock) {
   //private var stock:ProductsStock = ProductsStock()

    fun showAllProducts(): String {
        var productList = ""
        for(product in stock.showProducts()) {
            productList += " ${product.productImg}\n ${product.productName}\n ${product.productAttribute}\n " +
                    "${product.productDescription}\n \uD83D\uDCB0 Price: ${product.productPrice} €\n Reference: ${product.productReference}\n \n"
        }
        return productList
    }

    private fun showOneProductInformation(product: Product?) {
        if (product != null) {
            println(product.productImg)
            println(product.productName)
            println(product.productDescription)
            println(product.longDescription)
            println(product.productAttribute)
            println("\uD83D\uDCB0 Price: ${product.productPrice}€")
            println("Reference: ${product.productReference}\n")
        }
    }

    private fun askForProductLowerThan(): Product? {
        println("Enter a product's reference:")
        val reference = readln()
        return stock.findOneProductByReference(reference)
    }

    fun askForNextStep() {
        println("""
            What would you like to do next?
            1. Add product to cart..
            2. Keep browsing..
        """.trimMargin())
        when (readln()) {
            "1" -> false
            "2" -> {
                getProductsLowerThan()
                nextStep()
            }
            else -> askForNextStep()
        }
    }

    private fun getProductsLowerThan(): Double {
        println("Browse products with prices lower than:")
        return readln().toDouble()
    }

    fun showProductLowerThan() {
        val products = stock.filterByPrice(getProductsLowerThan())
        for (product in products) {
            showOneProductInformation(product)
        }
    }

    fun nextStep() {
        println("""
            What would you like to do next?:
            2. Keep browsing the catalog
            3. See a product's details 
        """.trimMargin())
        when (readln()) {
            "2" -> {
                showProductLowerThan()
                //nextStep()
            }
            "3" -> {
                showOneProductInformation(askForProductLowerThan())
                //askForNextStep()
            }
        }
    }
}