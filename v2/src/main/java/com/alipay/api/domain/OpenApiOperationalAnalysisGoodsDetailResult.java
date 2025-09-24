package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品分析-商品详情返回结果
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:59
 */
public class OpenApiOperationalAnalysisGoodsDetailResult extends AlipayObject {

	private static final long serialVersionUID = 1272635739712373526L;

	/**
	 * 商品详情返回结构体
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_goods_detail_alias_d_t_o")
	private List<OpenApiOperationAnalysisGoodsDetailAliasDTO> items;

	public List<OpenApiOperationAnalysisGoodsDetailAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisGoodsDetailAliasDTO> items) {
		this.items = items;
	}

}
