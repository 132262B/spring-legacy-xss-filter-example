# spring-legacy-xss-filter-example

## Overview
해당 프로젝트는 Spring을 시작하진 얼마 되지 않는 개발자들에게 Filter의 사용법, secure coding 중 크로스 사이트 스크립팅(Cross Site Scripting, XSS) 공격을 다루고 있습니다.
<br>
<br>
XSS Filter로는 네이버에서 개발한 [lucy-xss-servlet-filter ](https://github.com/naver/lucy-xss-servlet-filter "lucy-xss-servlet-filter") 를 사용하였습니다.

---

<br>

## Version
- mysql 8.0.29
  <br>
  mysql 버전은 [링크](https://mvnrepository.com/artifact/mysql/mysql-connector-java "https://mvnrepository.com/artifact/mysql/mysql-connector-java")를 통해 본인 PC에 맞는 버전으로 변경하세요.
  (pom.xml 59번 Line) 
  <br>
  '/src/main/resources/application.properties' 를 통하여 DB Connection id,password 수정이 필요합니다.
- spring 5.3.16
- mybatis 3.5.9

---

<br>

## Table DDL

```SQL
CREATE TABLE `board` (
  `seq` int NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL,
  `content` varchar(4000) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `reg_date` date NOT NULL,
  PRIMARY KEY (`seq`),
  KEY `board_seq_IDX` (`seq`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
````

---

<br>

## 프로젝트 구조
<br>
<pre>
./spring_xss_filter_ex
├── pom.xml
├── spring_xss_filter_ex.iml
├── src
├── main
│   ├── java  
│   │   └── com  
│   │       └── board  
│   │           ├── controller  
│   │           │   └── BoardController.java  
│   │           ├── dao
│   │           │   └── BoardDao.java  
│   │           ├── service  
│   │           │   ├── BoardService.java  
│   │           │   └── impl  
│   │           │       └── BoardServiceImpl.java  
│   │           └── util  
│   │               └── ViewConverterUtil.java  
│   ├── resources  
│   │   ├── application.properties  
│   │   ├── lucy-xss-servlet-filter-rule.xml  
│   │   ├── mybatis  
│   │   │   └── mybatis-config.xml  
│   │   └── sql  
│   │       └── board.xml  
│   └── webapp  
│       ├── META-INF  
│       │   └── MANIFEST.MF  
│       ├── WEB-INF  
│       │   ├── applicationContext.xml  
│       │   ├── dispatcher-servlet.xml  
│       │   ├── views  
│       │   │   ├── jspf  
│       │   │   │   └── context.jspf  
│       │   │   ├── main  
│       │   │   │   └── main.jsp  
│       │   │   └── posting  
│       │   │       ├── add.jsp  
│       │   │       └── detail.jsp  
│       │   └── web.xml  
│       ├── index.jsp  
│       └── resources  
│           ├── css  
│           │   └── bootstrap.min.css  
│           └── js  
│               └── bootstrap.min.js  
└── test  
    ├── java  
    └── resources  
</pre>   

---

## 

