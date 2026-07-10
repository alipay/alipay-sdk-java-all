package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 三方门店信息
 *
 * @author auto create
 * @since 1.0, 2026-06-04 11:27:53
 */
public class ShopThirdPartyInfo extends AlipayObject {

	private static final long serialVersionUID = 1325223229674553381L;

	/**
	 * 门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	/**
	 * 门店logo链接
	 */
	@ApiField("store_logo_url")
	private String storeLogoUrl;

	/**
	 * 门店名称
	 */
	@ApiField("store_name")
	private String storeName;

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreLogoUrl() {
		return this.storeLogoUrl;
	}
	public void setStoreLogoUrl(String storeLogoUrl) {
		this.storeLogoUrl = storeLogoUrl;
	}

	public String getStoreName() {
		return this.storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

}
