cd exam1
mvn clean
mvn compile 
mvn exec:java -Dexec.mainClass="com.hand.App" -Dexec.args="arg0 arg1 arg2"