package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * WIFI批量修改
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:29:33
 */
public class AlipayCommerceCityfacilitatorWifiModifyModel extends AlipayObject {

	private static final long serialVersionUID = 4415552667616625367L;

	/**
	 * null
	 */
	@ApiListField("shop_wifi_list")
	@ApiField("sol_shop_wifi_info")
	private List<SolShopWifiInfo> shopWifiList;

	public List<SolShopWifiInfo> getShopWifiList() {
		return this.shopWifiList;
	}
	public void setShopWifiList(List<SolShopWifiInfo> shopWifiList) {
		this.shopWifiList = shopWifiList;
	}

}
