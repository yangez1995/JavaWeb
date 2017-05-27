<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<title>用户注册</title>
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<script src="https://code.jquery.com/jquery.js"></script>
		<script src="resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
	</head>
	<body background="resources/image/background.png">
	    <div class="container">
			<div class="row">
				<div class="col-lg-4 col-md-4 col-sm-3 col-xs-2"></div>
				<div class="col-lg-4 col-md-4 col-sm-6 col-xs-8" style="margin-top: 15%;border: #F5F5F5 solid 2px;border-radius: 5px;background: #FCFCFC;">
					<form class="form-horizontal" role="form" style="padding-bottom: 30px">
						<h2 class="text-center">注册</h2>
						<hr style="border: #DDDDDD solid 1px;" />
						<div class="form-group" style="padding-left: 20%;padding-right: 20%;">
							<span style="line-height: 30px;">用户名(手机/邮箱/用户名)</span>
							<input type="text" class="form-control" placeholder="请输入用户名">
						</div>
						<div class="form-group" style="padding-left: 20%;padding-right: 20%;">
							<span style="line-height: 30px;">密码</span>
							<input type="password" class="form-control" placeholder="请输入密码">
							<input type="password" class="form-control" placeholder="请确认密码" style="margin-top: 10px;">
						</div>	
						<hr style="border: #DDDDDD solid 1px;" />
						<div class="form-group" style="margin-top: 20px;padding-left: 20%;padding-right: 20%;">
							<button class="btn" style="width: 100%;background: #00B2EE;color: #FCFCFC;font-family: Microsoft YaHei;font-size: 17px;">注册</button>
						</div>
					</form>
				</div>
				<div class="col-lg-4 col-md-4 col-sm-3 col-xs-2"></div>
			</div>
	    </div>
	</body>
</html>