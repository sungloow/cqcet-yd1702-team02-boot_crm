<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>登录</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/css/style.css"
	type=text/css rel=stylesheet>
<link href="${pageContext.request.contextPath}/css/boot-crm.css"
	type=text/css rel=stylesheet>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js">
</script>
<meta content="MSHTML 6.00.2600.0" name=GENERATOR>
<script>
// 判断是登录账号和密码是否为空
function check(){
    var usercode = $("#usercode").val();
    var password = $("#password").val();
    if(usercode=="" || password==""){
    	$("#message").text("账号或密码不能为空！");
        return false;
    }  
    return true;
}
</script>
<style type="text/css">
body {

	background: #bdc3c7;  /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #2c3e50, #bdc3c7);  /* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #2c3e50, #bdc3c7); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */

}
</style>
</head>
<body leftMargin=0 topMargin=0 marginwidth="0" marginheight="0"
<%-- 	background="${pageContext.request.contextPath}/images/rightbg.jpg"
 --%>	
 >
	<div ALIGN="center">
		<table border="0" width="1140px" cellspacing="0" cellpadding="0"
			id="table1">
			<tr>
				<td height="93"></td>
				<td></td>
			</tr>
			<tr>
				<td
					<%-- background="${pageContext.request.contextPath}/images/rights.jpg" --%>
					width="740" height="412"></td>
				<td class="login_msg" width="400" align="center">
					<!-- margin:0px auto; 控制当前标签居中 -->
					<fieldset style="width: auto; margin: 0px auto;">
						<legend>
							<font style="font-size: 15px" face="宋体"> 欢迎使用BOOT客户管理系统 </font>
						</legend>
						<font color="red"> <%-- 提示信息--%> <span id="message">${msg}</span>
						</font>
						<%-- 提交后的位置：/WEB-INF/jsp/customer.jsp--%>
						<form action="${pageContext.request.contextPath }/login.action"
							method="post" onsubmit="return check()">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br />
							<br /> 账&nbsp;号：<input id="usercode" type="text" name="usercode" />
							<br />
							<br /> 密&nbsp;码：<input id="password" type="password" name="password" /> 
							<br />
							<br /> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<center>
								<input type="submit" value="登录" />
							</center>
						</form>
					</fieldset>
				</td>
			</tr>
		</table>
	</div>
	<p class="copyright" style="width: 600px;margin-left: -300px;text-align:center;position:absolute;left: 50%;bottom:30px;" >
	版权所有&copy;CQCET-移动应用开发1702班-Team02&nbsp;
	<a bindanchor='1' target="_blank" href="https://github.com/SunRedSoldier/cqcet-yd1702-team02-boot_crm">
		渝ICP备2333333号
	</a>
</p>
	
</body>
</html>
