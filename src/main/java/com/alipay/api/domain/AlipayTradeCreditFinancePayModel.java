package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用交易金融支付接口
 *
 * @author auto create
 * @since 1.0, 2020-03-11 16:00:38
 */
public class AlipayTradeCreditFinancePayModel extends AlipayObject {

	private static final long serialVersionUID = 3445851988821384498L;

	/**
	 * 本次需要支付的金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 本次金融支付对应的业务类型,本次对应：
BILL_REPAY:账单还款后打款
	 */
	@ApiField("business_type")
	private String businessType;

	/**
	 * 币种，CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 扩展参数，json结构体，具体值需要联系支付宝工程师确认
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部请求号，用于控制幂等
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

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
