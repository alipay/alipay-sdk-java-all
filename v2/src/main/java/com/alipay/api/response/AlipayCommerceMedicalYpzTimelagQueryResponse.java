package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YpzSdkTimeLagDTOOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.timelag.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-13 17:17:53
 */
public class AlipayCommerceMedicalYpzTimelagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2722187992997734464L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("ypz_sdk_time_lag_d_t_o_one")
	private List<YpzSdkTimeLagDTOOne> data;

	public void setData(List<YpzSdkTimeLagDTOOne> data) {
		this.data = data;
	}
	public List<YpzSdkTimeLagDTOOne> getData( ) {
		return this.data;
	}

}
