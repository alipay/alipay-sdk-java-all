package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NPromoActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npromoactivity.effect response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-18 14:21:35
 */
public class AlipayOfflineProviderNpromoactivityEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 6234441392375154634L;

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
