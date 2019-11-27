package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.order.deduct.pay response.
 * 
 * @author auto create
 * @since 1.0, 2019-04-29 17:44:58
 */
public class AlipayMerchantOrderDeductPayResponse extends AlipayResponse {

	private static final long serialVersionUID = 6817758155932356826L;

	/** 
	 * 买家在支付宝的用户id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 本次代扣金额，单位为元，精确到小数点后两位，取值范围[0.01,100000000]
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/** 
	 * 支付资金明细
	 */
	@ApiField("fund_detail")
	private String fundDetail;

	/** 
	 * 代扣完成时间，如果商户用同一个请求号发起重复代扣返回本请求号第一次代扣成功的时间
	 */
	@ApiField("gmt_pay")
	private Date gmtPay;

	/** 
	 * 业务订单编号
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 商户请求号，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 支付宝内部交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}
	public String getDeductAmount( ) {
		return this.deductAmount;
	}

	public void setFundDetail(String fundDetail) {
		this.fundDetail = fundDetail;
	}
	public String getFundDetail( ) {
		return this.fundDetail;
	}

	public void setGmtPay(Date gmtPay) {
		this.gmtPay = gmtPay;
	}
	public Date getGmtPay( ) {
		return this.gmtPay;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
