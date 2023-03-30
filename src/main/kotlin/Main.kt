fun main() {

    println(names(listOf("Clara", "Thomas", "Edowan", "Issabella", "Vince",)))


    var result = numbers(listOf(12.1, 34.6, 56.12, 23.2, 67.1, 34.4))
    println(result)


    personDetail()


    val motor = listOf(
        Car("scf234", 2345.00),
        Car("gfy345", 3452.00),
        Car("bhg789", 8956.00),
    )
    val average = calculateMileage(motor)
    println(average)

    val result1 = addPeoples()
    println(result1)


}


//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun names (y:List<String>):List<String>{
    return y.filterIndexed{index , w-> index % 2 == 0  }
}


//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun numbers(num: List<Double>): Pair<Double, Double>{
    var w = num.sum()
    var x = num.average()
    return Pair(w, x)
}


//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var name: String, var age: Int, var height: Double, var weight: Double)
fun personDetail(){
    var personw = Person ("Adriel", 24, 5.2, 56.9)
    var personx = Person ("Mudula", 56, 8.6, 72.6)
    var persony = Person ("Vannessa", 20, 3.4, 44.0)

    var personList = listOf(personw, personx, persony)
    var sorted = personList.sortedByDescending { person -> person.age }
    println(sorted)
}


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

fun addPeoples(): List<Person>{
    val personm = Person("Mercy", 56, 7.7, 89.0)
    val personn = Person("Adida", 34, 8.2, 67.3)
    return mutableListOf(personm, personn)
}


//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(val registration:String, val mileage: Double)
fun calculateMileage(motor: List<Car>): Double{
    var totalMileage = 0.0
    for (cars in motor){
        totalMileage +=cars.mileage
    }
    return totalMileage / motor.size
}

