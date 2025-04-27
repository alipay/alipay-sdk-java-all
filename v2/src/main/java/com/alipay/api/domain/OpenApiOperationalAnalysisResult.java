package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用于小程序云-智能营销-增长分析模块下的经营概况、经营分析等接口的返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:56
 */
public class OpenApiOperationalAnalysisResult extends AlipayObject {

	private static final long serialVersionUID = 4157396787159244157L;

	/**
	 * 接口返回数据
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_overview_alias_d_t_o")
	private List<OpenApiOperationOverviewAliasDTO> items;

	public List<OpenApiOperationOverviewAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationOverviewAliasDTO> items) {
		this.items = items;
	}

}
