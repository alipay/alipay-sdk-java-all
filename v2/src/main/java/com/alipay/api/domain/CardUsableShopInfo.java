package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 卡可使用门店信息
 *
 * @author auto create
 * @since 1.0, 2023-11-06 15:14:33
 */
public class CardUsableShopInfo extends AlipayObject {

	private static final long serialVersionUID = 2499974622724719549L;

	/**
	 * 门店ID
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
