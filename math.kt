import Students

class Math(var empname:String):Students(empname)
{
    fun AcceptExam(a:Math):Boolean
    {
        var gradeGeom = readLine()!!.toInt()
        var gradeAlg = readLine()!!.toInt()
        var Exgrade = 0
        if(gradeGeom >= 3 && gradeAlg >= 4)
        {
            Exgrade = (gradeGeom+gradeAlg)/2-(gradeGeom+gradeAlg)%2
            println("Отметка - ${Exgrade}")
            return true
        }
        else
        {

            return false
        }

    }
}
