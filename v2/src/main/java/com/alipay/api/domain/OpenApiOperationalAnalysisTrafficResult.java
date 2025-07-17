package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 经营分析-流量分析-流量总览趋势返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:51
 */
public class OpenApiOperationalAnalysisTrafficResult extends AlipayObject {

	private static final long serialVersionUID = 1767828826642835197L;

	/**
	 * 流量总览趋势数据
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_traffic_alias_d_t_o")
	private List<OpenApiOperationAnalysisTrafficAliasDTO> items;

	public List<OpenApiOperationAnalysisTrafficAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisTrafficAliasDTO> items) {
		this.items = items;
	}

}
