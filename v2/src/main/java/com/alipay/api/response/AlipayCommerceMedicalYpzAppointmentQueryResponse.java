package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YpzSdkEventProblemDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.appointment.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 15:47:55
 */
public class AlipayCommerceMedicalYpzAppointmentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7696716562581644824L;

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
