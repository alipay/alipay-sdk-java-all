package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 增长分析(生意参谋)-经营分析-客户分析下的消费层级返回体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:54
 */
public class OpenApiCustomerAnalysisTradeLevelResult extends AlipayObject {

	private static final long serialVersionUID = 3492195874945614267L;

	/**
	 * 消费层级返回结构体
	 */
	@ApiListField("items")
	@ApiField("open_api_operation_analysis_customer_trd_lvl_alias_d_t_o")
	private List<OpenApiOperationAnalysisCustomerTrdLvlAliasDTO> items;

	public List<OpenApiOperationAnalysisCustomerTrdLvlAliasDTO> getItems() {
		return this.items;
	}
	public void setItems(List<OpenApiOperationAnalysisCustomerTrdLvlAliasDTO> items) {
		this.items = items;
	}

}
