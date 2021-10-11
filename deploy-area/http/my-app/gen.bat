@echo off


:: mvn archetype:generate -DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeGroupId=org.glassfish.jersey.archetypes -DinteractiveMode=false -DgroupId=com.example -DartifactId=simple-service-webapp -Dpackage=com.example -DarchetypeVersion=2.35


mvn archetype:generate -DgroupId=com.microsoft.example -DartifactId=MyWebApp -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
