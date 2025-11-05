package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 患病信息
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFDisease extends AlipayObject {

	private static final long serialVersionUID = 5872554558953118687L;

	/**
	 * 疾病名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

}
