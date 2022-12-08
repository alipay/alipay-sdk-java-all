package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心充余额提现
 *
 * @author auto create
 * @since 1.0, 2022-11-18 17:27:14
 */
public class AlipayCommercePayforprivilegeBalanceWithdrawModel extends AlipayObject {

	private static final long serialVersionUID = 7823415741177565946L;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 提现金额，单位元。需要小于余额中可提现金额
	 */
	@ApiField("withdraw_amount")
	private String withdrawAmount;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getWithdrawAmount() {
		return this.withdrawAmount;
	}
	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}

}
