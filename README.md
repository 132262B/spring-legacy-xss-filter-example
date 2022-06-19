# spring-legacy-xss-filter-example
#### 스프링 레거시 XSS필터 적용 예제
<br>

> ### 📎 &nbsp; 사용한 필터
# [lucy-xss-servlet-filter ](https://github.com/naver/lucy-xss-servlet-filter "lucy-xss-servlet-filter")

<br>

---

<br>

>### ⌨️ 프로젝트 구조
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

