fun main(args: Array<String>) {
    if (args.isEmpty()) {
        val words = readLine().toString().split(' ')
        work(words)
    } else {
        work(args.toList())
    }

}

fun work(listWords: List<String>) {

/* Разделение строк - Уровень 1 */

    println("-----------Первый уровень----------------")
    listWords.forEach(::println)


/* Сортировка списка слов - Уровень 2 */

    println("-----------Второй уровень----------------")
    val listSort = listWords.sorted()
    listSort.forEach(::println)


/* Вывод только уникальных слов - Уровень 3 */

    println("-----------Третий уровень----------------")
    val listDist = listSort.distinct()
    listDist.forEach(::println)


/* Подсчет количества повторений слов - Уровень 4 */

    println("----------Четвертый уровень--------------")

    val listWordCount = listSort.groupingBy { it }.eachCount()
    listWordCount.forEach { (word, count) -> println("$word $count") }

/* сортировка слов по убыванию - Уровень 5 */

    println("----------Пятый уровень----------------")

    val listWordCountSort = listWordCount.toList().sortedWith(compareBy({ -it.second }, { it.first }))
    listWordCountSort.forEach { (word, count) -> println("$word $count") }
    println("\n")

}











