package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-05-29 14:27:50
 */
public class AxfItemCategoryQualificationVO extends AlipayObject {

	private static final long serialVersionUID = 6127331883944922754L;

	/**
	 * 资质参数描述
	 */
	@ApiField("param_description")
	private String paramDescription;

	/**
	 * 资质名称
	 */
	@ApiField("qualification_name")
	private String qualificationName;

	/**
	 * 资质类型
	 */
	@ApiField("qualification_type")
	private String qualificationType;

	/**
	 * 是否必填
	 */
	@ApiField("required")
	private Boolean required;

	public String getParamDescription() {
		return this.paramDescription;
	}
	public void setParamDescription(String paramDescription) {
		this.paramDescription = paramDescription;
	}

	public String getQualificationName() {
		return this.qualificationName;
	}
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	public String getQualificationType() {
		return this.qualificationType;
	}
	public void setQualificationType(String qualificationType) {
		this.qualificationType = qualificationType;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

}
