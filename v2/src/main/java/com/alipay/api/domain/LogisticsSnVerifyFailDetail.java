package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-09 10:29:33
 */
public class LogisticsSnVerifyFailDetail extends AlipayObject {

	private static final long serialVersionUID = 6597481548787445251L;

	/**
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 设备序列号
	 */
	@ApiField("sn_id")
	private String snId;

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getSnId() {
		return this.snId;
	}
	public void setSnId(String snId) {
		this.snId = snId;
	}

}
