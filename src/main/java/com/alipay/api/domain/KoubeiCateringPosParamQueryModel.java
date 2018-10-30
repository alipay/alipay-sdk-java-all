package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取系统参数配置
 *
 * @author auto create
 * @since 1.0, 2018-10-26 01:24:13
 */
public class KoubeiCateringPosParamQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4443691329214471494L;

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
