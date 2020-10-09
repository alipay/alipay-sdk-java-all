package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.tradeorder.refund response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AntMerchantExpandTradeorderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 5177292868248225624L;

	/** 
	 * 买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/** 
	 * 退款时间
	 */
	@ApiField("gmt_refund")
	private Date gmtRefund;

	/** 
	 * 退款金额；单位：分
	 */
	@ApiField("refund_amount")
	private Long refundAmount;

	/** 
	 * 退款单ID
	 */
	@ApiField("refund_order_id")
	private String refundOrderId;

	/** 
	 * 退款状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/** 
	 * 卖家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public String getBuyerId( ) {
		return this.buyerId;
	}

	public void setGmtRefund(Date gmtRefund) {
		this.gmtRefund = gmtRefund;
	}
	public Date getGmtRefund( ) {
		return this.gmtRefund;
	}

	public void setRefundAmount(Long refundAmount) {
		this.refundAmount = refundAmount;
	}
	public Long getRefundAmount( ) {
		return this.refundAmount;
	}

	public void setRefundOrderId(String refundOrderId) {
		this.refundOrderId = refundOrderId;
	}
	public String getRefundOrderId( ) {
		return this.refundOrderId;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerId( ) {
		return this.sellerId;
	}

}
