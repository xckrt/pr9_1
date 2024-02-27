open class MolochnieIzdelia(var name:String)
{
    var weight: Int = 0
    var fatness: Int = 0
    var manufacturer: String = "un"
    var Cost: Int = 0
    fun Input(a: MolochnieIzdelia)
    {
        println("Вес продукта:")
        a.weight = readLine()!!.toInt()
        println("Жирность продукта:")
        a.fatness = readLine()!!.toInt()
        println("Производитель продукта:")
        a.manufacturer = readLine().toString()
        println("Цена продукта:")
        a.Cost = readLine()!!.toInt()
    }
    fun Output(a:MolochnieIzdelia)
    {
        println("Название продукта:${a.name}")
        println("Вес продукта:${a.weight}")
        println("Жирность продукта:${a.fatness}")
        println("Производитель продукта:${a.manufacturer}")
        println("Цена продукта:${a.Cost}")
    }
}
