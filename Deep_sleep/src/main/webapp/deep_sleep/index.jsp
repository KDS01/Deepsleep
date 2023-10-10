<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Stage1.Stage1Lines"
    import="deepsleep.Narrator"
    %>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <%
    Narrator narrator = new Narrator();
   
    %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    
    <style>
        .box{
            font-weight: bold;
            font-size: 50px;
            color: white;
            background-color: black;
            display: flex;
            padding: 3px;
            margin-top: 120px;
            align-content:center;
            justify-content: center;
            position: static;
            cursor: pointer;
            user-select: none;
            }
        .h1{

        }
        
    </style>
</head>
<body style="background-color:black" >
    <form action="stage1.html">
        <div class="box">
            <h1><span style="color: red;">D</span>eep<br>
            Sleep</h1>
            <br>
            <br>
        </div>
        <div class="box" onclick="">
            <h4>
                계속하려면 화면을 클릭하세요
            </h4>
        </div>
    </form>
</body>
</html>