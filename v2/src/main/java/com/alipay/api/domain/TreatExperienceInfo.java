package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 治疗经验
 *
 * @author auto create
 * @since 1.0, 2026-08-27 20:02:48
 */
public class TreatExperienceInfo extends AlipayObject {

	private static final long serialVersionUID = 4739271754183835141L;

	/**
	 * 疾病治疗数量
	 */
	@ApiField("count")
	private String count;

	/**
	 * 标签跳转链接
	 */
	@ApiField("detail_url")
	private String detailUrl;

	/**
	 * 好大夫疾病id
	 */
	@ApiField("disease_id")
	private String diseaseId;

	/**
	 * 好大夫疾病名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	public String getCount() {
		return this.count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	public String getDetailUrl() {
		return this.detailUrl;
	}
	public void setDetailUrl(String detailUrl) {
		this.detailUrl = detailUrl;
	}

	public String getDiseaseId() {
		return this.diseaseId;
	}
	public void setDiseaseId(String diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

}
