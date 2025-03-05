package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭成员列表
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:28:27
 */
public class AlipayCommerceMedicalEbbenefitMemberQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7584376781712798456L;

	/**
	 * 外部自有会员Id，无特殊校验
	 */
	@ApiField("eb_user_id")
	private String ebUserId;

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

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

}
