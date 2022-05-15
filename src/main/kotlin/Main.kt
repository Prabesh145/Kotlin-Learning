import java.awt.desktop.PrintFilesEvent

//--------------Kotlin program to check the number is even or odd--------------------------------

fun main(){
    check();
}

fun check(){
    print("Enter a number: ")
    var num:Int = readLine()!!.toInt();

    if(num%2==0){
        print("$num is an even number")
    }
    else{
        print("$num is an odd number")
    }

}
