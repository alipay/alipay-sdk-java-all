package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 动态配置数据信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 19:39:35
 */
public class DynamicAwardConfigDataDto extends AlipayObject {

	private static final long serialVersionUID = 8438172939522299263L;

	/**
	 * 计数限制
	 */
	@ApiField("count_limit")
	private Long countLimit;

	/**
	 * 额外动态奖励值
	 */
	@ApiField("dynamic_award_count")
	private Long dynamicAwardCount;

	public Long getCountLimit() {
		return this.countLimit;
	}
	public void setCountLimit(Long countLimit) {
		this.countLimit = countLimit;
	}

	public Long getDynamicAwardCount() {
		return this.dynamicAwardCount;
	}
	public void setDynamicAwardCount(Long dynamicAwardCount) {
		this.dynamicAwardCount = dynamicAwardCount;
	}

}
