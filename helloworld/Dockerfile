FROM openjdk:8u181-jdk-alpine

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && \
    echo "Asia/Shanghai" > /etc/timezone

WORKDIR /home/apps/
ADD target/helloworld-1.2.0.jar .


ENTRYPOINT ["java","-jar", "helloworld-1.2.0.jar"]
