package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索推荐医生详情
 *
 * @author auto create
 * @since 1.0, 2025-10-15 14:40:02
 */
public class RecommendDoctorDetail extends AlipayObject {

	private static final long serialVersionUID = 8747386736782643231L;

	/**
	 * 行业医生id
	 */
	@ApiField("doctor_inner_id")
	private String doctorInnerId;

	/**
	 * 好大夫医生id
	 */
	@ApiField("hdf_doctor_id")
	private String hdfDoctorId;

	public String getDoctorInnerId() {
		return this.doctorInnerId;
	}
	public void setDoctorInnerId(String doctorInnerId) {
		this.doctorInnerId = doctorInnerId;
	}

	public String getHdfDoctorId() {
		return this.hdfDoctorId;
	}
	public void setHdfDoctorId(String hdfDoctorId) {
		this.hdfDoctorId = hdfDoctorId;
	}

}
