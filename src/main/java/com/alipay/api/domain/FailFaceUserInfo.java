package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸库用户扩展信息修改失败的用户信息模型
 *
 * @author auto create
 * @since 1.0, 2022-01-10 16:29:18
 */
public class FailFaceUserInfo extends AlipayObject {

	private static final long serialVersionUID = 1757529633794249974L;

	/**
	 * 错误码。
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 错误描述。
	 */
	@ApiField("fail_message")
	private String failMessage;

	/**
	 * 当前失败用户是否可以重试。{true：可重试，false：不可重试}
	 */
	@ApiField("retry")
	private Boolean retry;

	/**
	 * 服务商内部用户唯一id。
	 */
	@ApiField("unique_id")
	private String uniqueId;

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getFailMessage() {
		return this.failMessage;
	}
	public void setFailMessage(String failMessage) {
		this.failMessage = failMessage;
	}

	public Boolean getRetry() {
		return this.retry;
	}
	public void setRetry(Boolean retry) {
		this.retry = retry;
	}

	public String getUniqueId() {
		return this.uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

}
