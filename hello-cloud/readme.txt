打包注意：必须加入以下maven plugin
<build>
    <plugins>
        <plugin>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-maven-plugin</artifactId>
        </plugin>
    </plugins>
</build>

通过mvn clean install打包后，使用java -jar hello-cloud-1.0.0.jar

指定项目名和端口号
java -jar hello-cloud-1.0.0.jar --name="hello" --server.port=9090
另一种方式在application.properties改为
name=hello
server.port=9999

调用restful
通过URL调用：http://localhost:9999/users/
使用postman发送post调用：http://localhost:9999/users/ 加入post参数{"id":1,"name":"coral","age":21}
通过URL查询数据：http://localhost:9999/users/1

1.3与1.5的版本差异在SpringApplicationConfiguration改为SpringBootTest