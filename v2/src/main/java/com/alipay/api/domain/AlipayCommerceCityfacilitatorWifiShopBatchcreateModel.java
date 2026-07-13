package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 门店批量新增
 *
 * @author auto create
 * @since 1.0, 2026-06-22 10:30:14
 */
public class AlipayCommerceCityfacilitatorWifiShopBatchcreateModel extends AlipayObject {

	private static final long serialVersionUID = 6732193368483191545L;

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
