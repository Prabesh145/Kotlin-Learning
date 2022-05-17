import java.awt.desktop.PrintFilesEvent

//--------------Kotlin program to take input from user and find if its in the array--------------------------------

fun main(){
    var myArray = arrayOf(1,3,4,5,6)

    print("Enter a number you want to check: ")
    var num:Int = readLine()!!.toInt()
    var ans="notfound";
    for (i in myArray.indices)
    {
        if (num ==myArray[i]){
            ans="found";
        }
    }
    if(ans=="found"){
        print("The number is found")
        return;
    }
    print("The number is not found")


}