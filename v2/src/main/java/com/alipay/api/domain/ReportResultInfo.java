package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-12-15 13:37:41
 */
public class ReportResultInfo extends AlipayObject {

	private static final long serialVersionUID = 4222899547676456213L;

	/**
	 * 结果提示
	 */
	@ApiField("abnormal_type")
	private String abnormalType;

	/**
	 * 项目名称
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 参考值（浓度范围）
	 */
	@ApiField("ref_interval")
	private String refInterval;

	/**
	 * 检验结果
	 */
	@ApiField("result")
	private String result;

	/**
	 * 单位
	 */
	@ApiField("unit")
	private String unit;

	public String getAbnormalType() {
		return this.abnormalType;
	}
	public void setAbnormalType(String abnormalType) {
		this.abnormalType = abnormalType;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRefInterval() {
		return this.refInterval;
	}
	public void setRefInterval(String refInterval) {
		this.refInterval = refInterval;
	}

	public String getResult() {
		return this.result;
	}
	public void setResult(String result) {
		this.result = result;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
