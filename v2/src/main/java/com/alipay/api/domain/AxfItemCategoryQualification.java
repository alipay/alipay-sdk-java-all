package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 安心生活类目资质信息
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:15:29
 */
public class AxfItemCategoryQualification extends AlipayObject {

	private static final long serialVersionUID = 7688331587958945891L;

	/**
	 * 资质参数描述
	 */
	@ApiField("param_description")
	private String paramDescription;

	/**
	 * 资质内容。参考类目模版响应接口所需资质参数描述。如果需要图片先走图片上传接口获取图片id
	 */
	@ApiField("qualification_content")
	private String qualificationContent;

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

	public String getQualificationContent() {
		return this.qualificationContent;
	}
	public void setQualificationContent(String qualificationContent) {
		this.qualificationContent = qualificationContent;
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
