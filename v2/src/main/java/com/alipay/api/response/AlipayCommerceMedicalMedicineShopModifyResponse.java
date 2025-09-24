package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medicine.shop.modify response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 16:07:05
 */
public class AlipayCommerceMedicalMedicineShopModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3589789738914159549L;

	/** 
	 * 门店修改申请Id
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 外部门店Id
	 */
	@ApiField("out_store_id")
	private String outStoreId;

	/** 
	 * 支付宝门店Id
	 */
	@ApiField("shop_id")
	private String shopId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}
	public String getOutStoreId( ) {
		return this.outStoreId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

}
