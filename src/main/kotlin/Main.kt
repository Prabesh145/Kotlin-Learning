import java.awt.desktop.PrintFilesEvent

//--------------Kotlin program to take 5 nos from users in array and print them--------------------------------

fun main(){
    val myArray = arrayOfNulls<Int>(size = 5)


    for(i in myArray.indices){
        println("Enter numbers at position $i")
        myArray[i] = readLine()!!.toInt()

    }
    for(i in myArray.indices) {
        println(myArray[i])
    }

}