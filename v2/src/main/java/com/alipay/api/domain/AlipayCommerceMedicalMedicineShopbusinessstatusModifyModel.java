package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗药品门店修改营业状态接口
 *
 * @author auto create
 * @since 1.0, 2024-06-12 15:20:22
 */
public class AlipayCommerceMedicalMedicineShopbusinessstatusModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4684972374292474611L;

	/**
	 * 门店营业状态
	 */
	@ApiField("business_status")
	private String businessStatus;

	/**
	 * shop_id和out_store_id都传时以shop_id为准
	 */
	@ApiField("out_store_id")
	private String outStoreId;

	/**
	 * shop_id和out_store_id都传时以shop_id为准
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getBusinessStatus() {
		return this.businessStatus;
	}
	public void setBusinessStatus(String businessStatus) {
		this.businessStatus = businessStatus;
	}

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
