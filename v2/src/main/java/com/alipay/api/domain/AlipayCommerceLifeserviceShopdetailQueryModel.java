package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店正本详情查询
 *
 * @author auto create
 * @since 1.0, 2026-08-06 18:40:59
 */
public class AlipayCommerceLifeserviceShopdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8481493942738634572L;

	/**
	 * 门店主键ID【必填】
	 */
	@ApiField("store_id")
	private String storeId;

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
