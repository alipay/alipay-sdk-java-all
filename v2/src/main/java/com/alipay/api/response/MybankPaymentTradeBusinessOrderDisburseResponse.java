package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.business.order.disburse response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 02:33:31
 */
public class MybankPaymentTradeBusinessOrderDisburseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6638883839197417919L;

	/** 
	 * 网商受理打款操作返回的流水号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 请求流水号
	 */
	@ApiField("request_no")
	private String requestNo;

	/** 
	 * 外部平台是否需要原单重试，失败时有值
	 */
	@ApiField("retry")
	private String retry;

	public void setOperateNo(String operateNo) {
		this.operateNo = operateNo;
	}
	public String getOperateNo( ) {
		return this.operateNo;
	}

	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}
	public String getRequestNo( ) {
		return this.requestNo;
	}

	public void setRetry(String retry) {
		this.retry = retry;
	}
	public String getRetry( ) {
		return this.retry;
	}

}
