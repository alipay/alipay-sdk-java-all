package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:29:33
 */
public class SolShopWifiInfo extends AlipayObject {

	private static final long serialVersionUID = 6533732264651262914L;

	/**
	 * 门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * null
	 */
	@ApiListField("wifi_list")
	@ApiField("sol_wifi_info")
	private List<SolWifiInfo> wifiList;

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public List<SolWifiInfo> getWifiList() {
		return this.wifiList;
	}
	public void setWifiList(List<SolWifiInfo> wifiList) {
		this.wifiList = wifiList;
	}

}
