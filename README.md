# jsptag
自定义jsp标签

步骤：<br/>
1、创建标签类继承TagSupport类，重写doStartTag()或/和doEndTag()方法<br/>
2、在WEB-INF目录获取子目录下创建tld文件，注册新创建的标签类<br/>
3、在jsp页面使用<%@ taglib uri="" prefix=""%>引入标签，然后jsp页面就能使用新定义的标签了
