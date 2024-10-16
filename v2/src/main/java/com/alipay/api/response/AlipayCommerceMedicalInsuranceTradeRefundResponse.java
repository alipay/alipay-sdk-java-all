package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.insurance.trade.refund response.
 * 
 * @author auto create
 * @since 1.0, 2024-09-19 17:52:11
 */
public class AlipayCommerceMedicalInsuranceTradeRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 6477175795898193162L;

	/** 
	 * 用户的登录id
	 */
	@ApiField("buyer_login_id")
	private String buyerLoginId;

	/** 
	 * 退款支付时间，格式："yyyy-MM-dd HH:mm:ss"
	 */
	@ApiField("gmt_refund_pay")
	private Date gmtRefundPay;

	/** 
	 * 商户订单号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 用户本次退款成功的总金额
	 */
	@ApiField("refund_fee")
	private String refundFee;

	/** 
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setBuyerLoginId(String buyerLoginId) {
		this.buyerLoginId = buyerLoginId;
	}
	public String getBuyerLoginId( ) {
		return this.buyerLoginId;
	}

	public void setGmtRefundPay(Date gmtRefundPay) {
		this.gmtRefundPay = gmtRefundPay;
	}
	public Date getGmtRefundPay( ) {
		return this.gmtRefundPay;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setRefundFee(String refundFee) {
		this.refundFee = refundFee;
	}
	public String getRefundFee( ) {
		return this.refundFee;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
