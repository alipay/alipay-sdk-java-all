package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 首页助理openapi返回结果
 *
 * @author auto create
 * @since 1.0, 2020-08-06 17:24:08
 */
public class HomeApiResponse extends AlipayObject {

	private static final long serialVersionUID = 2427175186919225411L;

	/**
	 * 对应入参的biz_id，全局唯一
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 返回结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/**
	 * data
	 */
	@ApiField("result_json")
	private String resultJson;

	/**
	 * 结果描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/**
	 * 调用是否成功
	 */
	@ApiField("success")
	private String success;

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

	public String getSuccess() {
		return this.success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

}
