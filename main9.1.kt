import MolochnieIzdelia
import Moloko
import Sir
import Students
import Math
import Chem
fun main()
{
    val a:Moloko = Moloko("Банановое молоко")
    a.Input(a)
    a.Output(a)
    a.Buy(a)
    val b:Sir = Sir("Президент")
    b.Input(b)
    b.Output(b)
    b.Buy(b)
    val c:Math = Math("Вадим")
    c.Input(c)
    c.Output(c)
    var h = c.AcceptExam(c)
    if(h)
    {
        println("Экзамен сдан")
    }
    else
    {
        println("Экзамен не сдан")
    }
    var d:Chem = Chem("Петр")
    d.Input(d)
    d.Output(d)
    var m = d.AcceptExam(d)
    if (m)
    {
        println("Экзамен сдан")
    }
    else
    {
        println("Экзамен не сдан")
    }
}