package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaginationDish;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.condition.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-18 16:54:43
 */
public class KoubeiCateringDishConditionBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7341285246713799585L;

	/** 
	 * 菜品分页信息
	 */
	@ApiField("kb_dish_page_info")
	private PaginationDish kbDishPageInfo;

	public void setKbDishPageInfo(PaginationDish kbDishPageInfo) {
		this.kbDishPageInfo = kbDishPageInfo;
	}
	public PaginationDish getKbDishPageInfo( ) {
		return this.kbDishPageInfo;
	}

}
