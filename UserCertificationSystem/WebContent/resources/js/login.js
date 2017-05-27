$(document).ready(function() {
	$(function () { $("[data-toggle='tooltip']").tooltip(); });
	$('#login').click(function() {
		/**
		 * 验证用户名
		 */
		if($('#username').val() == '' || $('#username').val() == null) {
			$('#tips').html('用户名不能为空！');
			$('#username-group').addClass('has-error');
			return false;
		} else if($('#username').val().length < 6 || $('#username').val().length > 30) {
			$('#tips').html('用户名长度在6-30字节之间！');
			$('#username-group').addClass('has-error');
			return false;
		} else {
			$('#tips').html('');
			$('#username-group').removeClass('has-error');
		}
		/**
		 * 验证密码
		 */
		if($('#password').val() == '' || $('#password').val() == null) {
			$('#tips').html('密码不能为空！');
			$('#password-group').addClass('has-error');
			return false;
		} else if($('#password').val().length < 6 || $('#password').val().length > 16) {
			$('#tips').html('密码长度在6-16字节之间！');
			$('#password-group').addClass('has-error');
			return false;
		} else {
			$('#tips').html('');
			$('#password-group').removeClass('has-error');
		}
		
		$('#f-login').submit();
		
		/*$('#login').attr('disabled',true);
		$('#login').html("提交中...");
		$.post('userLogin',$('#f-login').serialize(),function(result) {
			$('#login').attr('disabled',false);
			$('#login').html('登录');
		},'json');*/
	});
});