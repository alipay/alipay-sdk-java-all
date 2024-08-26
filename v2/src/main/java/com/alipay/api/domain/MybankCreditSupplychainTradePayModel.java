package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 交易支付
 *
 * @author auto create
 * @since 1.0, 2024-03-26 17:38:53
 */
public class MybankCreditSupplychainTradePayModel extends AlipayObject {

	private static final long serialVersionUID = 2569123691579223592L;

	/**
	 * 买家信息
	 */
	@ApiField("buyer")
	private Member buyer;

	/**
	 * 渠道，TMGXBL：天猫供销保理，TYZBL：通用自保理，TMZBL：天猫自保理
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 业务扩展字段
	 */
	@ApiField("ext_data")
	private String extData;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 支付金额（单位：元），只支持两位小数点的正数
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 运营商分期保理反接提前还款扣款账户
	 */
	@ApiField("pre_payment_account")
	private Account prePaymentAccount;

	/**
	 * 幂等编号，用于幂等控制，格式 instIpRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付
	 */
	@ApiField("trade_type")
	private String tradeType;

	public Member getBuyer() {
		return this.buyer;
	}
	public void setBuyer(Member buyer) {
		this.buyer = buyer;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtData() {
		return this.extData;
	}
	public void setExtData(String extData) {
		this.extData = extData;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public Account getPrePaymentAccount() {
		return this.prePaymentAccount;
	}
	public void setPrePaymentAccount(Account prePaymentAccount) {
		this.prePaymentAccount = prePaymentAccount;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
