package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 经营分析-流量分析-来源分析返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:50
 */
public class OpenApiOperationalAnalysisTrafficSourceResult extends AlipayObject {

	private static final long serialVersionUID = 6739421246576961495L;

	/**
	 * 流量来源分析数据
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_traffic_source_alias_d_t_o")
	private List<OpenApiOperationAnalysisTrafficSourceAliasDTO> items;

	public List<OpenApiOperationAnalysisTrafficSourceAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisTrafficSourceAliasDTO> items) {
		this.items = items;
	}

}
