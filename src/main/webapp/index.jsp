<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="https://cdn.bootcss.com/jquery/2.2.4/jquery.js"></script>
<html>
<body>
<h2>计算器</h2>
<input id="a">+<input id="b"><input type="button" value="=" onclick="doajax()"><input id="sum">
</body>
</html>
<script>
    function doajax() {
        var v1= $("#a").val();
        var v2= $("#b").val();
        var obj={};
        obj.a=v1;
        obj.b=v2;
        var json =JSON.stringify(obj);

        $.ajax({
            type:"POST",
            url:"sum.do",
            contentType:"application/json;charset=utf-8",
            data:json,
            dataType:"json",
            success:function (data) {
                $("#sum").val(data.result)
            }
        })
    }
</script>