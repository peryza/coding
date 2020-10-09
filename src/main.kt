
fun sorted(list: List<String>): List<String>{
    var ListSorted = list.sorted()
    return ListSorted
}


fun main(args: Array<String>){

    var words = readLine().toString()

    println("-----------Первый уровень-------------------")
    var yes = words.split(" ")
    yes.forEach { el -> println(el) } //вывод списка по одному слову
//    Сортировка списка
    println("-----------Второй уровень---------------------")
    yes = sorted(yes)
    yes.forEach { el -> println(el) } // вывод списка

    println("-----------Третий уровень---------------------")

    var i = 0
    var count = yes.size-1
    while ( i < count ){
        if (yes[i] != yes[i+1]){
            println(yes[i])

        }
        i+= 1
    }
    println(yes.last())

    println("----------Четвертый уровень-----------------")
    i = 0
    var k = 0
    var yes2 = mutableMapOf<String, Int>() // создание ассоциативного массива

    count = yes.size-1
    while ( i < count ){
        if (yes[i] != yes[i+1]) {
            yes2.put(yes[i], k+1)

            k=0
        }else k+= 1

        i+= 1}
    yes2.put(yes.last(), k+1)
    yes2.forEach{key, value -> println("$key $value")}


    println("----------Пятый уровень----------------")

//    сортировка по убыванию чисел
    val result = yes2.toList().sortedByDescending { (_,value)->value }.toMap()
    result.forEach{key, value -> println("$key $value")}





}











