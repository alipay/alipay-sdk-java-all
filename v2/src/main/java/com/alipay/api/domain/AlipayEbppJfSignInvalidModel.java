package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费户号代扣解约
 *
 * @author auto create
 * @since 1.0, 2023-08-21 09:55:58
 */
public class AlipayEbppJfSignInvalidModel extends AlipayObject {

	private static final long serialVersionUID = 1326153532439826267L;

	/**
	 * 生活缴费代扣协议ID
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementId() {
		return this.agreementId;
	}
	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
