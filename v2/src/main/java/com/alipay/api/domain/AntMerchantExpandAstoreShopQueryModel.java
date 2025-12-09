package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询门店信息
 *
 * @author auto create
 * @since 1.0, 2025-10-23 10:09:27
 */
public class AntMerchantExpandAstoreShopQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2271624528989232452L;

	/**
	 * 门店id
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
