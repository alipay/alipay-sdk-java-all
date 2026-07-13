package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加密出参
 *
 * @author auto create
 * @since 1.0, 2026-03-17 16:57:44
 */
public class EncryptRequest extends AlipayObject {

	private static final long serialVersionUID = 8879237722317862911L;

	/**
	 * 加密参数
	 */
	@ApiField("encrypted")
	private String encrypted;

	/**
	 * 时间戳
	 */
	@ApiField("time")
	private String time;

	public String getEncrypted() {
		return this.encrypted;
	}
	public void setEncrypted(String encrypted) {
		this.encrypted = encrypted;
	}

	public String getTime() {
		return this.time;
	}
	public void setTime(String time) {
		this.time = time;
	}

}
