package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 经营分析-商品分析-商品总览趋势返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:58
 */
public class OpenApiOperationalAnalysisGoodsResult extends AlipayObject {

	private static final long serialVersionUID = 8846836612831396351L;

	/**
	 * 商品总览趋势数据
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_goods_alias_d_t_o")
	private List<OpenApiOperationAnalysisGoodsAliasDTO> items;

	public List<OpenApiOperationAnalysisGoodsAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisGoodsAliasDTO> items) {
		this.items = items;
	}

}
