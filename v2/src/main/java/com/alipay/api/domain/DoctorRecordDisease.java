package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医生治疗经验信息
 *
 * @author auto create
 * @since 1.0, 2026-08-27 20:28:46
 */
public class DoctorRecordDisease extends AlipayObject {

	private static final long serialVersionUID = 3651282966186399612L;

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
	 * 好大夫疾病名
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
