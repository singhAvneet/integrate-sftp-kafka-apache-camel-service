FROM maven:3.6.3-jdk-11 as build
COPY . /usr
WORKDIR /usr
RUN mvn compile
CMD ["mvn", "exec:java"]