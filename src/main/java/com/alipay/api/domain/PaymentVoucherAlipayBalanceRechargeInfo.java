package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付券余额充值预算详情
 *
 * @author auto create
 * @since 1.0, 2022-02-23 14:16:47
 */
public class PaymentVoucherAlipayBalanceRechargeInfo extends AlipayObject {

	private static final long serialVersionUID = 2431127526831839651L;

	/**
	 * 出资的支付宝登录账号
限制:
1、登录账号和用户ID必须且只能二选一
	 */
	@ApiField("logon_id")
	private String logonId;

	/**
	 * 出资的支付宝用户id
限制:
1、登录账号和用户ID必须且只能二选一
	 */
	@ApiField("user_id")
	private String userId;

	public String getLogonId() {
		return this.logonId;
	}
	public void setLogonId(String logonId) {
		this.logonId = logonId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
