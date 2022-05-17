import java.awt.desktop.PrintFilesEvent

//--------------list introduction--------------------------------
fun main(){
    //val myList = listOf<String>("one", "two", "three", "four")

    //print("The size of the string is ${myList.size}")
    //print("The index number of three is: ${myList.indexOf("three")}")
    //print("The third item in the list is: ${myList[2]}")

   var list: MutableList<String> = mutableListOf<String>("Ram", "Shyam", "Hari", "Rita")
    list.add("Prabesh")
    for (i in list.indices) {
        println("The entries of the list are: ${list[i]}")
    }


}
