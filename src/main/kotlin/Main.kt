import java.awt.desktop.PrintFilesEvent

//--------------Kotlin program to take 8 nos from users and find the sum of even and odd nos--------------------------------

fun main(){
    val myArray = arrayOfNulls<Int>(size = 8)
    var evensum:Int = 0;
    var oddsum:Int = 0;
    for(i in myArray.indices){
        println("Enter the value for the $i position of the array")
        myArray[i] = readLine()!!.toInt();

        if(myArray[i]!!.toInt()%2==0){
          evensum += myArray[i]!!.toInt();
        }
        else
        {
            oddsum += myArray[i]!!.toInt()
        }

    }
    println("The sum of even numbers are: $evensum")
    println("The sum of odd numbers are: $oddsum")





}