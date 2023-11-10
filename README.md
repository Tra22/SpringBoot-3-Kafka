# SpringBoot-3-Kafka

An example of a RESTful WebServer developed using Spring & SpringBoot.

This example explained about spring boot3 with kafka

## Requirements

The fully fledged server uses the following:

* Spring Framework
* SpringBoot
* Log4j2
* Lombok
* Kafka

## Dependencies
There are a number of third-party dependencies used in the project. Browse the Maven pom.xml file for details of libraries and versions used.<br>

  	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter</artifactId>
		</dependency>
		<dependency>
			<groupId>org.yaml</groupId>
			<artifactId>snakeyaml</artifactId>
			<version>2.0</version>
		</dependency>
		<dependency>
			<groupId>org.springframework.kafka</groupId>
			<artifactId>spring-kafka</artifactId>
		</dependency>

		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
		</dependency>

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.kafka</groupId>
			<artifactId>spring-kafka-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

## Building the project
You will need:

*	Java JDK 17 or higher
*	Maven 3+ or higher
*	Tomcat 10.1

Clone the project and use Maven to build the server

	$ mvn clean install
  
## Languages and Tools
<div>
  <img src="https://spring.io/img/og-spring.png" title="spring framework" alt="spring framework" width="80" height="40"/>&nbsp;
  <img src="https://res.cloudinary.com/practicaldev/image/fetch/s--3ix0rFmo--/c_imagga_scale,f_auto,fl_progressive,h_420,q_auto,w_1000/https://dev-to-uploads.s3.amazonaws.com/uploads/articles/dmmxiwgyuzodl7yqyuca.jpeg" title="spring boot" alt="spring boot" width="80" height="40"/>&nbsp;
  <img src="https://miro.medium.com/v2/resize:fit:600/0*u1toxHgnexMPufKv.jpg" title="kafka" alt="kafka" width="80" height="40"/>&nbsp;
  <img src="https://miro.medium.com/v2/resize:fit:1400/1*Jt34KK87zw10NOLYqU-CNQ.jpeg" title="lombok" alt="lombok" width="80" height="40"/>&nbsp;
</div>
	
