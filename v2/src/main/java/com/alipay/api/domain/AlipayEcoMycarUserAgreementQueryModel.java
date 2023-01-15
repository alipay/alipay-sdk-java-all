package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户授权状态API
 *
 * @author auto create
 * @since 1.0, 2022-11-16 15:02:49
 */
public class AlipayEcoMycarUserAgreementQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3395943152142936431L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 应用维度用户ID，唯一标识
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
