<!DOCTYPE html>
<%@taglib uri="/imooc" prefix="imooc"%>
<%@ page contentType="text/html;charset=utf-8"%>  
<html>
<head>
<meta charset="UTF-8">
<title>title</title>
</head>

<body>
	hello world
	${time }
	<div id="time"></div>
	<form action="upload" method="post" enctype="multipart/form-data">
		<input type="file" name="img"/>
		<input type="submit" value="上传"/>
	</form>
	<form action="mulUpload" method="post" enctype="multipart/form-data">
		<input type="file" name="img1"/>
		<input type="file" name="img2"/>
		<input type="submit" value="上传"/>
	</form>
	<input type="button" value="ajax" id="test"><br/>
	<imooc:EndTag password="mysql" username="root"/>
	<imooc:Date/><br/>
	<imooc:IncludeOrSkipBody>
		<h2>显示标签体</h2>
	</imooc:IncludeOrSkipBody>
</body>
<script type="text/javascript" src="resources/jquery-1.8.0.min.js"></script>
<script type="text/javascript">
	$("#test").click(function(){
		$.ajax({
			type : "POST",
			url : "ajax",
			data : "id=100&command=joke&content=one joke",
			success : function(msg) {
				$("#time").text(msg)
			}
		});
		
	});
</script>
</html>