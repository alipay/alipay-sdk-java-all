package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营商行业信用购提前结清订单创建
 *
 * @author auto create
 * @since 1.0, 2025-03-03 14:20:22
 */
public class AlipayCommerceAcommunicationCreditphonePayinadvanceCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3762219577979654643L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝主单号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 当期外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 提前结清金额，单位元
	 */
	@ApiField("pay_in_advance_amount")
	private String payInAdvanceAmount;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayOrderNo() {
		return this.alipayOrderNo;
	}
	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPayInAdvanceAmount() {
		return this.payInAdvanceAmount;
	}
	public void setPayInAdvanceAmount(String payInAdvanceAmount) {
		this.payInAdvanceAmount = payInAdvanceAmount;
	}

}
