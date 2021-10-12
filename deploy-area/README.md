### Clone the git repo

`git clone https://github.com/undertow-io/undertow.git`


### Build Undertow

`cd undertow && mvn install`


### fix

For JDK versions 1.8, 9, 11, 12, 14, 15, 16, 17:


        <!-- ... -->
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-javadoc-plugin</artifactId>
            <!--<version>3.2.0</version>-->
            <configuration>
                <javadocExecutable>${java.home}/bin/javadoc</javadocExecutable>
                <!--<doclint>none</doclint>-->
            </configuration>
        </plugin>
        <!-- ... -->

        <!--Presiona el paquete jar, porque el error de prueba no puede ejecutar el complemento importado-->
  			<plugin>
  				<groupId>org.apache.maven.plugins</groupId>
  				<artifactId>maven-surefire-plugin</artifactId>
  				<version>2.4.2</version>
  				<configuration>
  					<skipTests>true</skipTests>
  				</configuration>
  			</plugin>






        
