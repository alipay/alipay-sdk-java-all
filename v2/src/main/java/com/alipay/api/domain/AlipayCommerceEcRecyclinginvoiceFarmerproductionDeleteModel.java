package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 农户产量删除接口
 *
 * @author auto create
 * @since 1.0, 2026-06-16 16:50:39
 */
public class AlipayCommerceEcRecyclinginvoiceFarmerproductionDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 4551768378644466566L;

	/**
	 * 产量记录ID
	 */
	@ApiField("farmer_item_id")
	private String farmerItemId;

	public String getFarmerItemId() {
		return this.farmerItemId;
	}
	public void setFarmerItemId(String farmerItemId) {
		this.farmerItemId = farmerItemId;
	}

}
