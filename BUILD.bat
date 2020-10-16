@echo off

cd src\

kotlinc main.kt -include-runtime -d myApp.jar

