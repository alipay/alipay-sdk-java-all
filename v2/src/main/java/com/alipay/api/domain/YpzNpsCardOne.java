package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NPS卡
 *
 * @author auto create
 * @since 1.0, 2026-06-15 11:25:17
 */
public class YpzNpsCardOne extends AlipayObject {

	private static final long serialVersionUID = 8718479711862773832L;

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
