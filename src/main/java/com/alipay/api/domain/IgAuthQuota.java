package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能导购权限份额
 *
 * @author auto create
 * @since 1.0, 2020-03-10 10:33:27
 */
public class IgAuthQuota extends AlipayObject {

	private static final long serialVersionUID = 7537699722734616936L;

	/**
	 * 份额数量
	 */
	@ApiField("quota_count")
	private Long quotaCount;

	/**
	 * 周期类型
	 */
	@ApiField("range_type")
	private String rangeType;

	public Long getQuotaCount() {
		return this.quotaCount;
	}
	public void setQuotaCount(Long quotaCount) {
		this.quotaCount = quotaCount;
	}

	public String getRangeType() {
		return this.rangeType;
	}
	public void setRangeType(String rangeType) {
		this.rangeType = rangeType;
	}

}
