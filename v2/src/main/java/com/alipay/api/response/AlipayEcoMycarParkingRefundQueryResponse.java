package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.parking.refund.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 17:18:45
 */
public class AlipayEcoMycarParkingRefundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1448944229619323531L;

	/** 
	 * 业务失败详细错误码
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

	/** 
	 * 支付宝停车平台退款订单号
	 */
	@ApiField("parking_refund_no")
	private String parkingRefundNo;

	/** 
	 * 退款状态，"DOING":"处理中"; "SUCCESS":"成功"; "FAIL":"失败"
	 */
	@ApiField("refund_status")
	private String refundStatus;

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

	public void setParkingRefundNo(String parkingRefundNo) {
		this.parkingRefundNo = parkingRefundNo;
	}
	public String getParkingRefundNo( ) {
		return this.parkingRefundNo;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}
	public String getRefundStatus( ) {
		return this.refundStatus;
	}

}
