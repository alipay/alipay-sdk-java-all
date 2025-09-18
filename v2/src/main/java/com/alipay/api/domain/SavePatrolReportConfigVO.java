package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一方报事配置
 *
 * @author auto create
 * @since 1.0, 2025-06-25 15:22:32
 */
public class SavePatrolReportConfigVO extends AlipayObject {

	private static final long serialVersionUID = 3621232652743335692L;

	/**
	 * null
	 */
	@ApiListField("report_config")
	@ApiField("report_config_v_o")
	private List<ReportConfigVO> reportConfig;

	/**
	 * 报事配置开关 true|false
	 */
	@ApiField("report_switch")
	private Boolean reportSwitch;

	public List<ReportConfigVO> getReportConfig() {
		return this.reportConfig;
	}
	public void setReportConfig(List<ReportConfigVO> reportConfig) {
		this.reportConfig = reportConfig;
	}

	public Boolean getReportSwitch() {
		return this.reportSwitch;
	}
	public void setReportSwitch(Boolean reportSwitch) {
		this.reportSwitch = reportSwitch;
	}

}
