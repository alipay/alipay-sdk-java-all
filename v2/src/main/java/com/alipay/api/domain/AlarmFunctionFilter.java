package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 告警规则函数过滤条件
 *
 * @author auto create
 * @since 1.0, 2024-04-11 09:44:18
 */
public class AlarmFunctionFilter extends AlipayObject {

	private static final long serialVersionUID = 4476835948878749627L;

	/**
	 * 过滤类型
 - literal_or(白名单)
 - not_literal_or(黑名单)
	 */
	@ApiField("filter_type")
	private String filterType;

	/**
	 * 函数名称列表
	 */
	@ApiListField("functions")
	@ApiField("string")
	private List<String> functions;

	public String getFilterType() {
		return this.filterType;
	}
	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public List<String> getFunctions() {
		return this.functions;
	}
	public void setFunctions(List<String> functions) {
		this.functions = functions;
	}

}
