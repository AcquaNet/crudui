setlocal
set JAVA_HOME=C:\Program Files\Java\jdk-21.0.4.7-hotspot
set PATH=%JAVA_HOME%\bin;%PATH%;
call mvnw clean package -Pproduction
pause