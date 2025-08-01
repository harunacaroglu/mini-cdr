# 1. Java 17 tabanlı minimal bir image kullan
FROM eclipse-temurin:21-jdk

# 2. Uygulama JAR dosyasını container içine kopyala
COPY target/mini-cdr-0.0.1-SNAPSHOT.jar app.jar


# 3. Uygulama dış dünya ile 8080 üzerinden haberleşecek
EXPOSE 8080

# 4. Uygulamayı başlat
ENTRYPOINT ["java", "-jar", "app.jar"]
