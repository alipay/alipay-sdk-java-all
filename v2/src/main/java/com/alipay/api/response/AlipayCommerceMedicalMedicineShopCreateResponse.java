package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.medicine.shop.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 16:07:05
 */
public class AlipayCommerceMedicalMedicineShopCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 5525264761897536283L;

	/** 
	 * 门店创建申请Id
	 */
	@ApiField("apply_id")
	private String applyId;

	/** 
	 * 触发幂等时返回已存在的门店shopId
	 */
	@ApiField("exist_shop_id")
	private String existShopId;

	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	public String getApplyId( ) {
		return this.applyId;
	}

	public void setExistShopId(String existShopId) {
		this.existShopId = existShopId;
	}
	public String getExistShopId( ) {
		return this.existShopId;
	}

}
