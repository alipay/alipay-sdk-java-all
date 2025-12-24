package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 经营分析-商品分析-品类排行返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:50:03
 */
public class OpenApiOperationalAnalysisCategoryRankResult extends AlipayObject {

	private static final long serialVersionUID = 7722628144961298491L;

	/**
	 * 品类排行数据
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_category_rank_alias_d_t_o")
	private List<OpenApiOperationAnalysisCategoryRankAliasDTO> items;

	public List<OpenApiOperationAnalysisCategoryRankAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisCategoryRankAliasDTO> items) {
		this.items = items;
	}

}
