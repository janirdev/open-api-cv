FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY . .

# dar permissão ao mvnw
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

CMD ["java", "-jar", "target/openapis-dev-0.0.1-SNAPSHOT.jar"]