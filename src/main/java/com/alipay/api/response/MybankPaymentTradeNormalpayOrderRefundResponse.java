package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.payment.trade.normalpay.order.refund response.
 * 
 * @author auto create
 * @since 1.0, 2021-02-05 09:59:57
 */
public class MybankPaymentTradeNormalpayOrderRefundResponse extends AlipayResponse {

	private static final long serialVersionUID = 3169231355949688565L;

	/** 
	 * 网商受理退款操作返回的流水号
	 */
	@ApiField("operate_no")
	private String operateNo;

	/** 
	 * 请求受理时间，格式是yyyyMMddHHmmss
	 */
	@ApiField("request_accept_time")
	private String requestAcceptTime;

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

	public void setRequestAcceptTime(String requestAcceptTime) {
		this.requestAcceptTime = requestAcceptTime;
	}
	public String getRequestAcceptTime( ) {
		return this.requestAcceptTime;
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
