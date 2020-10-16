//Функция для сортировки
fun sorted(list: List<String>): List<String> {
    val ListSorted = list.sorted()
    return ListSorted
}


fun main() {

    val words = readLine().toString()
//Разделение строк
    println("-----------Первый уровень-------------------")
    var yes = words.split(" ")
    yes.forEach { el -> println(el) }


//Сортировка списка слов
    println("-----------Второй уровень---------------------")
    yes = sorted(yes)
    yes.forEach { el -> println(el) }

//Вывод только уникальных слов
    println("-----------Третий уровень---------------------")

    var i = 0
    var count = yes.size - 1
    while (i < count) {
        if (yes[i] != yes[i + 1]) {
            println(yes[i])

        }
        i += 1
    }
    println(yes.last())

//Подсчет количества повторений слов
    println("----------Четвертый уровень-----------------")

    i = 0
    var k = 0
    val yes2 = mutableMapOf<String, Int>() // создание ассоциативного массива

    count = yes.size - 1
    while (i < count) {
        if (yes[i] != yes[i + 1]) {
            yes2.put(yes[i], k + 1)

            k = 0
        } else k += 1

        i += 1
    }
    yes2.put(yes.last(), k + 1)
    yes2.forEach { (key, value) -> println("$key $value") }

//сортировка слов по убыванию
    println("----------Пятый уровень----------------")
    val result = yes2.toList().sortedByDescending { (_, value) -> value }.toMap()
    result.forEach { key, value -> println("$key $value") }


}











