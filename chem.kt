import Students
class Chem(var empname:String):Students(empname)
{
    fun AcceptExam(a:Chem):Boolean
    {
        var gradeofTheory = readLine()!!.toInt()
        var gradeofPractise = readLine()!!.toInt()
        var exgrade = 0
        if(gradeofPractise >=3 && gradeofTheory >= 4)
        {
            exgrade = (gradeofPractise + gradeofTheory)/2 - (gradeofPractise + gradeofTheory)% 2
            println("Отметка - ${exgrade}")
            return true
        }
        else
        {
            return false
        }
    }

}