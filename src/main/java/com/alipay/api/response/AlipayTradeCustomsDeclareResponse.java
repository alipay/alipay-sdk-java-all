package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.customs.declare response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-28 14:01:57
 */
public class AlipayTradeCustomsDeclareResponse extends AlipayResponse {

	private static final long serialVersionUID = 3222866475646328911L;

	/** 
	 * 支付宝报关流水号。
	 */
	@ApiField("alipay_declare_no")
	private String alipayDeclareNo;

	/** 
	 * 币种
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 订购人身份信息和支付人的身份信息验证结果。T表示商户传入的订购人姓名和身份证号和支付人的姓名和身份证号一致。F代表商户传入的订购人姓名和身份证号和支付人的姓名和身份证号不一致。对于同一笔报关单支付宝只会校验一次，如果多次重推不会返回此参数。
	 */
	@ApiField("identity_check")
	private String identityCheck;

	/** 
	 * 支付机构注册号
	 */
	@ApiField("pay_code")
	private String payCode;

	/** 
	 * 清算流水号
	 */
	@ApiField("pay_transaction_id")
	private String payTransactionId;

	/** 
	 * 交易总金额(单位:分)
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝推送到海关的支付单据号。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 清算机构标志（1-cup,2-null,3-other）
	 */
	@ApiField("ver_dept")
	private String verDept;

	public void setAlipayDeclareNo(String alipayDeclareNo) {
		this.alipayDeclareNo = alipayDeclareNo;
	}
	public String getAlipayDeclareNo( ) {
		return this.alipayDeclareNo;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setIdentityCheck(String identityCheck) {
		this.identityCheck = identityCheck;
	}
	public String getIdentityCheck( ) {
		return this.identityCheck;
	}

	public void setPayCode(String payCode) {
		this.payCode = payCode;
	}
	public String getPayCode( ) {
		return this.payCode;
	}

	public void setPayTransactionId(String payTransactionId) {
		this.payTransactionId = payTransactionId;
	}
	public String getPayTransactionId( ) {
		return this.payTransactionId;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setVerDept(String verDept) {
		this.verDept = verDept;
	}
	public String getVerDept( ) {
		return this.verDept;
	}

}
