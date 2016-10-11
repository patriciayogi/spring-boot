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
