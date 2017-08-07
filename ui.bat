
for /f %%i in ("%0") do set LSC_HOME=%%~dpi

REM ====================================================================
REM  Configuration
REM ====================================================================


java -jar %LSC_HOME%\bin\lscui-1.0-jar-with-dependencies.jar