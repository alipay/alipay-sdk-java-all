package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NPS卡
 *
 * @author auto create
 * @since 1.0, 2026-05-18 17:42:49
 */
public class YpzNpsCardOne extends AlipayObject {

	private static final long serialVersionUID = 3588329972422457985L;

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
