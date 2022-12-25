package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.pay.refund response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:39:43
 */
public class AlipayEcoMycarParkingPayRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3252625295961921899L;

	/** 
	 * 业务返回码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 业务返回码描述
	 */
	@ApiField("biz_msg")
	private String bizMsg;

	/** 
	 * 外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 外部退款订单号
	 */
	@ApiField("out_refund_no")
	private String outRefundNo;

	/** 
	 * 支付宝停车平台订单号
	 */
	@ApiField("parking_order_no")
	private String parkingOrderNo;

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizMsg(String bizMsg) {
		this.bizMsg = bizMsg;
	}
	public String getBizMsg( ) {
		return this.bizMsg;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setOutRefundNo(String outRefundNo) {
		this.outRefundNo = outRefundNo;
	}
	public String getOutRefundNo( ) {
		return this.outRefundNo;
	}

	public void setParkingOrderNo(String parkingOrderNo) {
		this.parkingOrderNo = parkingOrderNo;
	}
	public String getParkingOrderNo( ) {
		return this.parkingOrderNo;
	}

}
