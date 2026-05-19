package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生智能体推荐卡
 *
 * @author auto create
 * @since 1.0, 2026-05-18 17:42:49
 */
public class YpzDoctorAgentCardOne extends AlipayObject {

	private static final long serialVersionUID = 2654324925587132923L;

	/**
	 * 智能助手功能描述
	 */
	@ApiField("describe")
	private String describe;

	/**
	 * 智能助手头像
	 */
	@ApiField("head")
	private String head;

	/**
	 * 智能助手链接
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
