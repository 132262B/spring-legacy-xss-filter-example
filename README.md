# spring-legacy-xss-filter-example
스프링 레거시 XSS필터 적용 예제


./spring_xss_filter_ex/
├── pom.xml
├── spring_xss_filter_ex.iml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── board
│   │   │           ├── controller
│   │   │           │   └── BoardController.java
│   │   │           ├── dao
│   │   │           │   └── BoardDao.java
│   │   │           ├── service
│   │   │           │   ├── BoardService.java
│   │   │           │   └── impl
│   │   │           │       └── BoardServiceImpl.java
│   │   │           └── util
│   │   │               └── ViewConverterUtil.java
│   │   ├── resources
│   │   │   ├── application.properties
│   │   │   ├── lucy-xss-servlet-filter-rule.xml
│   │   │   ├── mybatis
│   │   │   │   └── mybatis-config.xml
│   │   │   └── sql
│   │   │       └── board.xml
│   │   └── webapp
│   │       ├── META-INF
│   │       │   └── MANIFEST.MF
│   │       ├── WEB-INF
│   │       │   ├── applicationContext.xml
│   │       │   ├── classes
│   │       │   │   ├── application.properties
│   │       │   │   ├── com
│   │       │   │   │   ├── board
│   │       │   │   │   │   ├── controller
│   │       │   │   │   │   │   └── BoardController.class
│   │       │   │   │   │   ├── dao
│   │       │   │   │   │   │   └── BoardDao.class
│   │       │   │   │   │   ├── service
│   │       │   │   │   │   │   ├── BoardService.class
│   │       │   │   │   │   │   └── impl
│   │       │   │   │   │   │       └── BoardServiceImpl.class
│   │       │   │   │   │   └── util
│   │       │   │   │   │       └── ViewConverterUtil.class
│   │       │   │   │   └── main
│   │       │   │   │       └── controller
│   │       │   │   │           └── MainController.class
│   │       │   │   ├── lucy-xss-servlet-filter-rule.xml
│   │       │   │   ├── mybatis
│   │       │   │   │   └── mybatis-config.xml
│   │       │   │   ├── nsd
│   │       │   │   │   └── board
│   │       │   │   │       └── controller
│   │       │   │   └── sql
│   │       │   │       └── board.xml
│   │       │   ├── dispatcher-servlet.xml
│   │       │   ├── lib
│   │       │   │   ├── commons-codec-1.4.jar
│   │       │   │   ├── commons-dbcp2-2.9.0.jar
│   │       │   │   ├── commons-lang3-3.3.2.jar
│   │       │   │   ├── commons-logging-1.2.jar
│   │       │   │   ├── commons-pool2-2.10.0.jar
│   │       │   │   ├── jstl-1.2.jar
│   │       │   │   ├── lucy-xss-1.6.3.jar
│   │       │   │   ├── lucy-xss-servlet-2.0.1.jar
│   │       │   │   ├── mybatis-3.5.9.jar
│   │       │   │   ├── mybatis-spring-2.0.7.jar
│   │       │   │   ├── mysql-connector-java-8.0.29.jar
│   │       │   │   ├── protobuf-java-3.19.4.jar
│   │       │   │   ├── spring-aop-5.3.16.jar
│   │       │   │   ├── spring-beans-5.3.16.jar
│   │       │   │   ├── spring-context-5.3.16.jar
│   │       │   │   ├── spring-core-5.3.16.jar
│   │       │   │   ├── spring-expression-5.3.16.jar
│   │       │   │   ├── spring-jcl-5.3.16.jar
│   │       │   │   ├── spring-jdbc-4.3.18.RELEASE.jar
│   │       │   │   ├── spring-test-4.3.18.RELEASE.jar
│   │       │   │   ├── spring-tx-4.3.18.RELEASE.jar
│   │       │   │   ├── spring-web-5.3.16.jar
│   │       │   │   └── spring-webmvc-5.3.16.jar
│   │       │   ├── views
│   │       │   │   ├── jspf
│   │       │   │   │   └── context.jspf
│   │       │   │   ├── main
│   │       │   │   │   └── main.jsp
│   │       │   │   └── posting
│   │       │   │       ├── add.jsp
│   │       │   │       └── detail.jsp
│   │       │   └── web.xml
│   │       ├── index.jsp
│   │       └── resources
│   │           ├── css
│   │           │   └── bootstrap.min.css
│   │           └── js
│   │               └── bootstrap.min.js
│   └── test
│       ├── java
│       └── resources
   
