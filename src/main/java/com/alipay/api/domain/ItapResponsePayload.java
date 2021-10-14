package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能终端通用响应结果模型
 *
 * @author auto create
 * @since 1.0, 2020-01-09 11:00:51
 */
public class ItapResponsePayload extends AlipayObject {

	private static final long serialVersionUID = 5312937591698742297L;

	/**
	 * 是否成功，true/false
	 */
	@ApiField("result")
	private Boolean result;

	/**
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public Boolean getResult() {
		return this.result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

}
