<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .linesbox{
            position: relative;
            left: 0px;
            bottom: 0px;
            width: 60%;
            height: 20%;
            margin-bottom: 10px;
            margin-left: 3rem;
            margin-right: 5rem;
            padding-top: 1rem;
            padding-left: 1rem;
            position: fixed;
            color: white;
            font-style: oblique;
            font-size: 15px;
            background-color: plum;
            box-sizing: content-box;
            display: block;
            opacity: 0.5;
            border-radius: 15px;
        }
        .namebox{
            position: absolute;
            font-size: 15px;
            box-sizing: border-box;
            padding-top: 18px;
            padding-bottom: 18px;
            padding-left: 45px;
            padding-right: 45px;
            color: black;
            background-color: white;
            display: block;
            left: 1%;
            bottom: 22%;
            border-radius: 15px;
        }
        body{
            background-image:url('/Deep_sleep1/deep_sleep/images/stage1-2BackGround.jpg');
            background-repeat: no-repeat;
            background-size: 1800px;
        }
        .menubox{
            color: black;
            background-color: white;
            position: absolute;
            right: -6%;
            top: 5%;
            padding-right: 0px;
            margin-bottom: 5%;
            width: 15%;
            border-radius: 10px;
            overflow: hidden;
        }
        .submenu {
        height: 0;
        overflow: hidden;
        }
        .menubox > li {
        transition-duration: 0.5s;
        }
        .menubox > li .submenu {
        transition-duration: 0.5s;
        }
        .menubox > li:hover .submenu {
         height: 50px;
        }
        .timer{
            top: 0%;
            left: 50%;
        }
        .door{
            cursor:pointer;
            position: absolute;
            left: 12%;
            box-sizing: content-box;
            height: 720px;
            width: 330px;
            color: black;
        }
        .doorLock{
            cursor:pointer;
            position: absolute;
            left: 7.5%;
            bottom: 38%;
            box-sizing: content-box;
            height: 100px;
            width: 50px;
        }
        .upstair{
            cursor:pointer;
            position: absolute;
            right: 25%;
            top: 4%;
            box-sizing: content-box;
            height: 400px;
            width: 400px;
        }
        .downstair{
            cursor:pointer;
            position: absolute;
            right: 7%;
            bottom: 4%;
            box-sizing: content-box;
            height: 350px;
            width: 350px;
        }
        .clawHammer{
            cursor: pointer;
            position: absolute;
            right: 38%;
            bottom: 25%;
            box-sizing: content-box;
            height: 40px;
            width: 100px;
        }
        .temp{
            position: absolute;
            width: 75px;
            height: 75px;
            background-color: white;
        }
        #modal {
        position: fixed;
        z-index: 9999;
         top: 0;
         left: 0;
         width: 100%;
         height: 100%;
         overflow: hidden;
         display: none;
         background-color: rgba(0, 0, 0, 0.4);
         padding: 15%;
        }
        .modal-content {
            position: absolute;
            top: 0;
            left: 20%;
         background-color: rgba(0, 0, 0, 1);
         background-color: #fefefe;
         margin: 15% auto;
         padding: 20px;
         border: 1px solid #888;
         width: 30%;
         border-radius: 15px;
        }
        .close {
         color: #aaa;
        float: right;
        font-size: 28px;
        font-weight: bold;
        bottom: 20%;
        }
        .close:hover,
        .close:focus {
         color: black;
         text-decoration: none;
        cursor: pointer;
        }
        #modal2 {
        position: fixed;
        z-index: 9999;
         top: 0;
         left: 0;
         width: 100%;
         height: 100%;
         overflow: hidden;
         display: none;
         background-color: rgba(0, 0, 0, 0.4);
         padding: 15%;
        }

    </style>
    <!-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous"> -->
    <!-- <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script> -->
</head>
<body style="background-color:  black;">
    <div class="namebox"style="z-index: 2;">
        ???
    </div>
     <div class="linesbox" id="linebox" style="z-index: 1;">
    	무엇을 조사해볼까?
    </div>
    <ul class="menubox">
        <li>
          <a href="#">메뉴</a>
          <ul class="submenu">
            <li><a href="#"id="open-modal">단서 보기</a></li>
            <li><a href="#"id="open-modal2">결정적인 단서</a></li>
          </ul>
        </li>
    </ul>
    <div class="door" id='frontdoor'></div>
    <div class="doorLock" id='doorlock'></div>
    <div class="upstair" id='upstair'></div>
    <div class="downstair" id='downstair'></div>
    <div class="clawHammer" id='clawHammer'></div>
    <form action="/Deep_sleep1/deep_sleep/stage2/index.jsp">
        <button class="temp">임시버튼</button>
    </form>
    <div id="modal" class="modal">
        <div class="modal-content">
            <h2>단서 목록</h2>
            <p id='proviso_list'></p>
            <button id="close-modal">돌아가기</button>
        </div>
    </div>
    <div id="modal2" class="modal2">
        <div class="modal-content">
            <h2>결정적인 단서</h2>
            <p>결정적인 단서들 배열</p>
            <button id="close-modal2">돌아가기</button>
        </div>
    </div>
     <script src="/Deep_sleep1/deep_sleep/modal/modal.js"></script>
    <script src="/Deep_sleep1/deep_sleep/scripts/stage1/s1_2.js"></script>
   
      
    
</body>
</html>