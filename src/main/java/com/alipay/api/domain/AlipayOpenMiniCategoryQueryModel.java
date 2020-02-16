package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小程序类目树查询
 *
 * @author auto create
 * @since 1.0, 2020-01-13 10:18:45
 */
public class AlipayOpenMiniCategoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5395968158466988263L;

	/**
	 * 是否需要过滤不可用类目
	 */
	@ApiField("is_filter")
	private Boolean isFilter;

	public Boolean getIsFilter() {
		return this.isFilter;
	}
	public void setIsFilter(Boolean isFilter) {
		this.isFilter = isFilter;
	}

}
