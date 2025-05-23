package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品分析-商品排行返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:01
 */
public class OpenApiOperationalAnalysisGoodsRankResult extends AlipayObject {

	private static final long serialVersionUID = 7877992339135928633L;

	/**
	 * 商品排行返回数据结构体
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_goods_rank_alias_d_t_o")
	private List<OpenApiOperationAnalysisGoodsRankAliasDTO> items;

	public List<OpenApiOperationAnalysisGoodsRankAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisGoodsRankAliasDTO> items) {
		this.items = items;
	}

}
