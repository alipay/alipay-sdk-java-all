package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报表概述信息
 *
 * @author auto create
 * @since 1.0, 2017-06-16 20:33:21
 */
public class AlisisReport extends AlipayObject {

	private static final long serialVersionUID = 2733323333835714618L;

	/**
	 * ：	
报表可过滤字段条件
	 */
	@ApiListField("conditions")
	@ApiField("report_condition")
	private List<ReportCondition> conditions;

	/**
	 * 报表描述
	 */
	@ApiField("report_desc")
	private String reportDesc;

	/**
	 * 报表名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报表唯一标识
	 */
	@ApiField("report_uk")
	private String reportUk;

	public List<ReportCondition> getConditions() {
		return this.conditions;
	}
	public void setConditions(List<ReportCondition> conditions) {
		this.conditions = conditions;
	}

	public String getReportDesc() {
		return this.reportDesc;
	}
	public void setReportDesc(String reportDesc) {
		this.reportDesc = reportDesc;
	}

	public String getReportName() {
		return this.reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getReportUk() {
		return this.reportUk;
	}
	public void setReportUk(String reportUk) {
		this.reportUk = reportUk;
	}

}
