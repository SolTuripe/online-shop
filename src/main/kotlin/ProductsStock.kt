import java.lang.RuntimeException

class ProductsStock {
    private var productsStock: MutableList<Product> = mutableListOf(
        Product(
        1,
        "\uD83D\uDCFA",
        "Television",
        "Glamorous panoramic television, 13 inches",
        "With this panoramic television, your friday nights will be boring no more.",
            "The screen is composed of 14 million pixels.\n Thanks to its low energy consumption " +
                    "design, your bills will stay low",
        300.99,
        "W2C"
    ),
    Product(
        2,
        "\uD83C\uDFB9",
        "Keyboard",
        "Untuned musical keyboard, 4 octaves",
        "Tired of your noisy neighbouring? Play this untuned musical keyboard for two hours at home and " +
                "your neighbour will be ready to move to a building far away from you",
        "88-note keyboard with large keys and standard spacing.\n Compact and lightweight(7kg) to play " +
                "and store anywhere",
        1003.00,
    "X4A"
    ),
    Product(
        3,
        "\uD83D\uDCF7",
        "Camera",
        "NBD digital camera",
        "Ultra-Clear screen YouTube Vlogging, with wide angle lens and 16x digital zoom",
        "We have equipped the camera with a professional detachable 32mm wide angle lens with macro " +
                "lens, so the camera is perfect for easily capturing wide horizons and macro lenses capture the " +
                "diversity of the small world",
        196.00,
        "NBD4"
    ))

    fun showProducts(): MutableList<Product> {
        return productsStock
    }

    fun findOneProductByReference(reference: String): Product? {
        try {
            for(product in productsStock) {
                if(product.productReference == reference) {
                    return product
                }
            }
        }
        catch (e: RuntimeException) {
            println("Product not found")
        }
        finally {
            println("Product not found")
        }
        return null
    }

    /*fun showQuantityOfProductsInStock(reference: String): Int {
        var quantity: Int = 0
        for(product in productsStock) {
            if(product.productReference == reference) quantity ++
        }
        return quantity
    }*/

    fun filterByPrice(price: Double): List<Product> {
        return productsStock.filter { it.productPrice <= price }
    }
}