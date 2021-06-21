package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.acquire.close response.
 * 
 * @author auto create
 * @since 1.0, 2020-09-21 17:10:17
 */
public class AlipayAcquireCloseResponse extends AlipayResponse {

	private static final long serialVersionUID = 8631235324399262691L;

	/** 
	 * 对返回响应码进行原因说明
当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_code")
	private String detailErrorCode;

	/** 
	 * 对详细错误码进行文字说明
当result_code响应码为SUCCESS时，不返回该参数
	 */
	@ApiField("detail_error_des")
	private String detailErrorDes;

	/** 
	 * 请求是否成功。请求成功不代表业务处理成功。
T代表成功
F代表失败
	 */
	@ApiField("is_success")
	private String isSuccess;

	/** 
	 * 对应商户网站的订单系统中的唯一订单号，非支付宝交易号。
需保证在商户网站中的唯一性。是请求时对应的参数，原样返回
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/** 
	 * 关闭处理结果响应码。
SUCCESS：关闭成功
NKNOWN：结果未知
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 该交易在支付宝系统中的交易流水号。
最短16位，最长64位
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

	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getIsSuccess( ) {
		return this.isSuccess;
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

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

}
