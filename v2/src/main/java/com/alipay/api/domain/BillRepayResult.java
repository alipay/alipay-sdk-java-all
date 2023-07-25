package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账单还款结果
 *
 * @author auto create
 * @since 1.0, 2023-06-09 11:13:43
 */
public class BillRepayResult extends AlipayObject {

	private static final long serialVersionUID = 3116915655955962549L;

	/**
	 * 还款错误码，失败时有值
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误信息（错误文案），失败时有值
	 */
	@ApiField("error_msg")
	private String errorMsg;

	/**
	 * 还款结果
SUCC: 成功
FAIL: 失败
EXEC: 还款中
	 */
	@ApiField("result")
	private String result;

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

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
