package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券可用地理位置
 *
 * @author auto create
 * @since 1.0, 2022-09-27 13:22:21
 */
public class VoucherAvailableGeographyScopeInfo extends AlipayObject {

	private static final long serialVersionUID = 8869378951133549454L;

	/**
	 * 券可用城市
	 */
	@ApiField("available_geography_city_info")
	private VoucherAvailableGeographyCityInfo availableGeographyCityInfo;

	/**
	 * 券可用地理位置类型。
	 */
	@ApiField("available_geography_scope_type")
	private String availableGeographyScopeType;

	/**
	 * 券可用门店
	 */
	@ApiField("available_geography_shop_info")
	private VoucherAvailableGeographyShopInfo availableGeographyShopInfo;

	public VoucherAvailableGeographyCityInfo getAvailableGeographyCityInfo() {
		return this.availableGeographyCityInfo;
	}
	public void setAvailableGeographyCityInfo(VoucherAvailableGeographyCityInfo availableGeographyCityInfo) {
		this.availableGeographyCityInfo = availableGeographyCityInfo;
	}

	public String getAvailableGeographyScopeType() {
		return this.availableGeographyScopeType;
	}
	public void setAvailableGeographyScopeType(String availableGeographyScopeType) {
		this.availableGeographyScopeType = availableGeographyScopeType;
	}

	public VoucherAvailableGeographyShopInfo getAvailableGeographyShopInfo() {
		return this.availableGeographyShopInfo;
	}
	public void setAvailableGeographyShopInfo(VoucherAvailableGeographyShopInfo availableGeographyShopInfo) {
		this.availableGeographyShopInfo = availableGeographyShopInfo;
	}

}
