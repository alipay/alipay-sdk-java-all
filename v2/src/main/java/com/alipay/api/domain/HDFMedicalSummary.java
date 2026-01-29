package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 好大夫问诊小结
 *
 * @author auto create
 * @since 1.0, 2025-11-11 15:59:10
 */
public class HDFMedicalSummary extends AlipayObject {

	private static final long serialVersionUID = 3422443716754499898L;

	/**
	 * diacrisis初步诊断
	 */
	@ApiField("diacrisis")
	private String diacrisis;

	/**
	 * 处置 当前字段已废弃(HDFMedicalSummary字段不需要传执行项)
	 */
	@ApiField("idea")
	@Deprecated
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
