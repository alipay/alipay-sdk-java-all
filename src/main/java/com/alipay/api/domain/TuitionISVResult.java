package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 结果
 *
 * @author auto create
 * @since 1.0, 2021-07-28 12:10:49
 */
public class TuitionISVResult extends AlipayObject {

	private static final long serialVersionUID = 8896257359172874751L;

	/**
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	/**
	 * 结果码
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
