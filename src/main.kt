fun main() {

    var words = readLine().toString()
    if (words == "") words = "the quick brown fox jumps over the lazy dog"


/* Разделение строк Уровень 1 */

    println("-----------Первый уровень----------------")
    val listWords = words.split(" ")
    listWords.forEach(::println)


/* Сортировка списка слов Уровень 2 */

    println("-----------Второй уровень----------------")
    val listSort = listWords.sorted()
    listSort.forEach(::println)


/* Вывод только уникальных слов Уровень 3 */

    println("-----------Третий уровень----------------")
    val listDist = listSort.distinct()
    listDist.forEach(::println)


/* Подсчет количества повторений слов */

    println("----------Четвертый уровень--------------")
    val wordCount: MutableMap<String, Int> = mutableMapOf()
    for (word in listSort) {
        if (!wordCount.contains(word)) wordCount[word] = 0
        wordCount[word] = wordCount[word]!! + 1

    }
    wordCount.forEach { (k, v) -> println("$k $v") }

/* сортировка слов по убыванию */

    println("----------Пятый уровень----------------")
    val wordCountSort = wordCount.toList().sortedByDescending { (_, v) -> v }
    wordCountSort.forEach { (k, v) -> println("$k $v") }


}











