java -cp lib/antlrworks-1.4.3.jar org.antlr.Tool -fo src src\qsort.g
mkdir bin
javac -cp lib/antlrworks-1.4.3.jar -d bin src\*.java
java -cp "lib/antlrworks-1.4.3.jar;bin" Main qsort.c > qsort.js
java -jar lib/jsf.jar qsort.js qsort.js
pause