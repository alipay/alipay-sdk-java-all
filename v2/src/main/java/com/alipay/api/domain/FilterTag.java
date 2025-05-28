package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 自定义报表过滤标签
 *
 * @author auto create
 * @since 1.0, 2019-06-25 19:46:00
 */
public class FilterTag extends AlipayObject {

	private static final long serialVersionUID = 1749283154547333491L;

	/**
	 * 过滤条件的标签code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 分组过滤条件
注意：这个是JSON数组，必须以[开头，以]结尾，[]外层不能加双引号"",正确案例[{"operate": "EQ","value": "1" }]，错误案例："[{"operate": "EQ","value": "1" }]"
	 */
	@ApiField("filter_items")
	private String filterItems;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getFilterItems() {
		return this.filterItems;
	}
	public void setFilterItems(String filterItems) {
		this.filterItems = filterItems;
	}

}
