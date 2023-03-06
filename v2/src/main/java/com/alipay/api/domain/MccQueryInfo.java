package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * mcc描述信息
 *
 * @author auto create
 * @since 1.0, 2021-09-09 15:21:41
 */
public class MccQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 2566283466677854756L;

	/**
	 * 是否特殊行业
	 */
	@ApiField("is_special")
	private Boolean isSpecial;

	/**
	 * 一级类目code
	 */
	@ApiField("mcc_level_1")
	private String mccLevel1;

	/**
	 * 商户一级类目名称
	 */
	@ApiField("mcc_level_1_name")
	private String mccLevel1Name;

	/**
	 * 二级类目code
	 */
	@ApiField("mcc_level_2")
	private String mccLevel2;

	/**
	 * 二级类目名称
	 */
	@ApiField("mcc_level_2_name")
	private String mccLevel2Name;

	/**
	 * 特殊行业需要上传的资质
	 */
	@ApiField("mcc_requirements")
	private String mccRequirements;

	/**
	 * 是否需要特殊资质
	 */
	@ApiField("special_qual_required")
	private Boolean specialQualRequired;

	public Boolean getIsSpecial() {
		return this.isSpecial;
	}
	public void setIsSpecial(Boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

	public String getMccLevel1() {
		return this.mccLevel1;
	}
	public void setMccLevel1(String mccLevel1) {
		this.mccLevel1 = mccLevel1;
	}

	public String getMccLevel1Name() {
		return this.mccLevel1Name;
	}
	public void setMccLevel1Name(String mccLevel1Name) {
		this.mccLevel1Name = mccLevel1Name;
	}

	public String getMccLevel2() {
		return this.mccLevel2;
	}
	public void setMccLevel2(String mccLevel2) {
		this.mccLevel2 = mccLevel2;
	}

	public String getMccLevel2Name() {
		return this.mccLevel2Name;
	}
	public void setMccLevel2Name(String mccLevel2Name) {
		this.mccLevel2Name = mccLevel2Name;
	}

	public String getMccRequirements() {
		return this.mccRequirements;
	}
	public void setMccRequirements(String mccRequirements) {
		this.mccRequirements = mccRequirements;
	}

	public Boolean getSpecialQualRequired() {
		return this.specialQualRequired;
	}
	public void setSpecialQualRequired(Boolean specialQualRequired) {
		this.specialQualRequired = specialQualRequired;
	}

}
