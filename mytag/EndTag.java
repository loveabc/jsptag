package com.taglib.mytag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * doEndTag()方法返回SKIP_BODY,则该标签后面的内容不再显示
 */
public class EndTag extends TagSupport{

	/**
	 * 控制标签结束之后,标签后面的内容是否显示
	 */
	
	//属性名和标签的属性名一致,并且提供setter方法,即可获取标签里面的属性值
	private String sql;
	private String username;
	private String password;
	private static final long serialVersionUID = 1L;

	@Override
	public int doEndTag() throws JspException {
		//拿到自定义标签中的属性值
		System.out.println(this.sql+"  "+this.username+"  "+this.password);
		String view=this.pageContext.getRequest().getParameter("viewff");
		if("ignore".equals(view)){
			return SKIP_PAGE;
		}
		return EVAL_PAGE;
	}

	public String getSql() {
		return sql;
	}

	public void setSql(String sql) {
		this.sql = sql;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
