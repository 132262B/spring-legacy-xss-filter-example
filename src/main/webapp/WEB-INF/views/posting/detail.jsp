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
        <div class="row">
            <div class="col-12">
                <div class="mb-3">
                    <h6>${detailPage.title}</h6>
                </div>
                <div class="mb-3">
                    ${detailPage.content}
                </div>
            </div>
        </div>
    </div>


</section>


</body>
</html>
