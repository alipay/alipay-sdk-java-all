package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.third.party.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-02-03 14:52:42
 */
public class AlipayTradeThirdPartyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6165766262387524943L;

	/** 
	 * 交易支付时间
	 */
	@ApiField("gmt_payment")
	private String gmtPayment;

	/** 
	 * 由商家自定义，64个字符以内，仅支持字母、数字、下划线且需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 助贷平台PID
	 */
	@ApiField("partner_id")
	private String partnerId;

	/** 
	 * 资方在助贷平台侧入驻的smid
	 */
	@ApiField("secondary_merchant_no")
	private String secondaryMerchantNo;

	/** 
	 * 单位为元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 【注意事项】在未生成真实交易时，不返回，需要商户调用交易查询接口或接入支付通知，获取最终的交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 交易状态
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	public void setGmtPayment(String gmtPayment) {
		this.gmtPayment = gmtPayment;
	}
	public String getGmtPayment( ) {
		return this.gmtPayment;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerId( ) {
		return this.partnerId;
	}

	public void setSecondaryMerchantNo(String secondaryMerchantNo) {
		this.secondaryMerchantNo = secondaryMerchantNo;
	}
	public String getSecondaryMerchantNo( ) {
		return this.secondaryMerchantNo;
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

	public void setTradeStatus(String tradeStatus) {
		this.tradeStatus = tradeStatus;
	}
	public String getTradeStatus( ) {
		return this.tradeStatus;
	}

}
