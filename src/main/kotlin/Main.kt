
//----------------------Kotlin program to calculate area of circle using function--------------------------------

fun main(){
    print("The area of the circle is ${area()}")
}

fun area():Double{
    print("Enter the value for radius of the circle")
    var r:Float = readLine()!!.toFloat();

    var result:Double = 3.14*r*r;
    return result;

}
