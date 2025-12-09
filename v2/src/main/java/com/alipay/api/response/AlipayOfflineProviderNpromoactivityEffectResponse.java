package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.NPromoActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.npromoactivity.effect response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 12:32:37
 */
public class AlipayOfflineProviderNpromoactivityEffectResponse extends AlipayResponse {

	private static final long serialVersionUID = 7419457721823481574L;

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
