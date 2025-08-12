package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取家庭成员信息
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:27:56
 */
public class AlipayCommerceMedicalEbbenefitMemberGetModel extends AlipayObject {

	private static final long serialVersionUID = 5197335817333131988L;

	/**
	 * 会员id
	 */
	@ApiField("eb_user_id")
	private String ebUserId;

	/**
	 * 支付宝家庭成员id
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 外部自有用户id，无特殊校验
	 */
	@ApiField("out_user_id")
	private String outUserId;

	public String getEbUserId() {
		return this.ebUserId;
	}
	public void setEbUserId(String ebUserId) {
		this.ebUserId = ebUserId;
	}

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
