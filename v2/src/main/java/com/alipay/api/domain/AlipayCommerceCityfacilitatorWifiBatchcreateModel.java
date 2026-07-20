package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * WIFI批量新增
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:32:55
 */
public class AlipayCommerceCityfacilitatorWifiBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 4385311635973675629L;

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
