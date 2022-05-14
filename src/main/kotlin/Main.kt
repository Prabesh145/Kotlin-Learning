
//----------------------Kotlin program to calculate SI--------------------------------
fun main() {
            print("Enter the value for principal: ")
    var p:Float = readLine()!!.toFloat();
    print("Enter the value for time in hours: ")
    var t:Float = readLine()!!.toFloat();
    print("Enter the value for rate: ")
    var r:Float = readLine()!!.toFloat();

    var SI:Float = (p*t*r)/100
    print("The Simple Interest is: $SI")

        }

