package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 学校批量查询结果
 *
 * @author auto create
 * @since 1.0, 2024-04-22 10:38:29
 */
public class SchoolBatchQueryResult extends AlipayObject {

	private static final long serialVersionUID = 2734442587875443531L;

	/**
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果描述
	 */
	@ApiField("result_message")
	private String resultMessage;

	/**
	 * 状态码
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
