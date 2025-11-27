package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecommendDoctorScmDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctor.scm.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-10-15 14:42:40
 */
public class AlipayCommerceMedicalDoctorScmQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5849949189656359745L;

	/** 
	 * 医生埋点信息列表
	 */
	@ApiListField("doctor_scm_list")
	@ApiField("recommend_doctor_scm_detail")
	private List<RecommendDoctorScmDetail> doctorScmList;

	public void setDoctorScmList(List<RecommendDoctorScmDetail> doctorScmList) {
		this.doctorScmList = doctorScmList;
	}
	public List<RecommendDoctorScmDetail> getDoctorScmList( ) {
		return this.doctorScmList;
	}

}
