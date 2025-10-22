package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫问诊小结
 *
 * @author auto create
 * @since 1.0, 2025-10-17 17:59:15
 */
public class HDFMedicalSummary extends AlipayObject {

	private static final long serialVersionUID = 6161596662999499174L;

	/**
	 * diacrisis初步诊断
	 */
	@ApiField("diacrisis")
	private String diacrisis;

	/**
	 * 处置
	 */
	@ApiField("idea")
	private String idea;

	/**
	 * 病历概要
	 */
	@ApiField("summary")
	private String summary;

	public String getDiacrisis() {
		return this.diacrisis;
	}
	public void setDiacrisis(String diacrisis) {
		this.diacrisis = diacrisis;
	}

	public String getIdea() {
		return this.idea;
	}
	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

}
