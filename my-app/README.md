- creaite project


`mvn archetype:generate -DgroupId=tarea4 -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`


- add pom.xml


```
<properties>
     <maven.compiler.source>1.8</maven.compiler.source>
     <maven.compiler.target>1.8</maven.compiler.target>
</properties>

```


- run unit test


`mv package`


- run integrated test 


`java -cp target/my-app-1.0-SNAPSHOT.jar tarea4.App`