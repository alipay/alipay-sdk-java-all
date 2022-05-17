package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcoAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.antest.applist.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-08 21:29:12
 */
public class AlipayCommerceAntestApplistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6424948478774652923L;

	/** 
	 * 小程序列表
	 */
	@ApiListField("data")
	@ApiField("eco_app_info")
	private List<EcoAppInfo> data;

	public void setData(List<EcoAppInfo> data) {
		this.data = data;
	}
	public List<EcoAppInfo> getData( ) {
		return this.data;
	}

}
