@echo off

cd src\
echo TEST #1
TYPE test1.txt
java -jar myApp.jar the quick brown fox jumps over the lazy dog



echo TEST #2
TYPE test2.txt
echo please press "ENTER"
java -jar myApp.jar



echo TEST #3
TYPE test3.txt
java -jar myApp.jar the quick, brown, fox jumps over the lazy dog.

echo TEST #4
TYPE test4.txt
java -jar myApp.jar the quick brown fox \n jumps over the lazy dog

echo TEST #5
TYPE test5.txt
java -jar myApp.jar the1 quick2 brown3 fox jumps4 over the lazy dog

echo TEST #6
TYPE test6.txt
java -jar myApp.jar the the the the the

echo TEST #7
TYPE test7.txt
java -jar myApp.jar the  the  the  the  the