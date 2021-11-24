package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户券详情
 *
 * @author auto create
 * @since 1.0, 2021-11-22 17:55:54
 */
public class AlipayMarketingActivityUserQueryvoucherModel extends AlipayObject {

	private static final long serialVersionUID = 8541239133383372952L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	/**
	 * 用户券id。支付宝为用户优惠券唯一分配的id。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
