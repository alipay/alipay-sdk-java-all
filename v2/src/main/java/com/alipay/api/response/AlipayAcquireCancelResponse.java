package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayAcquireCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 1164811688256248854L;

	/** 
	 * 对返回响应码进行原因说明，当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明。
当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 撤销处理结果响应码。
SUCCESS：撤销成功
FAIL：撤销失败
UNKNOWN：结果未知
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 对撤销失败的情况下，是否可以继续发起撤销请求的建议。
Y：可继续发起撤销请求；
N：不可继续发起撤销请求，即后续的撤销请求也不会成功。
	 */
	@ApiField("retry_flag")
	private String retryFlag;

	/** 
	 * 该交易在支付宝系统中的交易流水号。
最短16位，最长64位。
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public void setDetailErrorCode(String detailErrorCode) {
		this.detailErrorCode = detailErrorCode;
	}
	public String getDetailErrorCode( ) {
		return this.detailErrorCode;
	}

	public void setDetailErrorDes(String detailErrorDes) {
		this.detailErrorDes = detailErrorDes;
	}
	public String getDetailErrorDes( ) {
		return this.detailErrorDes;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}
	public String getOutTradeNo( ) {
		return this.outTradeNo;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setRetryFlag(String retryFlag) {
		this.retryFlag = retryFlag;
	}
	public String getRetryFlag( ) {
		return this.retryFlag;
	}

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
