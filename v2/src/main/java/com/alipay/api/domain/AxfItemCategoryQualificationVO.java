package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 所需资质信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:22:42
 */
public class AxfItemCategoryQualificationVO extends AlipayObject {

	private static final long serialVersionUID = 5135562985369782857L;

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

}
