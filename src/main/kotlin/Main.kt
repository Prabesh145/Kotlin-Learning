import java.awt.desktop.PrintFilesEvent

//--------------Kotlin program to find the sum of even nos from 1 to 20--------------------------------

fun main(){
    print("The sum of even nos from 1 to 20 is: ${sum()}")
}

fun sum():Int{
    var add:Int = 0;
    for (i in 2..20 step 2){
        add += i;
    }
    return add;
}