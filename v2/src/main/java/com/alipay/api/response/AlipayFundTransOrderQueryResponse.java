package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:24:47
 */
public class AlipayFundTransOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1533983265781751378L;

	/** 
	 * 预计到账时间，转账到银行卡专用，格式为yyyy-MM-dd HH:mm:ss，转账受理失败不返回。
   注意：
此参数为预计时间，可能与实际到账时间有较大误差，不能作为实际到账时间使用，仅供参考用途。
	 */
	@ApiField("arrival_time_end")
	private String arrivalTimeEnd;

	/** 
	 * 查询失败时，本参数为错误代 码。
 查询成功不返回。 对于退票订单，不返回该参数。
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 查询到的订单状态为FAIL失败或REFUND退票时，返回具体的原因。
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 预计收费金额（元），转账到银行卡专用，数字格式，精确到小数点后2位，转账失败或转账受理失败不返回。
	 */
	@ApiField("order_fee")
	private String orderFee;

	/** 
	 * 支付宝转账单据号，查询失败不返回。
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 发起转账来源方定义的转账单据号。 
该参数的赋值均以查询结果中 的 out_biz_no 为准。 
如果查询失败，不返回该参数。
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 支付时间，格式为yyyy-MM-dd HH:mm:ss，转账失败不返回。
	 */
	@ApiField("pay_date")
	private String payDate;

	/** 
	 * 转账单据状态。
	SUCCESS：成功（配合"单笔转账到银行账户接口"产品使用时, 同一笔单据多次查询有可能从成功变成退票状态）；
	FAIL：失败（具体失败原因请参见error_code以及fail_reason返回值）；
	INIT：等待处理；
	DEALING：处理中；
	REFUND：退票（仅配合"单笔转账到银行账户接口"产品使用时会涉及, 具体退票原因请参见fail_reason返回值）；
	UNKNOWN：状态未知。
	 */
	@ApiField("status")
	private String status;

	public void setArrivalTimeEnd(String arrivalTimeEnd) {
		this.arrivalTimeEnd = arrivalTimeEnd;
	}
	public String getArrivalTimeEnd( ) {
		return this.arrivalTimeEnd;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setOrderFee(String orderFee) {
		this.orderFee = orderFee;
	}
	public String getOrderFee( ) {
		return this.orderFee;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getPayDate( ) {
		return this.payDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
