package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class WesternMedicationInformation extends AlipayObject {

	private static final long serialVersionUID = 6857463331441422922L;

	/**
	 * 药品用量  eg：每次0.5g（2粒），每日3次
	 */
	@ApiField("dosage")
	private String dosage;

	/**
	 * 药品名称 eg： 阿司匹林
	 */
	@ApiField("medical_name")
	private String medicalName;

	/**
	 * 备注 eg： 饭后服用，连用7天
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 规格eg： 0.25g *24粒
	 */
	@ApiField("spec")
	private String spec;

	/**
	 * 用法  eg：20.00（g）
	 */
	@ApiField("usage")
	private String usage;

	public String getDosage() {
		return this.dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getMedicalName() {
		return this.medicalName;
	}
	public void setMedicalName(String medicalName) {
		this.medicalName = medicalName;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getSpec() {
		return this.spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}

	public String getUsage() {
		return this.usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}

}
