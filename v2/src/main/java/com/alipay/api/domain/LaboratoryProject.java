package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 检验项目
 *
 * @author auto create
 * @since 1.0, 2026-04-07 17:57:28
 */
public class LaboratoryProject extends AlipayObject {

	private static final long serialVersionUID = 7522359531644154133L;

	/**
	 * 异常类型：正常、偏高、偏低、上升、下降等
	 */
	@ApiField("abnormal_type")
	private String abnormalType;

	/**
	 * 项目名
	 */
	@ApiField("project_name")
	private String projectName;

	/**
	 * 项目结果
	 */
	@ApiField("project_result")
	private String projectResult;

	/**
	 * 参考区间
	 */
	@ApiField("ref_interval")
	private String refInterval;

	/**
	 * 单位。参考区间+单位组合成参考值。
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

	public String getProjectResult() {
		return this.projectResult;
	}
	public void setProjectResult(String projectResult) {
		this.projectResult = projectResult;
	}

	public String getRefInterval() {
		return this.refInterval;
	}
	public void setRefInterval(String refInterval) {
		this.refInterval = refInterval;
	}

	public String getUnit() {
		return this.unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
