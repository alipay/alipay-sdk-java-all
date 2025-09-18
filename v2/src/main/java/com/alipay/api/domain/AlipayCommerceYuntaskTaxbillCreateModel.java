package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户税筹创建签约吱口令
 *
 * @author auto create
 * @since 1.0, 2024-06-13 19:53:30
 */
public class AlipayCommerceYuntaskTaxbillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1497868479693936445L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 签约用户
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

}
