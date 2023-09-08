# Spring-Boot-Login-and-SignUp-with-JWT-and-H2-Database
User can signup new account, or login with username & password.
By User’s role (admin, developer, user), we authorize the User to access resources.
These are APIs that we need to provide:

Methods	       Urls	                     Actions
POST	        /api/auth/signup	       signup new account
POST	        /api/auth/signin	       login an account
POST	        /api/auth/signout	       logout the account
GET	          /api/hello/all	         retrieve public content
GET	          /api/hello/user	         access User’s content
GET	          /api/hello/dev	         access Developer’s content
GET	          /api/hello/admin	       access Admin’s content

Technology
- Java 17 / 11 / 8
- Spring Boot 3 / 2 (with Spring Security, Spring Web, Spring Data JPA)
- jjwt 0.11.5
- H2 – embedded database
- Maven

Run application with command: mvn spring-boot:run
