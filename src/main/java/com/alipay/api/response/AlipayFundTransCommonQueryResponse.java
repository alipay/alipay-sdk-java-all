package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.common.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-03-27 19:22:24
 */
public class AlipayFundTransCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2375687569671364362L;

	/** 
	 * 预计到账时间，转账到银行卡专用，格式为yyyy-MM-dd HH:mm:ss，转账受理失败不返回。
注意：
此参数为预计时间，可能与实际到账时间有较大误差，不能作为实际到账时间使用，仅供参考用途。
	 */
	@ApiField("arrival_time_end")
	private String arrivalTimeEnd;

	/** 
	 * 商户查询代扣订单信息时返回其在代扣请求中传入的账单属性
	 */
	@ApiField("deduct_bill_info")
	private String deductBillInfo;

	/** 
	 * 查询到的订单状态为FAIL失败或REFUND退票时，返回错误代码
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
	 * 商户订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 商户回传参数
	 */
	@ApiField("passback_params")
	private String passbackParams;

	/** 
	 * 支付时间，格式为yyyy-MM-dd HH:mm:ss，转账失败不返回。
	 */
	@ApiField("pay_date")
	private String payDate;

	/** 
	 * 支付宝支付资金流水号，转账失败不返回。
	 */
	@ApiField("pay_fund_order_id")
	private String payFundOrderId;

	/** 
	 * 转账单据状态。可能出现的状态如下：
	SUCCESS：转账成功；
	WAIT_PAY：等待支付；
     CLOSED：订单超时关闭；
     FAIL：失败（适用于"单笔转账到银行卡"）；
     DEALING：处理中（适用于"单笔转账到银行卡"）；
     REFUND：退票（适用于"单笔转账到银行卡"）；

alipay.fund.trans.app.pay涉及的状态： WAIT_PAY、SUCCESS、CLOSED
alipay.fund.trans.refund涉及的状态：SUCCESS
alipay.fund.trans.uni.transfer涉及的状态：SUCCESS、FAIL、DEALING、REFUND
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 付款金额，收银台场景下付款成功后的支付金额，订单状态为SUCCESS才返回，其他状态不返回。
	 */
	@ApiField("trans_amount")
	private String transAmount;

	/** 
	 * 商户在查询代发订单信息时返回其在代发请求中传入的账单属性。
	 */
	@ApiField("transfer_bill_info")
	private String transferBillInfo;

	public void setArrivalTimeEnd(String arrivalTimeEnd) {
		this.arrivalTimeEnd = arrivalTimeEnd;
	}
	public String getArrivalTimeEnd( ) {
		return this.arrivalTimeEnd;
	}

	public void setDeductBillInfo(String deductBillInfo) {
		this.deductBillInfo = deductBillInfo;
	}
	public String getDeductBillInfo( ) {
		return this.deductBillInfo;
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

	public void setPassbackParams(String passbackParams) {
		this.passbackParams = passbackParams;
	}
	public String getPassbackParams( ) {
		return this.passbackParams;
	}

	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getPayDate( ) {
		return this.payDate;
	}

	public void setPayFundOrderId(String payFundOrderId) {
		this.payFundOrderId = payFundOrderId;
	}
	public String getPayFundOrderId( ) {
		return this.payFundOrderId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setTransAmount(String transAmount) {
		this.transAmount = transAmount;
	}
	public String getTransAmount( ) {
		return this.transAmount;
	}

	public void setTransferBillInfo(String transferBillInfo) {
		this.transferBillInfo = transferBillInfo;
	}
	public String getTransferBillInfo( ) {
		return this.transferBillInfo;
	}

}
