//Функция для сортировки
fun sorted(list: List<String>): List<String> {
    return list.sorted()
}


fun main() {

    val words = readLine().toString()
//Разделение строк
    println("-----------Первый уровень----------------")
    var listWords = words.split(" ")
    listWords.forEach { el -> println(el) }


//Сортировка списка слов
    println("-----------Второй уровень----------------")
    listWords = sorted(listWords)
    listWords.forEach { el -> println(el) }

//Вывод только уникальных слов
    println("-----------Третий уровень----------------")

    var i = 0
    var count = listWords.size - 1
    while (i < count) {
        if (listWords[i] != listWords[i + 1]) {
            println(listWords[i])

        }
        i += 1
    }
    println(listWords.last())

//Подсчет количества повторений слов
    println("----------Четвертый уровень--------------")

    i = 0
    var k = 0
    val wordsMap = mutableMapOf<String, Int>() // создание ассоциативного массива

    count = listWords.size - 1
    while (i < count) {
        if (listWords[i] != listWords[i + 1]) {
            wordsMap.put(listWords[i], k + 1)
            k = 0
        } else k += 1
        i += 1
    }
    wordsMap.put(listWords.last(), k + 1)
    wordsMap.forEach { (key, value) -> println("$key $value") }

//сортировка слов по убыванию
    println("----------Пятый уровень----------------")
    val result = wordsMap.toList().sortedByDescending { (_, value) -> value }.toMap()
    result.forEach { (key, value) -> println("$key $value") }


}











