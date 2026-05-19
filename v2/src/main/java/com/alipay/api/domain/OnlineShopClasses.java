package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业电商店铺信息
 *
 * @author auto create
 * @since 1.0, 2026-04-27 09:57:34
 */
public class OnlineShopClasses extends AlipayObject {

	private static final long serialVersionUID = 3296427514685234922L;

	/**
	 * 电商平台名称
	 */
	@ApiField("platform_name")
	private String platformName;

	/**
	 * 店铺名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getPlatformName() {
		return this.platformName;
	}
	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
