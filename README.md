# Spring Introduction
huge credit to inflearn "스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술 (김영한)"

## Installment
1. java 11
2. intelliJ

## Getting Started
1. Spring Boot starter https://start.spring.io
 - Dependencies: Spring Web, Thymeleaf (template engine)
   cf. template engine = html을 동적으로 만들어 주는 것 (php, jsp)
 
 - Logging: slf4j, log-back
 - reference doc
 
 
### Build
1. gradlew build
2. cd build\libs
3. java -jar hello-spring-0.0.1-SNAPSHOT.jar

### View
- Welcome page = index.html
- thymeleaf https://www.thymeleaf.org/
- th: thymeleaf 의미

### Controller
- controller는 web의 진입장벽이다
- controller는 @Controller 필요
- return "~" = template의 ~.html이 화면에 뿌려짐
- cf. @RequestParam()은 주소창에 ? 뒤 값

### API
- @ResponseBody 필요
- template engine을 통해 html을 뿌려주는 것이 아니라, 그냥 데이터 값을 바로 뿌려줌
- json data format (xml 대신)
- 객체가 반환될때 json (MappingJackson2HTTPMessageConverter)
- cf. Jackson - json library

### Test
1. JUnit
2. Test should be executed without regards to the order of methods, thusly repository should be cleared every time. @AfterEach
3. given / when / then
4. @Transactional = rollback


## Business Logic
Keep patient id, name

## Spring Framework 101
- DI (Dependency Injection): 어떠한 객체의 외부에서 다른 객체를 만들어 따로 주입하여 외부 객체에 의존하도록 만드는 방식
 - Reusable
 - Dependency Reduction
 - Loose coupling
 - Readability
 
 ## DB
 - h2database.com
 - JPA

