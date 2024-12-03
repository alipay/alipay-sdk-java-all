package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 初始化用户收款账号
 *
 * @author auto create
 * @since 1.0, 2024-10-25 14:09:26
 */
public class AlipayEbppIndustryJobPayslipInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 1166238151196435265L;

	/**
	 * 支付宝登录账号：手机号或者邮箱
	 */
	@ApiField("alipay_login_id")
	private String alipayLoginId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAlipayLoginId() {
		return this.alipayLoginId;
	}
	public void setAlipayLoginId(String alipayLoginId) {
		this.alipayLoginId = alipayLoginId;
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
