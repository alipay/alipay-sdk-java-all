package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.etc.settlement.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-17 15:41:45
 */
public class AlipayCommerceTransportEtcSettlementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5287135491718612311L;

	/** 
	 * 行程描述等展示信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 行程单id
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/** 
	 * 交易支付时间
	 */
	@ApiField("pay_time")
	private Date payTime;

	/** 
	 * 行程总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 支付宝交易号，只有交易支付成功后才会返回
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 行程扣款状态： "I":"待支付"; "PI":"支付中（请重试）"; "S":"支付成功"; "F":"支付失败"; "RI":"退款中（请重试）"; "R":"已退款"
	 */
	@ApiField("trade_status")
	private String tradeStatus;

	/** 
	 * 支付宝收到行程后的ETC行程Id
	 */
	@ApiField("trip_id")
	private String tripId;

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}
	public String getOutOrderId( ) {
		return this.outOrderId;
	}

	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime( ) {
		return this.payTime;
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

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}
	public String getTripId( ) {
		return this.tripId;
	}

}
