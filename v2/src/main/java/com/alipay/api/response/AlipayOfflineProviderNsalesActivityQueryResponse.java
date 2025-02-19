package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NSalesActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.nsales.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-27 22:52:21
 */
public class AlipayOfflineProviderNsalesActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8877646173948751524L;

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
