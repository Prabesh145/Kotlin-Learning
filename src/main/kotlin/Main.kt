import java.awt.desktop.PrintFilesEvent

//--------------Kotlin program to display multiplication table of the input no--------------------------------

fun main(){
    multable();
}

fun multable(){
    var table:Int=0;
    print("Enter the number to get its multiplication table")
    var num:Int = readLine()!!.toInt()
    for (i in 1..10){

        table = num * i
        println("The multiplication table of $num is: $num x $i = $table")
    }

}