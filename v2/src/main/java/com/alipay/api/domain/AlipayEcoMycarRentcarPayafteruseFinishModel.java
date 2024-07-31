package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车先享后付完结接口
 *
 * @author auto create
 * @since 1.0, 2023-12-05 14:27:22
 */
public class AlipayEcoMycarRentcarPayafteruseFinishModel extends AlipayObject {

	private static final long serialVersionUID = 6182523169476547959L;

	/**
	 * 用户此订单是否守约。
传true时，用户在芝麻信用-守约记录中，该笔订单是已守约状态；
传false时，用户在芝麻信用-守约记录中，该笔订单是已取消状态。
	 */
	@ApiField("is_fulfilled")
	private Boolean isFulfilled;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Boolean getIsFulfilled() {
		return this.isFulfilled;
	}
	public void setIsFulfilled(Boolean isFulfilled) {
		this.isFulfilled = isFulfilled;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
