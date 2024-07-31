package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 疾病标准对象
 *
 * @author auto create
 * @since 1.0, 2020-11-19 16:34:31
 */
public class DiseaseDTO extends AlipayObject {

	private static final long serialVersionUID = 2896928311245734723L;

	/**
	 * 疾病标准编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 疾病标准名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

}
