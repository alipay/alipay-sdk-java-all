package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DoctorBasicInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctorinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-27 20:07:48
 */
public class AlipayCommerceMedicalDoctorinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8522438725191442436L;

	/** 
	 * null
	 */
	@ApiListField("doctor_info_list")
	@ApiField("doctor_basic_info")
	private List<DoctorBasicInfo> doctorInfoList;

	public void setDoctorInfoList(List<DoctorBasicInfo> doctorInfoList) {
		this.doctorInfoList = doctorInfoList;
	}
	public List<DoctorBasicInfo> getDoctorInfoList( ) {
		return this.doctorInfoList;
	}

}
