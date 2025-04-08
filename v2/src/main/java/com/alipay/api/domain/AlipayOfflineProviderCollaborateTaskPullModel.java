package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拉取协同任务
 *
 * @author auto create
 * @since 1.0, 2025-04-07 15:02:34
 */
public class AlipayOfflineProviderCollaborateTaskPullModel extends AlipayObject {

	private static final long serialVersionUID = 7549965914297429159L;

	/**
	 * 单次拉取查询的任务数量，默认 100。
	 */
	@ApiField("count")
	private Long count;

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

}
