<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>      
<!DOCTYPE html>
<html lang="zh-CN">
	<head>
		<title>用户管理</title>
		<meta http-equiv="X-UA-Compatible" content="IE=Edge">
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">
		<link href="resources/css/admin.css" rel="stylesheet">
		<script src="https://code.jquery.com/jquery.js"></script>
		<script src="resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
		<script src="resources/js/admin.js"></script>
	</head>
	<body>
		<div class="container-fluid" style="height: 60px;padding: 0px;background: #444444;">
			<div style="float: left;width: 240px;height: 100%;padding-left: 20px;background: #444444;border-right: #222222 solid 1px;">
				<img id="" src="resources/image/default-head.png" style="width: 40px;height: 40px;border-radius: 20px;">
				<span style="margin-left: 5px;line-height: 60px;color: #FCFCFC;font-size: 14px;">试一试八个字多长</span>
				<span style="margin-left: 5px;line-height: 60px;color: #FCFCFC;font-size: 14px;cursor: pointer;">[注销]</span>
			</div>
			<div style="float: left;height: 100%;padding-top: 10px;padding-left: 10px;">
				<ol class="breadcrumb" id="breadcrumb">
					<li>后台管理</li>
					<li id="breadcrumb-model">用户管理</li>
					<li class="active">1</li>
				</ol>
			</div>
		</div>
		<div class="container-fluid" id="content" style="padding: 0px;">
			<div style="position: relative;height: 100%;width: 240px;float: left;background-color: #555566;z-index: 100;">
				<sec:authorize access="hasRole('ROLE_MANAGE_USER_ACCOUNT')">
					<button class="custom-nav-on" id="nav-user-account-manage">
						<img id="nav-user-account-manage-img" src="resources/image/user-account-on.png">
						<span>用户帐号管理</span>
					</button>
				</sec:authorize>
				<button class="custom-nav-off" id="nav-user-message-manage">
					<img id="nav-user-message-manage-img" src="resources/image/user-message-off.png">
					<span>用户信息管理</span>
				</button>
				<sec:authorize access="hasRole('ROLE_MANAGE_USER_ACCOUNT')">
					<button class="custom-nav-off" id="nav-authority-manage">
						<img id="nav-authority-manage-img" src="resources/image/authority-off.png">
						<span>权限管理</span>
					</button>
				</sec:authorize>
			</div>
			<div class="container-fluid" style="position: relative;padding-left: 255px;width: 100%;height: 100%;background: #FCFCFC;z-index: 90;">
				<sec:authorize access="hasRole('ROLE_MANAGE_USER_ACCOUNT')">
					<div class="" id="user-account-manage">
						<table class="table table-striped table-bordered" style="margin-top: 15px;margin-bottom: 10px;">
							<thead>
								<tr>
									<th>ID</th>
									<th>用户名</th>
									<th>昵称</th>
									<th>状态</th>
									<th>角色</th>
									<th width="80px" style="text-align: center;">选项</th>
								</tr>
							</thead>
							<tbody id="user-account-list"></tbody>
						</table>
						<ul class="pagination pull-right" id="user-account-manage-pagination" style="margin-top: 0px;"></ul>
					</div>
				</sec:authorize>
				<sec:authorize access="hasAnyRole('ROLE_MANAGE_USER_ACCOUNT','ROLE_UPDATE_USER_MESSAGE')">
					<div class="hide" id="user-message-manage">
						<table class="table table-striped table-bordered" style="margin-top: 15px;margin-bottom: 10px;">
							<thead>
								<tr>
									<th>ID</th>
									<th>用户名</th>
									<th>昵称</th>
									<th>手机</th>
									<th>邮箱</th>
									<th width="160px" style="text-align: center;">选项</th>
								</tr>
							</thead>
							<tbody id="user-message-list"></tbody>
						</table>
						<ul class="pagination pull-right" id="user-message-manage-pagination" style="margin-top: 0px;"></ul>
					</div>
				</sec:authorize>
				<sec:authorize access="hasRole('ROLE_MANAGE_USER_ACCOUNT')">
					<div class="hide" id="authorize-manage">
						<table class="table table-striped table-bordered" style="margin-top: 15px;margin-bottom: 10px;">
							<thead>
								<tr>
									<th>ID</th>
									<th>用户名</th>
									<th>昵称</th>
									<th>手机</th>
									<th>邮箱</th>
									<th>选项</th>
								</tr>
							</thead>
							<tbody id="authorize-list"></tbody>
						</table>
						<ul class="pagination pull-right" id="authorize-manage-pagination" style="margin-top: 0px;"></ul>
					</div>
				</sec:authorize>
			</div>
		</div>
	</body>
</html>