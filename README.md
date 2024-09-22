# lab-02

<!-- git clone https://github.com/AndrewChacon1/software-class.git
cd lab-01

wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

javac -cp junit-4.13.2.jar src/c/*.java src/u/*.java
java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/" org.junit.runner.JUnitCore u.HybridVehicleTests


remove all .class files
rm -rf c/*.class u/*.class
 -->

git clone https://github.com/AndrewChacon1/software-class.git
cd lab-01

mvn archetype:generate -DgroupId=com.softwareengineering.course -DartifactId=cse2102 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

Move files to new correct location 
source and test files

include new dependencies in XML file to include Junit
    <!-- JUnit 4 dependency -->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

mvn clean compile
mvn test

wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

javac -cp junit-4.13.2.jar src/c/*.java src/u/*.java

java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/" org.junit.runner.JUnitCore u.HybridVehicleTests
rm -rf c/*.class u/*.class
