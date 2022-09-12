- https://maven.apache.org/download.cgi



`mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false`


`cd my-app`


`mvn package`


`mvn clean install`


`java -cp target/my-app-1.0-SNAPSHOT.jar com.[NAME-APP].app.App`



-  https://undertow.io/undertow-docs/undertow-docs-2.1.0/index.html#introduction-to-undertow


-  https://undertow.io/javadoc/1.4.x/io/undertow/server/handlers/package-summary.html


-  https://mvnrepository.com/


-  https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html


-  https://howtodoinjava.com/jersey/jersey-quickstart-archetype-hello-world-application-example/


-  https://syntaxcorrect.com/Java/5_Ultra_Lightweight_Http_Server_Implementations_in_Java_for_Blazing_Fast_Microservices_APIs_or_Even_Websites

-  https://eclipse-ee4j.github.io/jersey.github.io/documentation/latest/getting-started.html


-  https://mkyong.com/maven/how-to-create-a-web-application-project-with-maven/



- Default life cycle phases in maven


validate - validate the project is correct and all necessary information is available


compile - compile the source code of the project


test - test the compiled source code using a suitable unit testing framework. These tests should not require the code be packaged or deployed


package - take the compiled code and package it in its distributable format, such as a JAR.


verify - run any checks on results of integration tests to ensure quality criteria are met


install - install the package into the local repository, for use as a dependency in other projects locally


deploy - done in the build environment, copies the final package to the remote repository for sharing with other developers and projects.
