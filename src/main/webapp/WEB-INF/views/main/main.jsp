<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>XSS Filter 적용예제 프로젝트</title>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">XSS Filter</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown"
                aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="${HOME}/mainPage">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${HOME}/addPage">posting</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<section class="mt-5">
    <div class="container">
        <div class="row justify-content-md-center">
            <div class="col-12">
                <table class="table table-hover">
                    <thead>
                    <tr class="text-center">
                        <th scope="col">No</th>
                        <th scope="col">제목</th>
                        <th scope="col">등록일시</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="i" items="${list}">
                        <tr class="text-center" onclick="boardDetailMove(${i.seq})" style="cursor: pointer">
                            <th scope="row">${i.seq}</th>
                            <td>${i.title}</td>
                            <td>${i.reg_date}</td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

        </div>
    </div>

    <script>
        function boardDetailMove(seq) {
            location.href = '${HOME}/detail/'+seq;
        }

    </script>
</section>
</body>
</html>
