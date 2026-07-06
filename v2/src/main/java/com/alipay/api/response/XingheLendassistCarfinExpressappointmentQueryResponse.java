package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: xinghe.lendassist.carfin.expressappointment.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-04 15:37:54
 */
public class XingheLendassistCarfinExpressappointmentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4839245472827246178L;

	/** 
	 * 预约时间列表
	 */
	@ApiField("appointment_list")
	private String appointmentList;

	public void setAppointmentList(String appointmentList) {
		this.appointmentList = appointmentList;
	}
	public String getAppointmentList( ) {
		return this.appointmentList;
	}

}
