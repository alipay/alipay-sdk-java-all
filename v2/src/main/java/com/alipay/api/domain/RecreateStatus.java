package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 重建状态
 *
 * @author auto create
 * @since 1.0, 2024-08-15 11:51:04
 */
public class RecreateStatus extends AlipayObject {

	private static final long serialVersionUID = 1433281676287885717L;

	/**
	 * 实例创建原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 实例创建来源
	 */
	@ApiField("status")
	private String status;

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
