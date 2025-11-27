package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AssetEcoOrderQuantity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.eco.quantity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 19:32:36
 */
public class AntMerchantExpandEcoQuantityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2723215917447975653L;

	/** 
	 * 生态供应商订单数量明细，从入参年月日期初到月末的集合
	 */
	@ApiListField("eco_order_quantity")
	@ApiField("asset_eco_order_quantity")
	private List<AssetEcoOrderQuantity> ecoOrderQuantity;

	public void setEcoOrderQuantity(List<AssetEcoOrderQuantity> ecoOrderQuantity) {
		this.ecoOrderQuantity = ecoOrderQuantity;
	}
	public List<AssetEcoOrderQuantity> getEcoOrderQuantity( ) {
		return this.ecoOrderQuantity;
	}

}
