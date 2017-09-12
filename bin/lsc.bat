REM @echo off

setLocal EnableDelayedExpansion

for /f %%i in ("%0") do set LSC_HOME=%%~dpi..

REM ====================================================================
REM  Configuration
REM ====================================================================

SET CFG_DIR=%LSC_HOME%\etc
SET LIB_DIR=%LSC_HOME%\lib
SET LOG_DIR=%TEMP%
SET LOG_FILE=%LOG_DIR%\lsc.log

call:log "Starting LSC"

set CLASSPATH=%CLASSPATH%;.
 for  %%a in ("%LIB_DIR%\slf4j-api-*.jar") do (
   set CLASSPATH=!CLASSPATH!;%%a
 )
 for  %%a in ("%LIB_DIR%\*.jar") do (
   set CLASSPATH=!CLASSPATH!;%%a
 )
set CLASSPATH=!CLASSPATH!

REM if LSC options include the "-a" flag, set the required JMX options
FOR %%i IN ( %* ) DO IF "%%i"=="-a" (
  IF DEFINED LSC_JMXPORT (
	SET JAVA_OPTS=-Dcom.sun.management.jmxremote=true -Dcom.sun.management.jmxremote.port=%LSC_JMXPORT% -Dcom.sun.management.jmxremote.authenticate=false -Dcom.sun.management.jmxremote.ssl=false
  ) ELSE (
    call:log "LSC: to control your asynchronous task(s), consider setting the LSC_JMXPORT environment variable to a positive value to bind the JMX interface to that TCP port."
  )
)

java.exe -cp "%CLASSPATH%" %JAVA_OPTS% org.lsc.Launcher %*

REM LSC finished running
call:log "LSC finished running"

if ERRORLEVEL 1 (
	echo Please look up the log file %LOG_FILE% to see the error
	exit /B ERRORLEVEL

)

REM ====================================================================
REM  Functions
REM ====================================================================

:log
	echo %DATE%  [lsc] %~1 >> %LOG_FILE%
goto:eof


:fatal
	call:log %~1
	echo %DATE%  [lsc] %~1
goto:eof



EXIT /B 2


