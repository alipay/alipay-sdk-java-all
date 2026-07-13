package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NPS卡
 *
 * @author auto create
 * @since 1.0, 2026-07-07 14:32:58
 */
public class YpzNpsCardOne extends AlipayObject {

	private static final long serialVersionUID = 2758724162114558312L;

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
