package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 苹果NPI会场分期专享额度券查询
 *
 * @author auto create
 * @since 1.0, 2026-08-13 16:29:30
 */
public class AlipayPcreditHuabeiAppleVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3439124636686558794L;

	/**
	 * 不同活动传不同活动id，本系统根据活动id过滤苹果活动券
	 */
	@ApiField("amount_activity_id")
	private String amountActivityId;

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

	public String getAmountActivityId() {
		return this.amountActivityId;
	}
	public void setAmountActivityId(String amountActivityId) {
		this.amountActivityId = amountActivityId;
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
