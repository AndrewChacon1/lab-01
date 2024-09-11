# lab-01

git clone https://github.com/AndrewChacon1/software-class.git
cd lab-01

wget https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
wget https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

javac -cp junit-4.13.2.jar src/c/*.java src/u/*.java
java -cp "junit-4.13.2.jar:hamcrest-core-1.3.jar:./src/" org.junit.runner.JUnitCore u.HybridVehicleTests


remove all .class files
rm -rf c/*.class u/*.class