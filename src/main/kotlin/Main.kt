import java.awt.desktop.PrintFilesEvent

//--------------Kotlin program to check the greater number--------------------------------

fun main(){
    check();
}

fun check(){
    print("Enter the first number")
    var first: Int = readLine()!!.toInt();
    print("Enter the second number")
    var second: Int = readLine()!!.toInt()

    if(first>second) {
        print("$first is greater than $second")
    }
    else{
        print("$second is greater than $first")
    }
}