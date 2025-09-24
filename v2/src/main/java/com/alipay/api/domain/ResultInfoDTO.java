package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 国际结果信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 15:54:01
 */
public class ResultInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4593848942386715514L;

	/**
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果消息
	 */
	@ApiField("result_message")
	private String resultMessage;

	/**
	 * 结果状态
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
