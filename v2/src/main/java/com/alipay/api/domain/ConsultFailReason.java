package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-23 15:37:45
 */
public class ConsultFailReason extends AlipayObject {

	private static final long serialVersionUID = 3463551836926298786L;

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
