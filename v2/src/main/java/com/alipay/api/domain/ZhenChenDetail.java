package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ZhenChenDetail是一个复制对象，一层套一层
 *
 * @author auto create
 * @since 1.0, 2023-03-28 16:40:00
 */
public class ZhenChenDetail extends AlipayObject {

	private static final long serialVersionUID = 1169725494236386178L;

	/**
	 * 是个串
	 */
	@ApiField("zhenchenstr")
	private String zhenchenstr;

	/**
	 * 祯宸时间参数
	 */
	@ApiField("zhenchentime")
	private Date zhenchentime;

	public String getZhenchenstr() {
		return this.zhenchenstr;
	}
	public void setZhenchenstr(String zhenchenstr) {
		this.zhenchenstr = zhenchenstr;
	}

	public Date getZhenchentime() {
		return this.zhenchentime;
	}
	public void setZhenchentime(Date zhenchentime) {
		this.zhenchentime = zhenchentime;
	}

}
