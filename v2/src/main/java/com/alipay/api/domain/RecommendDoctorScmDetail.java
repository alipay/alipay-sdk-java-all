package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐搜素医生埋点详情
 *
 * @author auto create
 * @since 1.0, 2025-10-15 14:40:17
 */
public class RecommendDoctorScmDetail extends AlipayObject {

	private static final long serialVersionUID = 2131236149582464781L;

	/**
	 * 业务埋点
	 */
	@ApiField("biz_scm")
	private String bizScm;

	/**
	 * 外部医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 医生行业id
	 */
	@ApiField("doctor_inner_id")
	private String doctorInnerId;

	/**
	 * 欧拉埋点
	 */
	@ApiField("med_ora_scm")
	private String medOraScm;

	public String getBizScm() {
		return this.bizScm;
	}
	public void setBizScm(String bizScm) {
		this.bizScm = bizScm;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorInnerId() {
		return this.doctorInnerId;
	}
	public void setDoctorInnerId(String doctorInnerId) {
		this.doctorInnerId = doctorInnerId;
	}

	public String getMedOraScm() {
		return this.medOraScm;
	}
	public void setMedOraScm(String medOraScm) {
		this.medOraScm = medOraScm;
	}

}
