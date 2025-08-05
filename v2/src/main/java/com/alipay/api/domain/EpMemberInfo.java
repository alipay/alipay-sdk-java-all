package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业成员信息
 *
 * @author auto create
 * @since 1.0, 2024-12-19 14:25:09
 */
public class EpMemberInfo extends AlipayObject {

	private static final long serialVersionUID = 7885728699879196933L;

	/**
	 * 成员职务
	 */
	@ApiField("duty")
	private String duty;

	/**
	 * 成员姓名
	 */
	@ApiField("member")
	private String member;

	public String getDuty() {
		return this.duty;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getMember() {
		return this.member;
	}
	public void setMember(String member) {
		this.member = member;
	}

}
