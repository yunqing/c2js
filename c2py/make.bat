java -cp lib/antlrworks-1.4.3.jar org.antlr.Tool -fo src src\qsort.g
mkdir bin
javac -cp lib/antlrworks-1.4.3.jar -d bin src\*.java
java -cp "lib/antlrworks-1.4.3.jar;bin" Main qsort.c > qsort.py
java -jar lib/pyf.jar qsort.py qsort.py
pause