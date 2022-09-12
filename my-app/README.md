- create project


`mvn archetype:generate -DgroupId=tarea4 -DartifactId=my-app -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`


- add pom.xml


```

 <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.junit.jupiter</groupId>
      <artifactId>junit-jupiter-engine</artifactId>
      <version>5.5.2</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  
<properties>
     <maven.compiler.source>1.8</maven.compiler.source>
     <maven.compiler.target>1.8</maven.compiler.target>
     <junit-jupiter.version>5.5.2</junit-jupiter.version>
</properties>
```

`mvn package`


- run unit test


`mvn test`


- run integrated test 


`java -cp target/my-app-1.0-SNAPSHOT.jar tarea4.App`