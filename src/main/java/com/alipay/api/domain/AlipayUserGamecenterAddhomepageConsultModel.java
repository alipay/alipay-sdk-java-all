package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 玩一玩小程序是否已加首咨询
 *
 * @author auto create
 * @since 1.0, 2022-10-10 17:36:00
 */
public class AlipayUserGamecenterAddhomepageConsultModel extends AlipayObject {

	private static final long serialVersionUID = 7869328455618614427L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * openId
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
