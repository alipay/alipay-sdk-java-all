package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 校验支付宝绑定手机号是否有充值记录
 *
 * @author auto create
 * @since 1.0, 2019-09-27 16:47:28
 */
public class AlipayEbppRechargeTradeDetectModel extends AlipayObject {

	private static final long serialVersionUID = 5496844249462399165L;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
