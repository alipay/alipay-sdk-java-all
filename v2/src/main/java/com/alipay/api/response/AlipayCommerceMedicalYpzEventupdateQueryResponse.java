package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YpzSdkEventDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.eventupdate.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 11:41:00
 */
public class AlipayCommerceMedicalYpzEventupdateQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8168482578922264486L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("ypz_sdk_event_detail_d_t_o")
	private List<YpzSdkEventDetailDTO> data;

	public void setData(List<YpzSdkEventDetailDTO> data) {
		this.data = data;
	}
	public List<YpzSdkEventDetailDTO> getData( ) {
		return this.data;
	}

}
