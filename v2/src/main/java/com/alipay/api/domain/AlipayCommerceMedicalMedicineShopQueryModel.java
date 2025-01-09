package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗药品门店查询接口
 *
 * @author auto create
 * @since 1.0, 2024-06-12 16:03:23
 */
public class AlipayCommerceMedicalMedicineShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5455222488912355535L;

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

	public String getOutStoreId() {
		return this.outStoreId;
	}
	public void setOutStoreId(String outStoreId) {
		this.outStoreId = outStoreId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
