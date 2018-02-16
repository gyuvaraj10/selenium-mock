# selenium-mock
A mocking system to mock all the selenium interactions
It is a pain when you need to perform the impact analysis on your complete regression test script to identify the number of tests
impacted due to a sudden change to the system (UI).

This project helps you to simply the process of doing the impact analysis. To use this project simply clone this code and run
```
mvn clean install -Ppackage
```

Once this module is installed on your local, add this dependency to your maven dependencies section of your pom.xml as follows.
```
  <dependency>
      <groupId>selenium-mock</groupId>
      <artifactId>selenium.mock</artifactId>
      <version>1.1-SNAPSHOT</version>
  </dependency>
```

And, then add the following plugin to your build section.

```
<plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>aspectj-maven-plugin</artifactId>
    <version>1.7</version>
    <configuration>
        <complianceLevel>1.8</complianceLevel>
        <source>1.8</source>
        <target>1.8</target>
        <weaveDependencies>
            <weaveDependency>
                <groupId>selenium-mock</groupId>
                <artifactId>selenium.mock</artifactId>
            </weaveDependency>
        </weaveDependencies>
    </configuration>
    <executions>
        <execution>
            <goals>
                <goal>compile</goal>
                <goal>test-compile</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

More information about weaving is at http://www.baeldung.com/aspectj
