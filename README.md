# spring-boot

Spring boot tutorial:

1) New maven project
   maven-archetype-webapp

2) pom:

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.springframework</groupId>
    <artifactId>gs-spring-boot</artifactId>
    <version>0.1.0</version>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.4.1.RELEASE</version>
    </parent>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
    </dependencies>

    <properties>
        <java.version>1.8</java.version>
    </properties>


    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>


3) Project Facets
  java 1.8
  
4) Maven -> Update project  

5) Application.java and HelloController.java

6) To build package and to run the application 
cd C:\Users\pyogi\workspace\spring-boot
mvn package && java -jar target/gs-spring-boot-0.1.0.jar

7) Check out the service.
http://localhost:8080/

--------------------------------
cd C:/Users/pyogi/workspace/spring-boot

git init

git status

git log 

git add .

git commit -m "versão inicial spring-mvc com passagem de parametro"

git branch (lista as branchs locais)

-- criate repository

git remote add origin_spring https://github.com/patriciayogi/spring-boot.git

git remote

git pull origin_spring master   

git commit -m "merge"

git push origin_spring master   

git show <ID do commit>
--------------------------------

1. make pom.xml easy to install deploy
Test on QA(how to deploy on production? is it the same package?)

2. migrate to tomcat


http://codesolid.com/spring-unit-testing-using-junit/

3. struts to spring 



Spring:
https://www.tutorialspoint.com/spring/spring_mvc_hello_world_example.htm

Spring Information:
https://spring.io/guides

Especially (in this order, each should take about 15 min):
https://spring.io/guides/gs/maven/
https://spring.io/guides/gs/spring-boot/
https://spring.io/guides/gs/relational-data-access/
https://spring.io/guides/gs/scheduling-tasks/
https://spring.io/guides/gs/caching/

https://spring.io/blog/2014/03/07/deploying-spring-boot-applications


Tomcat 9:
https://tomcat.apache.org/tomcat-8.0-doc/index.html
https://tomcat.apache.org/download-90.cgi


Struts tomcat example:
https://www.mkyong.com/struts2/struts-2-hello-world-example/
https://www.tutorialspoint.com/struts_2/struts_examples.htm


JBoss (or any other Java EE server) might be the right choice as it provides built-in support for e.g:
JMS messaging for asynchronous integration
Web Services engine (JAX-WS and/or JAX-RS)
Management capabilities like JMX and a scripted administration interface
Advanced security, e.g. out-of-the-box integration with 3rd party directories
EAR file instead of "only" WAR file support
