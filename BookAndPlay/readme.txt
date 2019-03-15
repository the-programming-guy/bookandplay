Reference : 

https://www.concretepage.com/spring-boot/spring-boot-rest-jpa-hibernate-mysql-example

CREATE DATABASE IF NOT EXISTS `the-programming-guy`;

CREATE TABLE IF NOT EXISTS `articles` (
  `article_id` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `category` varchar(100) NOT NULL,
  PRIMARY KEY (`article_id`)
)

INSERT INTO `articles` (`article_id`, `title`, `category`) VALUES
	(1, 'Java Concurrency', 'Java'),
	(2, 'Hibernate HQL ', 'Hibernate'),
	(3, 'Spring MVC with Hibernate', 'Spring'); 


