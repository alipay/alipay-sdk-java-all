package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加密出参
 *
 * @author auto create
 * @since 1.0, 2026-07-24 15:37:55
 */
public class EncryptRequest extends AlipayObject {

	private static final long serialVersionUID = 1597129531328724513L;

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
