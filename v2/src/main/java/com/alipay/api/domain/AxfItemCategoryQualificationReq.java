package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-01-28 15:22:42
 */
public class AxfItemCategoryQualificationReq extends AlipayObject {

	private static final long serialVersionUID = 3848685758598718474L;

	/**
	 * 资质内容。参考类目模版响应接口所需资质参数描述。如果需要图片先走图片上传接口获取图片id
	 */
	@ApiField("qualification_content")
	private String qualificationContent;

	/**
	 * 资质类型
	 */
	@ApiField("qualification_type")
	private String qualificationType;

	public String getQualificationContent() {
		return this.qualificationContent;
	}
	public void setQualificationContent(String qualificationContent) {
		this.qualificationContent = qualificationContent;
	}

	public String getQualificationType() {
		return this.qualificationType;
	}
	public void setQualificationType(String qualificationType) {
		this.qualificationType = qualificationType;
	}

}
