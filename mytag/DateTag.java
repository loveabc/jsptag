package com.taglib.mytag;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class DateTag extends TagSupport {

	/**
	 * 显示内容
	 */
	private static final long serialVersionUID = -6101513716591297946L;

	@Override
	public int doStartTag() throws JspException {
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateStr=format.format(new Date());
		try {
			this.pageContext.getOut().print(dateStr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.doStartTag();
	}
}
