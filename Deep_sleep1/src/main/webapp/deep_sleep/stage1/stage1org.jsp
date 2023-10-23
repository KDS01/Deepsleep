<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="Stage1.Stage1Lines"
    import="deepsleep.Narrator"
    %> 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Deep Sleep</title>
    <style>
        .box{
            font-weight: bold;
            font-size: 50px;
            color: white;
            background-color: black;
            display:flex;
            left: 30%;
            margin-top: 120px;
            margin-bottom: 15px;
            align-content:center;
            justify-content: center;
            /* position: static; */
            user-select: none;
            }
        .selectbox{
            border: 0px;
            font-weight: bold;
            font-size: 50px;
            color: white;
            background-color: black;
            left: 36%;
            bottom: 20%;
            margin-top: 120px;
            margin-bottom: 20px;
            align-content:center;
            justify-content: center;
            position: absolute;
            cursor: pointer;
            user-select: none;
            }
        
    </style>
</head>
<body style="background-color:black" >
        <div class="box">
            <h1>생각 정리</h1>
            <br>
            <br>
        </div>
    <form action="../stage1/stage1-2.jsp">
        <button class="selectbox">
            <h4>
                집에 들어갈 수 있는 방법이 없을까?
            </h4>
        </button>
    </form>
    <script src="/test/scripts/stage1.js"></script>
</body>
</html>