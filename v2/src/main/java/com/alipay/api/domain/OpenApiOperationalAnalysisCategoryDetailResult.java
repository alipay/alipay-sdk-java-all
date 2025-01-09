package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品分析-品类详情返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:05
 */
public class OpenApiOperationalAnalysisCategoryDetailResult extends AlipayObject {

	private static final long serialVersionUID = 2212461167314569732L;

	/**
	 * 品类详情返回结构体
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_category_detail_alias_d_t_o")
	private List<OpenApiOperationAnalysisCategoryDetailAliasDTO> items;

	public List<OpenApiOperationAnalysisCategoryDetailAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisCategoryDetailAliasDTO> items) {
		this.items = items;
	}

}
