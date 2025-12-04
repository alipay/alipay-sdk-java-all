package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 慢性病
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFChronicDisease extends AlipayObject {

	private static final long serialVersionUID = 1893185974195429415L;

	/**
	 * 慢性病描述
	 */
	@ApiField("chronic_desc")
	private String chronicDesc;

	/**
	 * 患病时长
	 */
	@ApiField("have_time")
	private String haveTime;

	/**
	 * 治疗
	 */
	@ApiField("treatment")
	private String treatment;

	/**
	 * 疾病
	 */
	@ApiField("type")
	private String type;

	public String getChronicDesc() {
		return this.chronicDesc;
	}
	public void setChronicDesc(String chronicDesc) {
		this.chronicDesc = chronicDesc;
	}

	public String getHaveTime() {
		return this.haveTime;
	}
	public void setHaveTime(String haveTime) {
		this.haveTime = haveTime;
	}

	public String getTreatment() {
		return this.treatment;
	}
	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
