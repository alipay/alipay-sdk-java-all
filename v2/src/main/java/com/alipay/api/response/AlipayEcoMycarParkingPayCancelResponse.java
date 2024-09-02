package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.pay.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-11-30 15:07:59
 */
public class AlipayEcoMycarParkingPayCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8581824825228523812L;

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

	public void setParkingOrderNo(String parkingOrderNo) {
		this.parkingOrderNo = parkingOrderNo;
	}
	public String getParkingOrderNo( ) {
		return this.parkingOrderNo;
	}

}
