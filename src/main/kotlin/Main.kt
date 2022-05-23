import java.awt.desktop.PrintFilesEvent

//--------------Making student class and listing their details--------------------------------
fun main(){

    print("How many students' record do you want to enter")
    var num:Int = readLine()!!.toInt()
    var studentlist = mutableListOf<student>()


        for (i in 1..num){
            print("Enter the first name: ")
            var fn = readLine()!!.toString();
            print("Enter the last name: ")
            var ln = readLine()!!.toString();
            print("Enter the address: ")
            var add = readLine()!!.toString();
            var std = student(fn,ln,add)
            studentlist.add(std)

        }
    for(student in studentlist){
        print(student.firstname + student.lastname + student.address);
    }



}