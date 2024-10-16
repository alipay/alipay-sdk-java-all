package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 脱机交易执行结果
 *
 * @author auto create
 * @since 1.0, 2022-12-27 16:02:50
 */
public class AlipayOfflineTradeResult extends AlipayObject {

	private static final long serialVersionUID = 3376222261636963732L;

	/**
	 * 系统异常
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息描述
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 脱机交易处理结果描述
	 */
	@ApiField("message")
	private String message;

	/**
	 * 表示是否需要重试
	 */
	@ApiField("need_retry")
	private Boolean needRetry;

	/**
	 * 交易需要重试时下一次重试时间
	 */
	@ApiField("next_try_time")
	private String nextTryTime;

	/**
	 * 支付宝外部交易号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 业务处理结果,SUCCESS：处理成功，FAIL：处理失败， UNKNOWN:结果未知。当结果非SUCCESS时，检查need_retry判断是否需要重试。
	 */
	@ApiField("result")
	private String result;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getMessage() {
		return this.message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getNeedRetry() {
		return this.needRetry;
	}
	public void setNeedRetry(Boolean needRetry) {
		this.needRetry = needRetry;
	}

	public String getNextTryTime() {
		return this.nextTryTime;
	}
	public void setNextTryTime(String nextTryTime) {
		this.nextTryTime = nextTryTime;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
