package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单支付工具请求信息，支持现金、商户预付卡、支付宝、银行卡、其他第三方支付工具信息。
 *
 * @author auto create
 * @since 1.0, 2019-04-09 16:58:09
 */
public class PaytoolRequestDetail extends AlipayObject {

	private static final long serialVersionUID = 3126319619454425296L;

	/**
	 * 支付工具金额。单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 付款方身份识别信息
	 */
	@ApiField("payer_identity")
	private UserIdentity payerIdentity;

	/**
	 * 商户支付工具单据号。注：不同的请求需更换不同的paytool_request_no，否则视为幂等请求
	 */
	@ApiField("paytool_request_no")
	private String paytoolRequestNo;

	/**
	 * 支付宝统一分配的支付工具编码;
现金:CASH;支付宝:ALIPAY,营销:TMARKETING;POS支付:POS,商户预付卡:MERCHANT_MCARD,OTHER:其他。注：通常情况下不传入OTHER，若需传入，请与接口owner联系确认
	 */
	@ApiField("tool_code")
	private String toolCode;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public UserIdentity getPayerIdentity() {
		return this.payerIdentity;
	}
	public void setPayerIdentity(UserIdentity payerIdentity) {
		this.payerIdentity = payerIdentity;
	}

	public String getPaytoolRequestNo() {
		return this.paytoolRequestNo;
	}
	public void setPaytoolRequestNo(String paytoolRequestNo) {
		this.paytoolRequestNo = paytoolRequestNo;
	}

	public String getToolCode() {
		return this.toolCode;
	}
	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

}
