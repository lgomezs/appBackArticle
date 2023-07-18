FROM openjdk:17-jdk-slim
LABEL maintainer="Luis miguel Gomez Saavedra <luismgsa@indracompany.com>"

WORKDIR /opt/
ADD  /target/appBackArticle*.jar /opt/app.jar

EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["exec java -XshowSettings:vm\
                -Dspring.profiles.active=$PROFILE \
                -jar app.jar"]