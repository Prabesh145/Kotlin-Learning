import java.awt.desktop.PrintFilesEvent

//--------------Maps Introduction--------------------------------
fun main(){

    var name = arrayOf("Ram", "Shyam", "Hari")
    var marks = arrayOf(1,3,4)

    var student = mapOf<String,Int>(
        "Ram" to 1, "Shyam" to 3, "Hari" to 4

    )

    print("Enter the name of the student to find the marks")
    var boy = readLine()!!

    //var result = student[boy]
    print("The result of the student $boy is: ${student[boy]} ")


}