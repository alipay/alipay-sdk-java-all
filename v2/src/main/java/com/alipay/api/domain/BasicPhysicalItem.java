package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-07-17 16:32:52
 */
public class BasicPhysicalItem extends AlipayObject {

	private static final long serialVersionUID = 5573611955122667576L;

	/**
	 * 异常类型/结果提示（如"↑"、"↓"、"正常"），异常类型符合医学规范，针对有区间指标有结果展示
	 */
	@ApiField("abnormal_type")
	private String abnormalType;

	/**
	 * 项目编码
	 */
	@ApiField("project_code")
	private String projectCode;

	/**
	 * 子项名称（如"身高"）
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 参考区间（如"5.00-10.00"），参考区间符合医学规范
	 */
	@ApiField("range")
	private String range;

	/**
	 * 结果（如170）
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

	public String getProjectCode() {
		return this.projectCode;
	}
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return this.projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getRange() {
		return this.range;
	}
	public void setRange(String range) {
		this.range = range;
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
