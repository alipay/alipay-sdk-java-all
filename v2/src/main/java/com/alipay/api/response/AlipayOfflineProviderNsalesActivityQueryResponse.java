package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NSalesActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.nsales.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-16 15:07:55
 */
public class AlipayOfflineProviderNsalesActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4696267216738629841L;

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
