java -cp lib/antlrworks-1.4.3.jar org.antlr.Tool -fo src src\qsort.g
mkdir bin
javac -cp lib/antlrworks-1.4.3.jar -d bin src\*.java
java -cp "lib/antlrworks-1.4.3.jar;bin" Main qsort.c > test.js
java -jar lib/pyf.jar test.js result.py
pause