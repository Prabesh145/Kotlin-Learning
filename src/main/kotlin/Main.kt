import java.awt.desktop.PrintFilesEvent

//--------------Kotlin program to take 3 nos from users in array and display sum--------------------------------
fun main(){
    val myArray = arrayOfNulls<Int>(size = 3)
    var sum: Int = 0;
    for(i in myArray.indices) {

        println("Enter the number for the $i position of the array")
        myArray[i] = readLine()!!.toInt();
        sum += myArray[i]!!.toInt();

    }
    print(" The sum of the three numbers is : $sum")

}