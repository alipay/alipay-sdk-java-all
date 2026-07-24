package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SolWifiShopInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.wifi.shop.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-22 10:30:14
 */
public class AlipayCommerceCityfacilitatorWifiShopBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3213611188899399735L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("sol_wifi_shop_info")
	private List<SolWifiShopInfo> data;

	public void setData(List<SolWifiShopInfo> data) {
		this.data = data;
	}
	public List<SolWifiShopInfo> getData( ) {
		return this.data;
	}

}
