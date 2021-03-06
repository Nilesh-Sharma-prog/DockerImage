# Start with a base image containing Java runtime
FROM java:8

# Make port 8080 available to the world outside this container
EXPOSE 9080

ADD target/dockerwebapp.jar dockerwebapp.jar

# Run the jar file 
ENTRYPOINT ["java","-jar","dockerwebapp.jar"]
