package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝租车先享后付扣款
 *
 * @author auto create
 * @since 1.0, 2024-01-31 10:55:09
 */
public class AlipayEcoMycarRentcarPayafterusePayModel extends AlipayObject {

	private static final long serialVersionUID = 6438551166863315544L;

	/**
	 * 扣款金额，单位分
	 */
	@ApiField("deduct_amount")
	private Long deductAmount;

	/**
	 * 支付宝用户开放平台id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 商户订单号，注意先享后付扣款只能发起一次。车生活侧通过此字段保证幂等
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 此次扣款的商户侧交易号，通过此字段进行扣款请求幂等控制
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Long getDeductAmount() {
		return this.deductAmount;
	}
	public void setDeductAmount(Long deductAmount) {
		this.deductAmount = deductAmount;
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

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
