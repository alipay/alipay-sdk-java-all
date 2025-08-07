package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PosDishQryModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dish.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:09
 */
public class KoubeiCateringPosDishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3637738526836724814L;

	/** 
	 * 口碑盒子菜品的详情
	 */
	@ApiField("pos_dish_qry_model")
	private PosDishQryModel posDishQryModel;

	public void setPosDishQryModel(PosDishQryModel posDishQryModel) {
		this.posDishQryModel = posDishQryModel;
	}
	public PosDishQryModel getPosDishQryModel( ) {
		return this.posDishQryModel;
	}

}
