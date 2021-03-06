<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="zh-CN">
	<head>
		<title>用户登录</title>
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://code.jquery.com/jquery.js"></script>
		<script src="resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
		<script src="resources/bootstrap-3.3.7/js/bootstrap.js"></script>
		<script src="resources/js/login.js"></script>
	</head>
	<body background="resources/image/background.png">
	    <div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-4 col-sm-3 col-xs-2"></div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-8" style="margin-top: 15%;border: #F5F5F5 solid 2px;border-radius: 5px;background: #FCFCFC;">
					<form class="form-horizontal" id="f-login" method="post" action="login" role="form" style="padding-bottom: 30px">
						<h2 class="text-center">登录</h2>
						<hr style="border: #DDDDDD solid 1px;" />
						<div class="form-group" id="username-group" style="padding-left: 20%;padding-right: 20%;">
							<span style="line-height: 30px;">用户名(手机/邮箱/用户名)</span>
							<input class="form-control text-danger" id="username" name="username" type="text"  placeholder="请输入用户名">
						</div>
						<div class="form-group" id="password-group" style="padding-left: 20%;padding-right: 20%;">
							<span style="line-height: 30px;">密码</span>
							<span id="forget-password" style="float: right;line-height: 30px;color: #27408B;cursor: pointer;">忘记密码?</span>
							<input class="form-control" id="password" name="password" type="password" placeholder="请输入密码">
						</div>	
						<h5 class="text-center text-danger" id="tips"></h5>
						<hr style="border: #DDDDDD solid 1px;" />
						<div class="form-group" style="margin-top: 20px;padding-left: 20%;padding-right: 20%;">
							<button class="btn" id="login" style="width: 100%;background: #00B2EE;color: #FCFCFC;font-family: Microsoft YaHei;font-size: 17px;">登录</button>
						</div>
						<div class="form-group" id="regist" style="margin-top: 20px;padding-left: 20%;padding-right: 20%;">
							<button class="btn" style="width: 100%;font-family: Microsoft YaHei;font-size: 17px;">注册</button>
						</div>
					</form>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-3 col-xs-2"></div>
			</div>
	    </div>
	</body>
</html>