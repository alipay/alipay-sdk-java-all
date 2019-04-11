package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaginationCook;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.cook.condition.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-09 17:50:01
 */
public class KoubeiCateringCookConditionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2125651394694264685L;

	/** 
	 * 口碑菜谱模型列表
	 */
	@ApiField("kb_dish_cook_page_info")
	private PaginationCook kbDishCookPageInfo;

	public void setKbDishCookPageInfo(PaginationCook kbDishCookPageInfo) {
		this.kbDishCookPageInfo = kbDishCookPageInfo;
	}
	public PaginationCook getKbDishCookPageInfo( ) {
		return this.kbDishCookPageInfo;
	}

}
