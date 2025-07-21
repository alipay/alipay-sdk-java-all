package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 经营分析-流量分析-页面效果数据返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:02
 */
public class OpenApiOperationalAnalysisTrafficPageResult extends AlipayObject {

	private static final long serialVersionUID = 4679716783297466624L;

	/**
	 * 流量页面效果数据
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_traffic_page_alias_d_t_o")
	private List<OpenApiOperationAnalysisTrafficPageAliasDTO> items;

	public List<OpenApiOperationAnalysisTrafficPageAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisTrafficPageAliasDTO> items) {
		this.items = items;
	}

}
