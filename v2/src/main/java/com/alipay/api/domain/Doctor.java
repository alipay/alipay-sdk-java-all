package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能体基本信息
 *
 * @author auto create
 * @since 1.0, 2025-07-17 10:21:02
 */
public class Doctor extends AlipayObject {

	private static final long serialVersionUID = 8143232223319541817L;

	/**
	 * 功能描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 头像
	 */
	@ApiField("head")
	private String head;

	/**
	 * 链接
	 */
	@ApiField("link")
	private String link;

	public String getDescribe() {
		return this.describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getHead() {
		return this.head;
	}
	public void setHead(String head) {
		this.head = head;
	}

	public String getLink() {
		return this.link;
	}
	public void setLink(String link) {
		this.link = link;
	}

}
