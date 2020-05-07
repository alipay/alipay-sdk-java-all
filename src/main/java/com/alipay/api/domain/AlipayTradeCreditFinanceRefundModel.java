package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用交易金融退款接口
 *
 * @author auto create
 * @since 1.0, 2020-03-11 16:00:11
 */
public class AlipayTradeCreditFinanceRefundModel extends AlipayObject {

	private static final long serialVersionUID = 2818879558972321796L;

	/**
	 * 本次需要退款的金额，单位为元；精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种,CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 扩展参数，json结构体，例用前需要与支付宝工程师确认
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 退款备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部退款请求号，用于控制幂等
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 收款人信息
	 */
	@ApiField("payee_info")
	private CreditFinancePayAccountInfo payeeInfo;

	/**
	 * 本次需要进行金融处理的交易对应的交易的买家userId
	 */
	@ApiField("trade_buyer_id")
	private String tradeBuyerId;

	/**
	 * 需要进行金融处理的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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
