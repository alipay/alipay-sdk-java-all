package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.trade.createandpay response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-11 14:07:00
 */
public class AlipayCommerceMedicalTradeCreateandpayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6243559124596269829L;

	/** 
	 * 自费创单后支付宝返回的支付宝交易流水号
(有自费部分时返回)
	 */
	@ApiField("alipay_trade_no")
	private String alipayTradeNo;

	/** 
	 * 商户门店对应的收单银行ID
(有自费部分时返回)
	 */
	@ApiField("bank_id")
	private String bankId;

	/** 
	 * 商户门店对应的收单银行名称
(有自费部分时返回)
	 */
	@ApiField("bank_name")
	private String bankName;

	/** 
	 * 银行订单号,有自费部分时该字段有值
	 */
	@ApiField("bank_order_id")
	private String bankOrderId;

	/** 
	 * 医院上传处方明细的收费批次号
(order_type=INSURANCE_PAY时必填)
	 */
	@ApiField("chrg_bch_no")
	private String chrgBchNo;

	/** 
	 * 医院订单号
	 */
	@ApiField("med_org_ord")
	private String medOrgOrd;

	/** 
	 * 创建交易时商户传入的订单类型
	 */
	@ApiField("order_type")
	private String orderType;

	/** 
	 * 该笔交易商户传入的外部交易流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 医保订单号
(order_type=INSURANCE_PAY返回)
	 */
	@ApiField("pay_order_id")
	private String payOrderId;

	/** 
	 * 支付跳转地址
	 */
	@ApiField("pay_url")
	private String payUrl;

	/** 
	 * 医保支付类型
	 */
	@ApiField("rels_pay_flag")
	private String relsPayFlag;

	/** 
	 * 如果是亲情账户授权，会返回主账户脱敏姓名
(亲情账户支付时返回)
	 */
	@ApiField("rels_pay_user_name")
	private String relsPayUserName;

	/** 
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setAlipayTradeNo(String alipayTradeNo) {
		this.alipayTradeNo = alipayTradeNo;
	}
	public String getAlipayTradeNo( ) {
		return this.alipayTradeNo;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankId( ) {
		return this.bankId;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankName( ) {
		return this.bankName;
	}

	public void setBankOrderId(String bankOrderId) {
		this.bankOrderId = bankOrderId;
	}
	public String getBankOrderId( ) {
		return this.bankOrderId;
	}

	public void setChrgBchNo(String chrgBchNo) {
		this.chrgBchNo = chrgBchNo;
	}
	public String getChrgBchNo( ) {
		return this.chrgBchNo;
	}

	public void setMedOrgOrd(String medOrgOrd) {
		this.medOrgOrd = medOrgOrd;
	}
	public String getMedOrgOrd( ) {
		return this.medOrgOrd;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType( ) {
		return this.orderType;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getPayOrderId( ) {
		return this.payOrderId;
	}

	public void setPayUrl(String payUrl) {
		this.payUrl = payUrl;
	}
	public String getPayUrl( ) {
		return this.payUrl;
	}

	public void setRelsPayFlag(String relsPayFlag) {
		this.relsPayFlag = relsPayFlag;
	}
	public String getRelsPayFlag( ) {
		return this.relsPayFlag;
	}

	public void setRelsPayUserName(String relsPayUserName) {
		this.relsPayUserName = relsPayUserName;
	}
	public String getRelsPayUserName( ) {
		return this.relsPayUserName;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
