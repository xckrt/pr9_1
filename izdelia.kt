import MolochnieIzdelia
class Moloko(var empName:String):MolochnieIzdelia(empName)
{
fun Buy(moloko: Moloko)
{
    println("Вы хотите купить молоко?")
    var b = readLine()!!.toInt()
    if (b==1)
    {
        println("Вы купили молоко ${moloko.name} за ${moloko.Cost} рублей")

    }
}


}
class Sir(var empName: String):MolochnieIzdelia(empName)
{
    fun Buy(sir:Sir)
    {
        println("Вы хотите купить сыр?")
        var b = readLine()!!.toInt()
        if (b==1)
        {
            println("Вы купили сыр ${sir.name} за ${sir.Cost} рублей")

        }
    }
}

