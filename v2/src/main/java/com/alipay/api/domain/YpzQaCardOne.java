package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 个性化推荐卡
 *
 * @author auto create
 * @since 1.0, 2026-07-07 14:32:58
 */
public class YpzQaCardOne extends AlipayObject {

	private static final long serialVersionUID = 5741335799485269996L;

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
