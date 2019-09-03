fun fac()
{
    println("You Chose Factor\nEnter a Number whose factor has to be found")
    try {

        var n: Int = Integer.valueOf(readLine())
        var i: Int = 1
        var count: Int = 0
        while (i < (n / 2)) {
            i++
            if (n % i == 0) {
                print("$i\t")
                count++
            }
        }
        if (count <= 1)
            println("The number is prime")
    }
    catch (e : java.lang.NumberFormatException)
    {
        println("Input value cannot be processed due to Invalid format OR Exceptionally large size")
    }
}
fun pow()
{
    println("You Chose Power\nEnter a Number whose power has to be found")
    try {

        var n: Int = Integer.valueOf(readLine())
        println("Enter the exponent to which the number has to be raised")
        var i: Int = 1
        var p: Int = Integer.valueOf(readLine())
        var l: Int = 1
        while (i <= p) {
            l *= n
            i++
        }
        if (p >= 0 && l >0) println("$n ^ $p = $l")
        else if(l==0) println("The expression ($n ^ $p) has exceptionally large value and cannot be displayed")
        else println("Negative powers are not Entertained")
    }
    catch (e : java.lang.NumberFormatException)
    {
        println("Input value cannot be processed due to Invalid format OR Exceptionally large size")
    }
}
fun main()
{
    println(".......Welcome.......\n\n1.Factor\n2.Power")
    println("Enter '1' to find Factor of a Number and '2' to find Power of a number")
    try {

        var inp: Int = Integer.valueOf(readLine())
        if (inp == 1) fac()
        else if (inp == 2) pow()
        else println("Invalid Option")
    }
    catch (e : java.lang.NumberFormatException)
    {
        println("Input Option cannot be processed due to Invalid format OR Exceptionally large size")
    }
}
