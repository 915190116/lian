<%--
  Created by IntelliJ IDEA.
  User: lian
  Date: 18-5-11
  Time: 下午1:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>asd</title>
</head>
<body onkeydown="Enter(event);">
<%--<form action="Http" method="post">--%>
<form>
    <%--账号:<input name="name" type="text"><br>--%>
    账号:<input id="u" type="text"><br>
    密码:<input id="p" type="password"><br>
    <%--<input type="submit" value="登录">--%>
    <input id="input" type="button" value="登录" onclick="fn()">
</form>
<script type="text/javascript" src="jquery-3.3.1.js"></script>

<script type="text/javascript">
    var u = document.getElementById("u");
    var p = document.getElementById("p");
    window.onload = function () {
        u.value = "";
        u.focus();
    };

    //回车事件
    function Enter(event) {
        if (event.keyCode == 13) {
            document.getElementById("input").click();
        }
    }
    function fn() {
        {
            if (u.value == "") {
                alert("请输入账号");
                u.focus();
            }else if (p.value == "") {
                alert("请输入密码");
                p.focus();
            } else {
                var data={"user": u.value,"pass":p.value};

                $.ajax({
                    url: "Http",//要传递参数的网址
                    contentType: "application/json; charset=utf-8",//向服务器传递参数的形式
                    type: "post",//请求方式
                    dataType: "json",//接受数据的形式
                    data: JSON.stringify(data),//发送的数据
                    //     {
                    //
                    //     // "user": u.value,
                    //     // "pass": p.value
                    // },

                    //接收服务器传送回来的数据
                    success: function (data) {
                        if (typeof (data["url"])!= "undefined") {
                            alert("登录成功,跳转的网址为"+data["url"]);
                            window.location.href = data["url"];
                        } else {
                            alert("账号或密码错误");
                        }
                    }
                });
            }
        }
    }
</script>
</body>
</html>
