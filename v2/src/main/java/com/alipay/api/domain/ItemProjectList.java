package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 体检项
 *
 * @author auto create
 * @since 1.0, 2026-04-07 17:57:28
 */
public class ItemProjectList extends AlipayObject {

	private static final long serialVersionUID = 6653494919998913236L;

	/**
	 * 检查结果
	 */
	@ApiField("check_result")
	private String checkResult;

	/**
	 * 指标范围
	 */
	@ApiField("indicators_range")
	private String indicatorsRange;

	/**
	 * 指标单位。
	 */
	@ApiField("indicators_unit")
	private String indicatorsUnit;

	/**
	 * 项目编码
	 */
	@ApiField("project_code")
	private String projectCode;

	/**
	 * 项目名
	 */
	@ApiField("project_name")
	private String projectName;

	public String getCheckResult() {
		return this.checkResult;
	}
	public void setCheckResult(String checkResult) {
		this.checkResult = checkResult;
	}

	public String getIndicatorsRange() {
		return this.indicatorsRange;
	}
	public void setIndicatorsRange(String indicatorsRange) {
		this.indicatorsRange = indicatorsRange;
	}

	public String getIndicatorsUnit() {
		return this.indicatorsUnit;
	}
	public void setIndicatorsUnit(String indicatorsUnit) {
		this.indicatorsUnit = indicatorsUnit;
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

}
