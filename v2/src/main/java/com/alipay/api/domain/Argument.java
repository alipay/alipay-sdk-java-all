package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参数配置
 *
 * @author auto create
 * @since 1.0, 2023-08-10 13:44:26
 */
public class Argument extends AlipayObject {

	private static final long serialVersionUID = 1462559825291823475L;

	/**
	 * 用户的自定义参数内容
	 */
	@ApiField("args")
	private String args;

	/**
	 * 更新时间（格式为时间戳）
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 该字段为自定义参数的名称
	 */
	@ApiField("name")
	private String name;

	public String getArgs() {
		return this.args;
	}
	public void setArgs(String args) {
		this.args = args;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
