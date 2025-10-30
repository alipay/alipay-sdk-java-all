package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用交易金融支付接口
 *
 * @author auto create
 * @since 1.0, 2022-12-08 13:31:24
 */
public class AlipayTradeCreditFinancePayModel extends AlipayObject {

	private static final long serialVersionUID = 1287458655597991474L;

	/**
	 * 本次需要支付的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 本次金融支付对应的业务类型,目前只支持BILL_REPAY: 用于采销宝账单还款后，交易打款前，驱动资金从买家子户到采销宝资产出资户
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 币种单位，目前只支持人民币CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 扩展参数，格式为json字符串
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部请求号，用于支付宝内部做幂等控制。同一笔trade_no下out_request_no不能相同，如果相同则代表是重复请求
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 收款人信息
	 */
	@ApiField("payee_info")
	private CreditFinancePayAccountInfo payeeInfo;

	/**
	 * 本次支付的付款人信息
	 */
	@ApiField("payer_info")
	private CreditFinancePayAccountInfo payerInfo;

	/**
	 * 本次支付的描述
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 本次金融付款交易的买家支付宝会员id
	 */
	@ApiField("trade_buyer_id")
	private String tradeBuyerId;

	/**
	 * 需要进行金融支付处理的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBusinessType() {
		return this.businessType;
	}
	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}

	public String getCurrency() {
		return this.currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public CreditFinancePayAccountInfo getPayeeInfo() {
		return this.payeeInfo;
	}
	public void setPayeeInfo(CreditFinancePayAccountInfo payeeInfo) {
		this.payeeInfo = payeeInfo;
	}

	public CreditFinancePayAccountInfo getPayerInfo() {
		return this.payerInfo;
	}
	public void setPayerInfo(CreditFinancePayAccountInfo payerInfo) {
		this.payerInfo = payerInfo;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTradeBuyerId() {
		return this.tradeBuyerId;
	}
	public void setTradeBuyerId(String tradeBuyerId) {
		this.tradeBuyerId = tradeBuyerId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
