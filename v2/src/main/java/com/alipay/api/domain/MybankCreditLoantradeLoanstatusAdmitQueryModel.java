package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户网商贷准入状态查询
 *
 * @author auto create
 * @since 1.0, 2026-02-03 15:17:44
 */
public class MybankCreditLoantradeLoanstatusAdmitQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7599498487585195868L;

	/**
	 * 支付宝Id,无需脱敏

	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝Id,无需脱敏
	 */
	@ApiField("open_id")
	private String openId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
