package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YpzSdkPhoneQualityStatDTOOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.phonequality.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-22 15:27:56
 */
public class AlipayCommerceMedicalYpzPhonequalityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3895287599111138215L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("ypz_sdk_phone_quality_stat_d_t_o_one")
	private List<YpzSdkPhoneQualityStatDTOOne> data;

	public void setData(List<YpzSdkPhoneQualityStatDTOOne> data) {
		this.data = data;
	}
	public List<YpzSdkPhoneQualityStatDTOOne> getData( ) {
		return this.data;
	}

}
