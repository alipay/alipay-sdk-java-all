package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-25 10:22:42
 */
public class ConsultFailReason extends AlipayObject {

	private static final long serialVersionUID = 7375253571843334399L;

	/**
	 * 咨询失败原因枚举编码
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 咨询失败原因的描述信息
	 */
	@ApiField("fail_message")
	private String failMessage;

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

}
