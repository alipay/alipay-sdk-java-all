package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NPS卡
 *
 * @author auto create
 * @since 1.0, 2026-09-08 21:14:39
 */
public class YpzNpsCardOne extends AlipayObject {

	private static final long serialVersionUID = 4184317511343348933L;

	/**
	 * 显示状态
	 */
	@ApiField("status")
	private Boolean status;

	public Boolean getStatus() {
		return this.status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}

}
