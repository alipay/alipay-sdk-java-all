package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YpzSdkEventProblemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.outpatient.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-23 11:42:58
 */
public class AlipayCommerceMedicalYpzOutpatientQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4763476165264389797L;

	/** 
	 * null
	 */
	@ApiListField("data")
	@ApiField("ypz_sdk_event_problem_d_t_o")
	private List<YpzSdkEventProblemDTO> data;

	public void setData(List<YpzSdkEventProblemDTO> data) {
		this.data = data;
	}
	public List<YpzSdkEventProblemDTO> getData( ) {
		return this.data;
	}

}
