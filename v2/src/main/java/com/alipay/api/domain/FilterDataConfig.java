package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * FilterDataConfig
 *
 * @author auto create
 * @since 1.0, 2024-05-21 14:41:59
 */
public class FilterDataConfig extends AlipayObject {

	private static final long serialVersionUID = 8184485457653577973L;

	/**
	 * 条件数据列表
	 */
	@ApiListField("options")
	@ApiField("filter_child_data_config")
	private List<FilterChildDataConfig> options;

	public List<FilterChildDataConfig> getOptions() {
		return this.options;
	}
	public void setOptions(List<FilterChildDataConfig> options) {
		this.options = options;
	}

}
