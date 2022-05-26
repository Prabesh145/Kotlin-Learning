fun main(){
    print("Enter the number of students you want to add: ")
    var num:Int = readLine()!!.toInt();

    var list = mutableListOf<student>()

    for (i in 1..num){
        print("Enter the name of the student: ")
        var name:String = readLine()!!.toString()
        print("Enter the address of the student: ")
        var address:String = readLine()!!.toString()
        print("Enter the gender of the student: ")
        var gender:String = readLine()!!.toString()
        var bidhyarthi = student(name, address, gender)
        list.add(bidhyarthi)
    }
    print(list)

   /*for(student in list){
       print(student.name + " " + student.address + " " + student.gender)
   }*/


}