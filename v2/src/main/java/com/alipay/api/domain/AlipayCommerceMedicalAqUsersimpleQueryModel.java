package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * aq会员基础信息查询
 *
 * @author auto create
 * @since 1.0, 2025-12-19 11:52:41
 */
public class AlipayCommerceMedicalAqUsersimpleQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1833683145537113531L;

	/**
	 * 用户当前2088
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 用户当前2089
	 */
	@ApiField("aq_user_id")
	private String aqUserId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getAqUserId() {
		return this.aqUserId;
	}
	public void setAqUserId(String aqUserId) {
		this.aqUserId = aqUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

}
