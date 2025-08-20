package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NSalesActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.nsales.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-02-27 14:32:25
 */
public class AlipayOfflineProviderNsalesActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1783529243958656177L;

	/** 
	 * 卖进订单活动信息
	 */
	@ApiField("activity")
	private NSalesActivity activity;

	public void setActivity(NSalesActivity activity) {
		this.activity = activity;
	}
	public NSalesActivity getActivity( ) {
		return this.activity;
	}

}
