package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用交易金融退款接口
 *
 * @author auto create
 * @since 1.0, 2020-10-09 11:27:25
 */
public class AlipayTradeCreditFinanceRefundModel extends AlipayObject {

	private static final long serialVersionUID = 7398926844414349483L;

	/**
	 * 本次需要退款的金额，单位为元；精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 币种单位，目前只支持人民币CNY
	 */
	@ApiField("currency")
	private String currency;

	/**
	 * 扩展参数，格式为json字符串。
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 退款备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 外部退款请求号，外部请求号，用于支付宝内部做幂等控制。同一笔trade_no下out_request_no不能相同，如果相同则代表是重复请求
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 收款人信息
	 */
	@ApiField("payee_info")
	private CreditFinancePayAccountInfo payeeInfo;

	/**
	 * 本次金融付款对应交易的买家ID
	 */
	@ApiField("trade_buyer_id")
	private String tradeBuyerId;

	/**
	 * 需要进行金融退款处理的交易号
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
