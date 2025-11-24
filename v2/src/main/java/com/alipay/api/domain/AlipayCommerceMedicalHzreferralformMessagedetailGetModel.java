package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 转诊消息发送信息获取
 *
 * @author auto create
 * @since 1.0, 2025-10-27 11:02:39
 */
public class AlipayCommerceMedicalHzreferralformMessagedetailGetModel extends AlipayObject {

	private static final long serialVersionUID = 7358295885541266425L;

	/**
	 * 跳转智能体时的自动query
	 */
	@ApiField("query")
	private String query;

	/**
	 * 加密后的转诊单ID
	 */
	@ApiField("referral_from_id")
	private String referralFromId;

	public String getQuery() {
		return this.query;
	}
	public void setQuery(String query) {
		this.query = query;
	}

	public String getReferralFromId() {
		return this.referralFromId;
	}
	public void setReferralFromId(String referralFromId) {
		this.referralFromId = referralFromId;
	}

}
