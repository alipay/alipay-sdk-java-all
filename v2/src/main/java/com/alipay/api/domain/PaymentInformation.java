package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 一个支付中包含的内容，包括一个请求号、一个支付金额信息
 *
 * @author auto create
 * @since 1.0, 2019-09-30 18:01:59
 */
public class PaymentInformation extends AlipayObject {

	private static final long serialVersionUID = 2829251712333382854L;

	/**
	 * 处理行为，默认为PAY，也可以是FREEZE等等
	 */
	@ApiField("action")
	private String action;

	/**
	 * 支付的金额，比如{"FAMILY_POINT":2000}代表支付2000家庭积分，如果是现金单位元
	 */
	@ApiField("amount")
	private PriceInformation amount;

	/**
	 * 每个订单下面的支付请求号唯一即可，如果只是一次支付，建议可以直接用out_biz_no作为支付请求号
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public PriceInformation getAmount() {
		return this.amount;
	}
	public void setAmount(PriceInformation amount) {
		this.amount = amount;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
