package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class FamilyHistory extends AlipayObject {

	private static final long serialVersionUID = 2344485484765279114L;

	/**
	 * 疾病名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	/**
	 * 患者与本人关系（本人、配偶、子女）
	 */
	@ApiField("family_relationship")
	private String familyRelationship;

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getFamilyRelationship() {
		return this.familyRelationship;
	}
	public void setFamilyRelationship(String familyRelationship) {
		this.familyRelationship = familyRelationship;
	}

}
