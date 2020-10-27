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

    println("-----------LEVEL 1----------------")
    listWords.forEach(::println)


/* Сортировка списка слов - Уровень 2 */

    println("-----------LEVEL 2----------------")
    val listSort = listWords.sorted()
    listSort.forEach(::println)


/* Вывод только уникальных слов - Уровень 3 */

    println("-----------LEVEL 3----------------")
    val listDist = listSort.distinct()
    listDist.forEach(::println)


/* Подсчет количества повторений слов - Уровень 4 */

    println("-----------LEVEL 4----------------")

    val listWordCount = listSort.groupingBy { it }.eachCount()
    listWordCount.forEach { (word, count) -> println("$word $count") }

/* сортировка слов по убыванию - Уровень 5 */

    println("-----------LEVEL 5----------------")

    val listWordCountSort = listWordCount.toList().sortedWith(compareBy({ -it.second }, { it.first }))
    listWordCountSort.forEach { (word, count) -> println("$word $count") }
    println("\n")

}











