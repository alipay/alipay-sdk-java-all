package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询饿了么门店报名状态
 *
 * @author auto create
 * @since 1.0, 2025-06-26 10:32:15
 */
public class AntMerchantExpandAeactivityPlatformQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7153527594528234148L;

	/**
	 * 饿了么门店shopId
	 */
	@ApiField("ele_shopid")
	private String eleShopid;

	public String getEleShopid() {
		return this.eleShopid;
	}
	public void setEleShopid(String eleShopid) {
		this.eleShopid = eleShopid;
	}

}
