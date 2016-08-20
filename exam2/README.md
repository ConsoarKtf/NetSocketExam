cd exam2
mvn clean
mvn compile 
mvn exec:java -Dexec.mainClass="com.hand.Client" -Dexec.args="arg0 arg1 arg2"
mvn exec:java -Dexec.mainClass="com.hand.Server" -Dexec.args="arg0 arg1 arg2"