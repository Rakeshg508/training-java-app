# training-java-app
Training java application

1. Run mvn clean install it will build java app and liquibase project
2. go to liquibase.properties inside liquibase module 
3. in liquibase.properties change required db details , make sure database url have database name already created , liquibase does not create db by default
4. Go to liquibase module  by cd liquibase
5. run mvn clean install
6. run mvn liquibase:update it will create table automatically