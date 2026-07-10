package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SolWifiInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.cityfacilitator.wifi.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-22 10:32:55
 */
public class AlipayCommerceCityfacilitatorWifiBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3451416326693921738L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("sol_wifi_info")
	private List<SolWifiInfo> data;

	public void setData(List<SolWifiInfo> data) {
		this.data = data;
	}
	public List<SolWifiInfo> getData( ) {
		return this.data;
	}

}
