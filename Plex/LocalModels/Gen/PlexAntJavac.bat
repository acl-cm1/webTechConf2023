@REM // If you wish, you can change the txt files inside Src directory
@REM //and then call ant through this batch file to compile your code.

@(SET ANT_HOME=)
@SET PATH="C:\Program Files (x86)\CA\Plex\7.2.1\ObJava\apache-ant\bin";%PATH%
call ant -f "C:\Development\Conferences\2023 Boca Raton\Web Tech Workshop\Plex\LocalModels\Gen\src\buildJava.xml"
