package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券汇总信息
 *
 * @author auto create
 * @since 1.0, 2022-08-24 14:43:18
 */
public class VoucherSummary extends AlipayObject {

	private static final long serialVersionUID = 3873734356689298325L;

	/**
	 * 券已发放数量。
	 */
	@ApiField("publish_count")
	private Long publishCount;

	/**
	 * 券已核销数量。
	 */
	@ApiField("used_count")
	private Long usedCount;

	public Long getPublishCount() {
		return this.publishCount;
	}
	public void setPublishCount(Long publishCount) {
		this.publishCount = publishCount;
	}

	public Long getUsedCount() {
		return this.usedCount;
	}
	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

}
