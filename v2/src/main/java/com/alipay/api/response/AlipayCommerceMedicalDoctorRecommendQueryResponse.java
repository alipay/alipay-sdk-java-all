package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecommendDoctorDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.doctor.recommend.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-10 20:25:55
 */
public class AlipayCommerceMedicalDoctorRecommendQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2448761783813442477L;

	/** 
	 * 搜索推荐医生信息
	 */
	@ApiListField("hdf_doctor_list")
	@ApiField("recommend_doctor_detail")
	private List<RecommendDoctorDetail> hdfDoctorList;

	public void setHdfDoctorList(List<RecommendDoctorDetail> hdfDoctorList) {
		this.hdfDoctorList = hdfDoctorList;
	}
	public List<RecommendDoctorDetail> getHdfDoctorList( ) {
		return this.hdfDoctorList;
	}

}
