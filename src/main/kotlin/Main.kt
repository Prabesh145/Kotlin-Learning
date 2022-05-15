
//----------------------Kotlin program to calculate area of triangle using function--------------------------------

fun main(){

    //var res = area();
    print("The area of the triangle is: ${area()}")
}
fun area(): Double{
    print("Enter the value for base of the triangle: ")
    var b:Float = readLine()!!.toFloat()
    print("Enter the value for the height of the triangle")
    var h:Float = readLine()!!.toFloat()

    var result: Double = 0.5*(b*h);
    return result;


}
