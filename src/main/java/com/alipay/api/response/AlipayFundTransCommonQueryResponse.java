package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.common.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-18 16:04:34
 */
public class AlipayFundTransCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3756532159598157852L;

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
	 * 转账单据状态。
	SUCCESS：转账成功（对转账到银行卡的单据, 同一笔单据多次查询有可能从成功变成退票状态）；
	FAIL：转账失败（具体失败原因请参见error_code以及fail_reason返回值）；
	WAIT_PAY：转账订单等待支付（只有alipay.fund.trans.app.pay接口的单据有此状态）；
	DEALING：转账到银行卡处理中；
	REFUND：退票 收款方是银行卡时会有次状态, 具体退票原因请参见fail_reason返回值）；
        CLOSED：订单超时关闭（只有alipay.fund.trans.app.pay接口的单据有此状态）

APP转账涉及的状态： WAIT_PAY SUCCESS CLOSED
转账到卡涉及的状态：DEALING FAIL SUCCESS REFUND 
转账到支付宝账户涉及的状态：FAIL SUCCESS
	 */
	@ApiField("status")
	private String status;

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

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
