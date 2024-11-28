package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 疾病识别
 *
 * @author auto create
 * @since 1.0, 2021-02-01 13:54:42
 */
public class AlipayInsDataDiseaseIdentifyModel extends AlipayObject {

	private static final long serialVersionUID = 3142938135213345898L;

	/**
	 * 疾病处理操作，例如标化(STANDARD)、打标(TAG)
	 */
	@ApiField("action_type")
	private String actionType;

	/**
	 * 疾病名称
	 */
	@ApiField("disease_name")
	private String diseaseName;

	public String getActionType() {
		return this.actionType;
	}
	public void setActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getDiseaseName() {
		return this.diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

}
