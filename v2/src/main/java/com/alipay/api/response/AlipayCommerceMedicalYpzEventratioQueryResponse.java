package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YpzSdkEventRatioDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.eventratio.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 11:40:53
 */
public class AlipayCommerceMedicalYpzEventratioQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2475876921437799566L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("ypz_sdk_event_ratio_d_t_o")
	private List<YpzSdkEventRatioDTO> data;

	public void setData(List<YpzSdkEventRatioDTO> data) {
		this.data = data;
	}
	public List<YpzSdkEventRatioDTO> getData( ) {
		return this.data;
	}

}
