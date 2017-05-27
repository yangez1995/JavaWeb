var userPagination = 0;
var userAccountManagePagination = 1;
var userMessageManagePagination = 1;
$(document).ready(function() {
	//设置高度与浏览器同高
	$('#content').css('height', document.body.scrollHeight-60);

	//导航栏点击事件
	$('#nav-user-account-manage').click(function() {
		$('#breadcrumb-model').html('用户帐号管理');
		navClear();
		$('#nav-user-account-manage').removeClass('custom-nav-off');
		$('#nav-user-account-manage').addClass('custom-nav-on');
		$('#nav-user-account-manage-img').attr('src','resources/image/user-account-on.png')
		$('#user-account-manage').removeClass('hide');
	});
	$('#nav-user-message-manage').click(function() {
		$('#breadcrumb-model').html('用户信息管理');
		navClear();
		$('#nav-user-message-manage').removeClass('custom-nav-off');
		$('#nav-user-message-manage').addClass('custom-nav-on');
		$('#nav-user-message-manage-img').attr('src','resources/image/user-message-on.png')
		$('#user-message-manage').removeClass('hide');
	});
	$('#nav-authority-manage').click(function() {
		$('#breadcrumb-model').html('权限管理');
		navClear();
		$('#nav-authority-manage').removeClass('custom-nav-off');
		$('#nav-authority-manage').addClass('custom-nav-on');
		$('#nav-authority-manage-img').attr('src','resources/image/authority-on.png');
		$('#authorize-manage').removeClass('hide');
	});
	
	$.get('getUserPagination',function(result) {
		userPagination = result;
		refreshUserAccountManagePagination(userPagination);
		refreshUserMessageManagePagination(userPagination);
	});
	
	refreshUserAccountManageList();
	refreshUserMessageManageList();
});

//将所有导航按钮设置为默认样式，将所有表格设置为隐藏。
function navClear() {
	$('#nav-user-account-manage').removeClass('custom-nav-on');
	$('#nav-user-account-manage').addClass('custom-nav-off');
	$('#nav-user-account-manage-img').attr('src','resources/image/user-account-off.png');
	$('#user-account-manage').addClass('hide');
	$('#nav-user-message-manage').removeClass('custom-nav-on');
	$('#nav-user-message-manage').addClass('custom-nav-off');
	$('#nav-user-message-manage-img').attr('src','resources/image/user-message-off.png');
	$('#user-message-manage').addClass('hide');
	$('#nav-authority-manage').removeClass('custom-nav-on');
	$('#nav-authority-manage').addClass('custom-nav-off');
	$('#nav-authority-manage-img').attr('src','resources/image/authority-off.png');
	$('#authorize-manage').addClass('hide');
}

//刷新用户帐号管理表格页码
function refreshUserAccountManagePagination(pagination) {
	$('#user-account-manage-pagination').empty();
	if(pagination > 1) {
		$('#user-account-manage-pagination').append('<li id=\"uam-firstPage-li\"><a id=\"uam-firstPage\">&lt;&lt;</a></li>');
		$('#user-account-manage-pagination').append('<li id=\"uam-beforePage-li\"><a id=\"uam-beforePage\">&lt;</a></li>');
		for(var i = 1; i <= pagination; i++) {
			$('#user-account-manage-pagination').append('<li id=\"uam-page' + i + '-li\"><a id=\"uam-page' + i + '\">' + i + '</a></li>');
		}
		$('#user-account-manage-pagination').append('<li id=\"uam-nextPage-li\"><a id=\"uam-nextPage\">&gt;</a></li>');
		$('#user-account-manage-pagination').append('<li id=\"uam-lastPage-li\"><a id=\"uam-lastPage\">&gt;&gt;</a></li>');
	}
	if(userAccountManagePagination == 1) {
		$('#uam-firstPage-li').addClass('disabled');
		$('#uam-beforePage-li').addClass('disabled');
	}
	if(userAccountManagePagination == pagination) {
		$('#uam-nextPage-li').addClass('disabled');
		$('#uam-lastPage-li').addClass('disabled');
	}
	$('#uam-page' + userAccountManagePagination + '-li').addClass('active');
	
	$('#uam-firstPage').click(function() {
		userAccountManagePagination = 1;
		refreshUserAccountManagePagination(userPagination);
		refreshUserAccountManageList();
	});
	$('#uam-beforePage').click(function() {
		if(userAccountManagePagination != 1) {
			userAccountManagePagination -= 1;
			refreshUserAccountManagePagination(userPagination);
			refreshUserAccountManageList();
		}
	});
	$('#uam-nextPage').click(function() {
		if(userAccountManagePagination != userPagination) {
			userAccountManagePagination += 1;
			refreshUserAccountManagePagination(userPagination);
			refreshUserAccountManageList();
		}
	});
	$('#uam-lastPage').click(function() {
		userAccountManagePagination = userPagination;
		refreshUserAccountManagePagination(userPagination);
		refreshUserAccountManageList();
	});
}
//刷新用户帐号管理表格
function refreshUserAccountManageList() {
	$.post('getUserAccount', {"pageIndex":userAccountManagePagination}, function(result) {
		if(result.what == null || result.what != 403) {
			$('#user-account-list').empty();
			for(var i = 0; i < result.length; i++) {
				$('#user-account-list').append('<tr>' +
				                               '<td>' + result[i].id + '</td>' +
									    	   '<td>' + result[i].username + '</td>' +
											   '<td>' + checkNull(result[i].nickname) + '</td>' +
											   '<td>' + stateCodeTransition(result[i].state) + '</td>' +
											   '<td>' + roleCodeTransition(result[i].role) + '</td>' +
											   '<td><button>删除</button></td>' +
											   '</tr>');
			}
		}
	});
}

function roleCodeTransition(roleId) {
	switch(roleId) {
	case '1': return '超级管理员'; break;
	case '2': return '高级管理员'; break;
	case '3': return '管理员'; break;
	case '4': return '用户'; break;
	}
}
function stateCodeTransition(stateId) {
	switch(stateId) {
	case 0: return '离线'; break;
	case 1: return '在线'; break;
	}
}
//刷新用户信息管理表格页码
function refreshUserMessageManagePagination(pagination) {
	$('#user-message-manage-pagination').empty();
	if(pagination > 1) {
		$('#user-message-manage-pagination').append('<li id=\"umm-firstPage-li\"><a id=\"umm-firstPage\">&lt;&lt;</a></li>');
		$('#user-message-manage-pagination').append('<li id=\"umm-beforePage-li\"><a id=\"umm-beforePage\">&lt;</a></li>');
		for(var i = 1; i <= pagination; i++) {
			$('#user-message-manage-pagination').append('<li id=\"umm-page' + i + '-li\"><a id=\"umm-page' + i + '\">' + i + '</a></li>');
		}
		$('#user-message-manage-pagination').append('<li id=\"umm-nextPage-li\"><a id=\"umm-nextPage\">&gt;</a></li>');
		$('#user-message-manage-pagination').append('<li id=\"umm-lastPage-li\"><a id=\"umm-lastPage\">&gt;&gt;</a></li>');
	}
	if(userAccountManagePagination == 1) {
		$('#umm-firstPage-li').addClass('disabled');
		$('#umm-beforePage-li').addClass('disabled');
	}
	if(userAccountManagePagination == pagination) {
		$('#umm-nextPage-li').addClass('disabled');
		$('#umm-lastPage-li').addClass('disabled');
	}
	$('#umm-page' + userMessageManagePagination + '-li').addClass('active');
	
	$('#umm-firstPage').click(function() {
		userMessageManagePagination = 1;
		refreshUserAccountManagePagination(userPagination);
		refreshUserAccountManageList();
	});
	$('#umm-beforePage').click(function() {
		if(userMessageManagePagination != 1) {
			userMessageManagePagination -= 1;
			refreshUserAccountManagePagination(userPagination);
			refreshUserAccountManageList();
		}
	});
	$('#umm-nextPage').click(function() {
		if(userMessageManagePagination != userPagination) {
			userMessageManagePagination += 1;
			refreshUserAccountManagePagination(userPagination);
			refreshUserAccountManageList();
		}
	});
	$('#umm-lastPage').click(function() {
		userMessageManagePagination = userPagination;
		refreshUserAccountManagePagination(userPagination);
		refreshUserAccountManageList();
	});
}
//刷新用户帐号管理表格
function refreshUserMessageManageList() {
	$.post('getUserMessage', {"pageIndex":userMessageManagePagination}, function(result) {
		$('#user-message-list').empty();
		for(var i = 0; i < result.length; i++) {
			$('#user-message-list').append('<tr>' +
			                               '<td>' + result[i].id + '</td>' +
								    	   '<td>' + result[i].username + '</td>' +
										   '<td>' + checkNull(result[i].nickname) + '</td>' +
										   '<td>' + checkNull(result[i].userMessage.phoneNumber) + '</td>' +
										   '<td>' + checkNull(result[i].userMessage.email) + '</td>' +
										   '<td><button>修改</button><button>删除</button></td>' +
										   '</tr>');
		}
	});
}

function checkNull(str) {
	if(str == null || str == '') {
		return '尚未填写';
	} else {
		return str;
	}
}

//全局点击事件
$(document).click(function(e) {
	var clickId = $(e.target).attr('id'); 
	if(clickId != null) {
		if(clickId.substr(0,4) == 'uam-') {
			if(clickId.substr(4,4) == 'page') {
				userAccountManagePagination = clickId.charAt(8);
				refreshUserAccountManagePagination(userPagination);
				refreshUserAccountManageList();
			}
		}
		if(clickId.substr(0,4) == 'umm-') {
			if(clickId.substr(4,4) == 'page') {
				userMessageManagePagination = clickId.charAt(8);
				refreshUserMessageManagePagination(userPagination);
				refreshUserMessageManageList();
			}
		}
	}
})