package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medicine.item.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-20 13:12:04
 */
public class AlipayCommerceMedicalMedicineItemCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1416552122473756627L;

	/** 
	 * 支付宝平台侧商品ID，是支付宝平台侧商品的唯一标识
	 */
	@ApiField("item_id")
	private String itemId;

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

}
