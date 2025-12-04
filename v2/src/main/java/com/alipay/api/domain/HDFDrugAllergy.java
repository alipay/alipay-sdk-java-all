package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药物过敏史
 *
 * @author auto create
 * @since 1.0, 2025-11-03 15:32:13
 */
public class HDFDrugAllergy extends AlipayObject {

	private static final long serialVersionUID = 5852895866672839833L;

	/**
	 * 过敏描述
	 */
	@ApiField("allergy_desc")
	private String allergyDesc;

	/**
	 * 是/否/不清楚
	 */
	@ApiField("is_allergy")
	private String isAllergy;

	public String getAllergyDesc() {
		return this.allergyDesc;
	}
	public void setAllergyDesc(String allergyDesc) {
		this.allergyDesc = allergyDesc;
	}

	public String getIsAllergy() {
		return this.isAllergy;
	}
	public void setIsAllergy(String isAllergy) {
		this.isAllergy = isAllergy;
	}

}
