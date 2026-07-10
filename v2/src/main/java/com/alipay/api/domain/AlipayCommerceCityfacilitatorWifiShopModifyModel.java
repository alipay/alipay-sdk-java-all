package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店批量修改
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:32:55
 */
public class AlipayCommerceCityfacilitatorWifiShopModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3517941546649639392L;

	/**
	 * null
	 */
	@ApiListField("shop_info_list")
	@ApiField("sol_wifi_shop_info")
	private List<SolWifiShopInfo> shopInfoList;

	public List<SolWifiShopInfo> getShopInfoList() {
		return this.shopInfoList;
	}
	public void setShopInfoList(List<SolWifiShopInfo> shopInfoList) {
		this.shopInfoList = shopInfoList;
	}

}
