package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.innovate.order.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-30 15:11:46
 */
public class AlipayFundTransInnovateOrderQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4521824645517225256L;

	/** 
	 * 预计到账时间，转账到银行卡专用，格式为yyyy-MM-dd HH:mm:ss，转账受理失败不返回。
注意：
此参数为预计时间，可能与实际到账时间有较大误差，不能作为实际到账时间使用，仅供参考用途。
	 */
	@ApiField("arrival_time_end")
	private Date arrivalTimeEnd;

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
	 * 支付时间，格式为yyyy-MM-dd HH:mm:ss，转账失败不返回。
	 */
	@ApiField("pay_date")
	private Date payDate;

	/** 
	 * 退款时间
	 */
	@ApiField("refund_date")
	private Date refundDate;

	/** 
	 * 转账单据状态。可能出现的状态如下： SUCCESS：转账成功； WAIT_PAY：等待支付； CLOSE：订单超时关闭； FAIL：失败（适用于"单笔转账到银行卡"）； DEALING：处理中（适用于"单笔转账到银行卡"）； REFUND：退票（适用于"单笔转账到银行卡"）；
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 付款金额，收银台场景下付款成功后的支付金额，订单状态为SUCCESS才返回，其他状态不返回。付款金额，单位为元，精确到小数点后两位：订单总金额，单位为元，精确到小数点后两位： 32.00
	 */
	@ApiField("trans_amount")
	private String transAmount;

	public void setArrivalTimeEnd(Date arrivalTimeEnd) {
		this.arrivalTimeEnd = arrivalTimeEnd;
	}
	public Date getArrivalTimeEnd( ) {
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

	public void setPayDate(Date payDate) {
		this.payDate = payDate;
	}
	public Date getPayDate( ) {
		return this.payDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}
	public Date getRefundDate( ) {
		return this.refundDate;
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

}
