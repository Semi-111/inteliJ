<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Title</title>
    <link rel="icon" href="data:;base64,iVBORw0KGgo=">


    <title>Naver Map Example</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap5/css/bootstrap.min.css"
          type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap5/icon/bootstrap-icons.css"
          type="text/css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/core2.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/menu2.css" type="text/css">

    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v6.6.0/css/all.css">

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/jquery/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/util-jquery.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/menu2.js"></script>
    <style>
        body {
            display: flex;
            height: 100vh;
            margin: 0;
        }

        #search {
            width: 300px;
            padding: 20px;
            box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);
            position: absolute;
            left: -300px;
            top: 0;
            height: 100%;
            background: white;
            transition: left 0.3s ease;
        }

        #search.open {
            left: 0;
        }

        #map {
            flex: 1;
        }

        #toggleButton {
            position: absolute;
            left: 0;
            top: 20px;
            z-index: 1000;
            font-size: 1.5rem;
            background-color: #6f42c1;
            color: white;
        }
    </style>
    <script type="text/javascript"
            src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=testyeoahv"></script>
</head>
<body>
<button id="toggleButton" class="btn btn-primary" onclick="toggleSearch()">☰</button>
<div id="search">
    <h2>Search</h2>
    <input type="text" id="searchInput" placeholder="Search for places..." class="form-control mb-2">
    <button onclick="searchPlaces()" class="btn btn-primary">Search</button>
    <ul id="results"></ul>
</div>
<div id="map"></div>

<script>
    var map = new naver.maps.Map('map', {
        center: new naver.maps.LatLng(37.5665, 126.9780),
        zoom: 10
    });

    function toggleSearch() {
        var searchDiv = document.getElementById('search');
        if (searchDiv.classList.contains('open')) {
            searchDiv.classList.remove('open');
        } else {
            searchDiv.classList.add('open');
        }
    }

    function searchPlaces() {
        var keyword = document.getElementById('searchInput').value;
        naver.maps.Service.geocode({query: keyword}, function (status, response) {
            if (status !== naver.maps.Service.Status.OK) {
                return alert('Something went wrong!');
            }
            var result = response.v2.addresses[0];
            var location = new naver.maps.LatLng(result.y, result.x);
            map.setCenter(location);
            new naver.maps.Marker({
                position: location,
                map: map
            });
            document.getElementById('results').innerHTML = '<li>' + result.roadAddress + '</li>';
        });
    }
</script>
</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: lmj
  Date: 24. 12. 9.
  Time: 오전 8:03
  To change this template use File | Settings | File Templates.
--%>