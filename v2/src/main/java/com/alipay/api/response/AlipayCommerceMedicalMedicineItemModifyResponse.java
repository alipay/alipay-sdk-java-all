package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medicine.item.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-08 14:02:01
 */
public class AlipayCommerceMedicalMedicineItemModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6732484436758518894L;

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
