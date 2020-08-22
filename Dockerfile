FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
ADD target/menu-fetcher.jar menu-fetcher.jar
ENTRYPOINT [ "java", "-jar", "menu-fetcher.jar" ]