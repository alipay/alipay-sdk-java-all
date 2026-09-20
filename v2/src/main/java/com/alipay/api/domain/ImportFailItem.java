package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-09-02 15:22:52
 */
public class ImportFailItem extends AlipayObject {

	private static final long serialVersionUID = 5115542174974372587L;

	/**
	 * 行标识（如身份证号/ 企业名）
	 */
	@ApiField("key")
	private String key;

	/**
	 * 具体写入原因
	 */
	@ApiField("reason")
	private String reason;

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

}
