open class Students(var name:String)
{
    var lastname:String = "un"
    var middlename:String = "un"
    var age:Int = 0
    var subject:String = "un"
    var DateOfEx: String = "un"

    fun Input(a:Students)
    {
        println("Введите фамилию студента")
        a.lastname = readLine().toString()
        println("Введите отчество студента")
        a.middlename = readLine().toString()
        println("Введите возраст студента")
        a.age = readLine()!!.toInt()
        println("Введите предмет экзамена")
        a.subject = readLine().toString()
        println("Введите дату")
        a.DateOfEx = readLine().toString()

    }
    fun Output(a: Students)
    {
        println("Имя студента - ${a.name}")
        println("Фамилия студента - ${a.lastname}")
        println("Отчество студента - ${a.middlename}")
        println("Возраст студента - ${a.age}")
        println("Предмет экзамена - ${a.subject}")
        println("Дата экзамена - ${a.DateOfEx}")

    }
}