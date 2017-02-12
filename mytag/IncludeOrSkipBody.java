package com.taglib.mytag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;
/*
 * 是否显示标签体的内容
 */
public class IncludeOrSkipBody extends TagSupport {

	/**
	 * 控制标签体内的内容是否显示
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		//获取前台传递的参数
		String name=this.pageContext.getRequest().getParameter("name");
		//前台传值name=imooc显示标签体内容,否则不显示
		//可以用于权限判断
		if("imooc".equals(name)){
			return EVAL_BODY_INCLUDE;
		}
		return SKIP_BODY;
	}
}
