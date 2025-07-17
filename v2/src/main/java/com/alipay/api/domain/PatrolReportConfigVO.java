package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一方报事配置
 *
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:29
 */
public class PatrolReportConfigVO extends AlipayObject {

	private static final long serialVersionUID = 5113789137119342858L;

	/**
	 * null
	 */
	@ApiListField("report_config")
	@ApiField("report_config")
	private List<ReportConfig> reportConfig;

	/**
	 * 报事配置开关 true|false
	 */
	@ApiField("report_switch")
	private Boolean reportSwitch;

	public List<ReportConfig> getReportConfig() {
		return this.reportConfig;
	}
	public void setReportConfig(List<ReportConfig> reportConfig) {
		this.reportConfig = reportConfig;
	}

	public Boolean getReportSwitch() {
		return this.reportSwitch;
	}
	public void setReportSwitch(Boolean reportSwitch) {
		this.reportSwitch = reportSwitch;
	}

}
