package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动发放结果
 *
 * @author auto create
 * @since 1.0, 2022-11-22 11:47:29
 */
public class ActivitySendVoucherResultInfo extends AlipayObject {

	private static final long serialVersionUID = 3489362126531274738L;

	/**
	 * 发放中时返回的具体错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 发放未成功时返回的错误信息
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 发放是否成功
	 */
	@ApiField("result")
	private Boolean result;

	/**
	 * true 可重试
false 不可重试
	 */
	@ApiField("retry")
	private Boolean retry;

	/**
	 * 服务商发奖后返回的券码列表.
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

	public Boolean getRetry() {
		return this.retry;
	}
	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
