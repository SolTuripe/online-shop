fun main() {
    val stock = ProductsStock()
    val store = OnlineStore(stock)

    println(store.showAllProducts())
    println(store.askForNextStep())
    println(store.showProductLowerThan())
}