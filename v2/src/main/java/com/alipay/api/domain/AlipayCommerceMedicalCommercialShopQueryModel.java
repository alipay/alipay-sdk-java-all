package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店信息和资质查询接口
 *
 * @author auto create
 * @since 1.0, 2025-07-22 11:48:14
 */
public class AlipayCommerceMedicalCommercialShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4654218366148574954L;

	/**
	 * 蚂蚁门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

}
