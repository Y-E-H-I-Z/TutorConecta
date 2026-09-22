# Etapa 1: Construcción (Build)
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
# Compila el proyecto omitiendo las pruebas para un despliegue más rápido
RUN mvn clean package -DskipTests

# Etapa 2: Ejecución (Run)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# Copia el archivo .jar generado en la etapa anterior
COPY --from=build /app/target/*.jar app.jar
# Expone el puerto donde corre Spring Boot
EXPOSE 8080
# Comando para iniciar la API
ENTRYPOINT ["java", "-jar", "app.jar"]