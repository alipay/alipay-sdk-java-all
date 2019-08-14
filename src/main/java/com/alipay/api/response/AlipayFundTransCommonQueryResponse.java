package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.common.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-05 10:41:57
 */
public class AlipayFundTransCommonQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1238852517734761955L;

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
	 * 转账单据状态。可能出现的状态如下：
	SUCCESS：转账成功；
	WAIT_PAY：等待支付；
        CLOSED：订单超时关闭

alipay.fund.trans.app.pay涉及的状态： WAIT_PAY、SUCCESS、CLOSED
alipay.fund.trans.uni.transfer、alipay.fund.trans.refund涉及的状态：SUCCESS
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
