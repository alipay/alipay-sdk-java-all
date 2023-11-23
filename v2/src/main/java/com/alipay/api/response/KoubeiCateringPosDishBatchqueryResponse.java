package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PosCookDishQryModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dish.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class KoubeiCateringPosDishBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8781638795339532759L;

	/** 
	 * 菜谱中的菜品的列表
	 */
	@ApiField("cook_dish")
	private PosCookDishQryModel cookDish;

	public void setCookDish(PosCookDishQryModel cookDish) {
		this.cookDish = cookDish;
	}
	public PosCookDishQryModel getCookDish( ) {
		return this.cookDish;
	}

}
