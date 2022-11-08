package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地理位置
 *
 * @author auto create
 * @since 1.0, 2022-08-24 16:05:57
 */
public class VoucherAvailableGeographyScopeResultInfo extends AlipayObject {

	private static final long serialVersionUID = 8583648125663876735L;

	/**
	 * 可用门店结果。
	 */
	@ApiField("available_geography_shop_result_info")
	private VoucherAvailableGeographyShopResultInfo availableGeographyShopResultInfo;

	public VoucherAvailableGeographyShopResultInfo getAvailableGeographyShopResultInfo() {
		return this.availableGeographyShopResultInfo;
	}
	public void setAvailableGeographyShopResultInfo(VoucherAvailableGeographyShopResultInfo availableGeographyShopResultInfo) {
		this.availableGeographyShopResultInfo = availableGeographyShopResultInfo;
	}

}
