package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NPromoActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npromoactivity.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-18 14:10:41
 */
public class AlipayOfflineProviderNpromoactivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4612135536715227951L;

	/** 
	 * 用户活动
	 */
	@ApiField("activity")
	private NPromoActivity activity;

	public void setActivity(NPromoActivity activity) {
		this.activity = activity;
	}
	public NPromoActivity getActivity( ) {
		return this.activity;
	}

}
