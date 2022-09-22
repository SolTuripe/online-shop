import java.lang.IllegalArgumentException
import java.lang.RuntimeException

class ProductsStock {
    private var productsStock: MutableList<Product> = mutableListOf(
        Product(
        1,
        "\uD83D\uDCFA",
        "Television",
        "Glamorous panoramic television, 13 inches",
        "With this panoramic television, your friday nights will be boring no mor",
        300.99,
        "W2C"
    ),
    Product(
        2,
        "\uD83C\uDFB9",
        "piano",
        "Untuned musical keyboard, 4 octaves",
        "Tired of your noisy neighbouring? Play this untuned musical keyboard for two hours at home and " +
                "your neighbour will be ready to move to a building far away from you",
        1003.00,
    "X4A"
    ))

    fun showProducts(): MutableList<Product> {
        return productsStock
    }

    fun findOneProductByReference(reference: String?): Product {
        for (product in productsStock) {
            if (product.productReference == reference) {
                return product
            }
        }
        throw RuntimeException ("This product doesn't exist")
    }

    fun showQuantityOfProductsInStock(reference: String): Int {
        var quantity: Int = 0
        for(product in productsStock) {
            if(product.productReference == reference) quantity ++
        }
        return quantity
    }

    fun filterByPrice(price: Double): List<Product> {
        return productsStock.filter { it.productPrice < price }
    }
}