fun main() {
println(calculateSum(arrayOf(3,8,4,9,10)))
    println(checkSum(20,30,50))
    println(countVowel("hello"))
    println(secondLargest(arrayOf(10,21,32,12,11)))
    
}
//Write a function that takes an array of numbers as input and returns the sum of all the numbers
fun calculateSum(num:Array<Int>):Int{
 var sum=0
    for (num in num){
        sum+=num
    }
    return sum
}

//Write a function that takes two numbers as input and returns true if their sum is greater than 100,
//And false otherwise
fun checkSum(x:Int,y:Int,z:Int):Boolean{
    val sum=x+y+z
    return sum>100
}
///Write a function that takes a string as input and returns the number of vowels in the string

fun countVowel(name:String):Int{
    val vowel= listOf('a','e','o','u')
    var count=0

    for (element in name.lowercase()){
        if (element in vowel){
            count++
        }
    }
    return count

}




