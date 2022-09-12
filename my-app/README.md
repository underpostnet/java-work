- create project


`mvn archetype:generate -DgroupId=tarea4 -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`


- add pom.xml


```
<properties>
     <maven.compiler.source>1.8</maven.compiler.source>
     <maven.compiler.target>1.8</maven.compiler.target>
     <junit-jupiter.version>5.5.2</junit-jupiter.version>
</properties>
```


- run unit test


`mvn package`


- run integrated test 


`java -cp target/my-app-1.0-SNAPSHOT.jar tarea4.App`