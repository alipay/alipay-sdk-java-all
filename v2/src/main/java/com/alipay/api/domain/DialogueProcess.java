package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 问诊过程
 *
 * @author auto create
 * @since 1.0, 2023-08-02 15:14:00
 */
public class DialogueProcess extends AlipayObject {

	private static final long serialVersionUID = 7685726264726498543L;

	/**
	 * 角色
	 */
	@ApiField("actor")
	private String actor;

	/**
	 * 发言内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 发言时间
	 */
	@ApiField("time")
	private Date time;

	/**
	 * 内容类型
取值与含义如下：
TEXT:文本
FILE:文件
	 */
	@ApiField("type")
	private String type;

	public String getActor() {
		return this.actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public Date getTime() {
		return this.time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
