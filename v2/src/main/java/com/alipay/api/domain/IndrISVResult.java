package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业缴费ISV结果模型
 *
 * @author auto create
 * @since 1.0, 2023-05-05 22:01:35
 */
public class IndrISVResult extends AlipayObject {

	private static final long serialVersionUID = 8448117727474986249L;

	/**
	 * 返回结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果码描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	/**
	 * 结果码状态
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
