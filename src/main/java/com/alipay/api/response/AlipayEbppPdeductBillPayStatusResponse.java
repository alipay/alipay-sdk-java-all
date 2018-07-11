package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.pdeduct.bill.pay.status response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-04 11:19:05
 */
public class AlipayEbppPdeductBillPayStatusResponse extends AlipayResponse {

	private static final long serialVersionUID = 1493957715454871242L;

	/** 
	 * 支付宝协议流水
	 */
	@ApiField("agreement_id")
	private String agreementId;

	/** 
	 * 支付宝流billNo
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 订单的结果码
	 */
	@ApiField("order_result_code")
	private String orderResultCode;

	/** 
	 * 订单的结果描述
	 */
	@ApiField("order_result_msg")
	private String orderResultMsg;

	/** 
	 * 外部订单流水
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 支付宝订单支付状态。
0：未知状态。
1：支付成功。
2：支付失败。
	 */
	@ApiField("status")
	private String status;

	public void setAgreementId(String agreementId) {
		this.agreementId = agreementId;
	}
	public String getAgreementId( ) {
		return this.agreementId;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOrderResultCode(String orderResultCode) {
		this.orderResultCode = orderResultCode;
	}
	public String getOrderResultCode( ) {
		return this.orderResultCode;
	}

	public void setOrderResultMsg(String orderResultMsg) {
		this.orderResultMsg = orderResultMsg;
	}
	public String getOrderResultMsg( ) {
		return this.orderResultMsg;
	}

	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}
	public String getOutOrderNo( ) {
		return this.outOrderNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
