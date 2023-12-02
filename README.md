# My Blog
This is my personal learnig project where I will make a simple blogging web application using react and spring-boot

# Introduction

# How I create my projects
## frontend react project create and  build up steps
-I follow this documentation [Create React App](https://create-react-app.dev/docs/getting-started/)
    - open new terminal within my frontend folder
    - type *npx create-react-app myblog* and hit enter. this create all initial setup for my react project.
    - I did a simple mistake. Me open terminal within my root directory [myblog-react-spring-boot] instead of frontend folder I created earlier. So I then copy the *myblog* react project into frontend folder.
    - But my project structure looks like **frontend\myblog** instead of -*frontend>myblog*. Though I think its not major issue but I decided to delete it and recreate project within frontend folder.
    - But it still the same :'(
    - after creating mybblog app this suggessions show in terminal 

Success! Created myblog at C:\SAIFUR\WORKS\myprojects\myblog-react-spring-boot\forntend\myblog
Inside that directory, you can run several commands:

npm start
Starts the development server.

npm run build
Bundles the app into static files for production.

npm test
Starts the test runner.

npm run eject
Removes this tool and copies build dependencies, configuration files
and scripts into the app directory. If you do this, you can’t go back!

We suggest that you begin by typing:

cd myblog
npm start

Happy hacking!

I do follow this last two commands. and my server was running on localhost:3000 successfully

### errors I faced in frontend and my solutions for those errors

## backend java srping-boot project create and build steps

-- create my spring-boot project using [spring initializr] (https://start.spring.io/)
- here I choose
    - Project
        * Gradle-Kotlin 
    - Language
        * Java
    - Spring Boot
        * 3.2.1(SNAPSHOT)
    - Project Metadata
        - Group *com*
        - Artifact *myblog*
        - Name *myblog*
        - Description 
        - Package name *com.myblog*
        - Packaging *Jar*
        - Java *21*
    - Dependencies
        - spring-boot-starter-data-jpa
        - spring-boot-starter-data-rest
        - spring-boot-starter-validation
        - spring-boot-starter-web
        - lombok
        - spring-boot-devtools
        - mysql-connector-j
        - spring-boot-starter-test
- Then click GENERATE button
- thus generate my initial spring boot project setup that is downloaded as **myblog.zip**. 
- Then extract the files and keep it into **backend** folder of this repository.
- After that I download [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/?section=windows)
- I have downloaded both .exe and .zip file for test purpose. But after reading some suggessions I continue to use installer version(*.exe*) to get auto update of the IDE.
- In Intellij IDEA I went File>New>Project from exisitng sources.., select my *myblog* project folder that was in *backend* folder.
- Thus I import my spring boot project into Intellij IDEA. while importing it downloaded the necessary dependencies.
- I face some java version problem and gradle warning (*that I included into next section*). 
- After solving those problems I successfully run myblog proejct in server port **localhost:8080**


### errors I faced in backend and my solutions for those errors
- when I was trying to build my project from intellij IDEA terminal this error was occurred
    - Execution failed for task ':compileJava'. > error: invalid source release: 21
    - **solved:** 
        - I have set Gradle JVM to java version 21 that was checked to java version 20 because of my system did not have java 21. 
        - I downloaded [JDK 21](https://www.oracle.com/java/technologies/downloads/#jdk21-windows) 
        - set it to my project *File -> Settings.. -> Build, Execution, Deployment -> Build Tools -> Gradle* there my project myblog was selected bcz no other project exists and set Gradle JVM to  java 21 then click apply.
        - Besides I also set project *SDK* to 21 to avoid *java.lang.UnsupportedClassVersionError* from File -> Project Structure -> Project Settings -> Project -> SDK to 21
        - *Language level*: 21 Record patterns, pattern matching for switch. And click Apply.
        - I found this solution on [stackoverflow](https://stackoverflow.com/a/70215091)
    - After that I faced *MyblogApplicationTests > contextLoads() FAILED java.lang.IllegalStateException at DefaultCacheAwareContextLoaderDelegate.java:180* when I type ./gradlew.bat build.
    - **solved**
        - This was basically for srping data jpa configuration missing. I set this 
            -spring.datasource.url=jdbc:mysql://localhost:3306/hrdb?createDatabaseIfNotExist=true
            -spring.datasource.username=root
            -spring.datasource.password=
            -spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver in my **application.properties** file located into **resources** 
        - I found this on [stackoverflow](https://stackoverflow.com/a/31781524)
-after this solutions my project build successfully with *./gradlew.bat clean build* command.
-also I need to start mysql server 
-and then I run my application using **./gradlew.bat bootRun** that started my project into port 8080 successfully.

    


# Techonolgies

# Details Working commands
