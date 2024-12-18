package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拉取协同任务
 *
 * @author auto create
 * @since 1.0, 2024-11-29 16:28:20
 */
public class AlipayOfflineProviderCollaborateTaskPullModel extends AlipayObject {

	private static final long serialVersionUID = 2287292919468749818L;

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
