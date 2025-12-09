package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * iot的响应类
 *
 * @author auto create
 * @since 1.0, 2022-10-19 14:59:10
 */
public class IntentQueryResponse extends AlipayObject {

	private static final long serialVersionUID = 8331525841625416831L;

	/**
	 * 对应用户的queryId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 结果编码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * 结果json
	 */
	@ApiField("result_json")
	private String resultJson;

	/**
	 * 结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 操作结果
	 */
	@ApiField("success")
	private Boolean success;

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultJson() {
		return this.resultJson;
	}
	public void setResultJson(String resultJson) {
		this.resultJson = resultJson;
	}

	public String getResultMsg() {
		return this.resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
