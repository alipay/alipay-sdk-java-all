package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户个人信息查询
 *
 * @author auto create
 * @since 1.0, 2025-11-20 10:57:41
 */
public class AlipayCommerceMedicalAqUserinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5195533384343817164L;

	/**
	 * 用户当前2088
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 用户当前2088
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
