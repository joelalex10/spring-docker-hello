FROM ubuntu:20.04
RUN apt update
RUN apt install -y curl
RUN curl -O https://cdn.azul.com/zulu/bin/zulu11.2.3-jdk11.0.1-linux_x64.tar.gz
RUN tar xvfz zulu11.2.3-jdk11.0.1-linux_x64.tar.gz
ENV JAVA_HOME /zulu11.2.3-jdk11.0.1-linux_x64
ENV PATH $JAVA_HOME/bin:$PATH
WORKDIR /app
COPY . .
RUN /app/mvnw clean package
EXPOSE 80
ENTRYPOINT ["/app/mvnw","spring-boot:run"]
