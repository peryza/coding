## Описание
Данное приложение предназначено для сортировки слов из строки. Реализовано на языке програмирования Kotlin.

## Список алгоритмов

1. Разделение строки на отдельные слова и вывод каждого слова на отдельной строке
2. Сортировка выведенных слов
3. Вывод только уникальных слов
4. Подсчет повторений каждого слова
5. Сортировка слов по количеству повторений в порядке убывания, если количество совпадает, то сортирует по алфавиту

## Репозиторий также включает в себя следующие batch scripts

1. BUILD.bat - скрипт для компиляции файла myApp.jar
2. RUN.bat - скрипт для запуска myApp.jar
3. TEST.bat - скрипт для тестирования приложения (myApp.jar)

## Примеры использования

+ "ваш текс"| java -jar myApp.jar
+  echo "ваш текс"


## Тестовые сценарии

+ java -jar myApp.jar 
+ java -jar myApp.jar the quick brown fox jumps over the lazy dog
+ java -jar maApp.jar the quick brown   fox jumps over the lazy dog
+ java -jar maApp.jar the quick, brown, fox jumps over the lazy dog.
+ java -jar maApp.jar the quick brown fox /n jumps over the lazy dog