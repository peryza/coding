@echo off

cd src\

echo TEST #1

echo the quick brown fox jumps over the lazy dog

echo the quick brown fox jumps over the lazy dog| java -jar myApp.jar

echo TEST #2

echo the1 quick2 brown fox jumps over5 the lazy dog 1

echo the1 quick2 brown fox jumps over5 the lazy dog 1| java -jar myApp.jar

echo TEST #3

echo @the@ .quick2 brown fox jumps over5 the lazy dog 1

echo @the@ .quick2 brown fox jumps over5 the lazy dog 1| java -jar myApp.jar

echo TEST #4

echo the quick brown fox jum/\ps over the lazy dog

echo the quick brown fox jum/\ps over the lazy dog| java -jar myApp.jar