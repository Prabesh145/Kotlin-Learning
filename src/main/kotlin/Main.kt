import java.awt.desktop.PrintFilesEvent

//--------------Simple Interest through Constructor--------------------------------
fun main(){
print("Welcome to the SI calculation program")

  println("Enter the value for principal: ")
  var p:Float = readLine()!!.toFloat();

  println("Enter the value for time in hours: ")
  var t:Float = readLine()!!.toFloat();

  println("Enter the value for rate: ")
  var r:Float = readLine()!!.toFloat()

    var si = SimpleInterest(p,t,r)

  print("The Simple Interest is: ${si.simpleinterest()}")








}