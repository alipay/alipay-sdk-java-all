package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.deductresult.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:48
 */
public class AlipayEbppInstserviceDeductresultQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3435813184986822632L;

	/** 
	 * 单位：元
	 */
	@ApiField("deduct_amount")
	private String deductAmount;

	/** 
	 * 支付宝流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 结果码
	 */
	@ApiField("order_result_code")
	private String orderResultCode;

	/** 
	 * 返回的结果码描述
	 */
	@ApiField("order_result_msg")
	private String orderResultMsg;

	/** 
	 * 上送流水号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/** 
	 * 时间格式：yyyyMMddHHmmss
	 */
	@ApiField("pay_time")
	private String payTime;

	/** 
	 * 0:未知状态
1:支付成功
2:支付失败
	 */
	@ApiField("status")
	private String status;

	public void setDeductAmount(String deductAmount) {
		this.deductAmount = deductAmount;
	}
	public String getDeductAmount( ) {
		return this.deductAmount;
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

	public void setPayTime(String payTime) {
		this.payTime = payTime;
	}
	public String getPayTime( ) {
		return this.payTime;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
