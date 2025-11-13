package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回结果
 *
 * @author auto create
 * @since 1.0, 2020-05-28 18:55:14
 */
public class Result extends AlipayObject {

	private static final long serialVersionUID = 3774125285364725141L;

	/**
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果详细信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	/**
	 * 结果状态，包含：
S 成功
F 失败
U 未知异常
	 */
	@ApiField("result_status")
	private String resultStatus;

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getResultStatus() {
		return this.resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}

}
