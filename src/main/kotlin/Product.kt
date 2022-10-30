class Product(id: Int, img: String, name: String, attribute: String, description: String, longDescription: String, price: Double, reference: String) {

    private var productId = id
    var productImg = img
    private set
    var productName = name
    private set
    var productAttribute = attribute
    private set
    var productDescription = description
    private set
    var longDescription = longDescription
    private set
    var productPrice = price
    private set
    var productReference = reference
    private set
}